import java.io.*;
import java.util.Scanner;

/*public class Arquivo<T extends Entidade>{
    protected T obj;
    RandomAccessFile arq;

    public Arquivo(String nome) throws Exception{
        arq = new RandomAccessFile(nome, "rw");
        if(arq.length() == 0){
            arq.writeInt(0);
        }
    }

    public void incluir(T obj) throws Exception{
        obj.writeObject(arq);
    }

    public void deletar(T obj) throws Exception{
        obj.deleteObject(arq);
    }

    public void listar(T obj) throws Exception{
        arq.seek(0);
        obj.readObject(arq);
    }
}*/

public class Arquivo<T extends Entidade>{
    protected T obj;
    RandomAccessFile arq;

    public Arquivo(String nome) throws Exception{
        arq = new RandomAccessFile(nome, "rw");
        if(arq.length() == 0){
            arq.writeInt(0);
        }
    }

    public void incluir(T obj) throws Exception{
        arq.seek(0);
        int ultimoCod = arq.readInt();
        arq.seek(arq.length());

        obj.setCodigo(ultimoCod + 1);

        byte[] dados = obj.getBytes();
        int tamanhoRegistro = obj.getTamanhoRegistro();

        arq.writeInt(tamanhoRegistro);
        arq.write(dados);

        arq.seek(0);
        arq.writeInt(ultimoCod + 1);
    }

    public T busca(int codigo, T obj) throws Exception{
        arq.seek(4);

        boolean achou = false;
        while(arq.getFilePointer() != arq.length() && !achou){
            int tamanho = arq.readInt();
            byte[] array = new byte[tamanho];

            long pos = arq.getFilePointer();

            if(arq.readChar() != '*'){
                arq.seek(pos);

                if(arq.read(array) != tamanho){
                    throw new IOException("Inconsistência nos dados");
                }

                obj.bytesToObject(array);

                if(obj.getCodigo() == codigo){
                    achou = true;
                    obj.setPosicaoArquivo(pos);
                }
            }else{
                arq.seek(pos);
                arq.seek(arq.getFilePointer() + tamanho);
            }
        }

        if(!achou){
            obj = null;
        }

        return obj;
    }

    public void deletar(T obj) throws Exception{
        arq.seek(4);
        ByteArrayOutputStream registro = new ByteArrayOutputStream();
        DataOutputStream saida = new DataOutputStream(registro);

        arq.seek(obj.getPosicaoArquivo());
        saida.writeChar('*');
        arq.write(registro.toByteArray());
    }

    public void alterar(T obj) throws Exception{
        arq.seek(obj.getPosicaoArquivo() - 4);
        int tamanhoAntigo = arq.readInt();

        if(obj.getTamanhoRegistro() > tamanhoAntigo){
            ByteArrayOutputStream registro = new ByteArrayOutputStream();
            DataOutputStream saida = new DataOutputStream(registro);

            arq.seek(obj.getPosicaoArquivo());
            saida.writeChar('*');
            arq.write(registro.toByteArray());

            arq.seek(obj.getPosicaoArquivo() + tamanhoAntigo);

            RandomAccessFile arqTemp = new RandomAccessFile("arqTemp.db", "rw");
            arqTemp.seek(0);

            while(arq.getFilePointer() != arq.length()){
                arqTemp.write(arq.read());
            }

            arq.seek(obj.getPosicaoArquivo() - 4);
            int tamanhoRegistro = obj.getTamanhoRegistro();

            arq.writeInt(tamanhoRegistro);
            arq.write(obj.getBytes());

            arqTemp.seek(0);
            while(arqTemp.getFilePointer() != arqTemp.length()){
                arq.write(arqTemp.read());
            }

            File deletarArquivo = new File("arqTemp.db");
            deletarArquivo.delete();
        }else{
            arq.seek(obj.getPosicaoArquivo());
            arq.write(obj.getBytes());
        }
    }

    public void listar(T obj) throws Exception{
        arq.seek(4);

        while(arq.getFilePointer() != arq.length()){
            int tamanho = arq.readInt();
            byte[] array = new byte[tamanho];

            long pos = arq.getFilePointer();
            if(arq.readChar() != '*'){
                arq.seek(pos);

                if(arq.read(array) != tamanho) {
                    throw new IOException("Inconsistência nos dados");
                }

                obj.bytesToObject(array);

                System.out.println(obj);
            }else{
                arq.seek(pos);
                arq.seek(arq.getFilePointer() + tamanho);
            }
        }
    }
}
