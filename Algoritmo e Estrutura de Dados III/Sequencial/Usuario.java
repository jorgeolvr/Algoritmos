import java.io.*;
import java.util.Scanner;
import java.util.Date;

/*public class Usuario implements Entidade{
    private int codUsuario;
    private String nome;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String endereco;

    public Usuario(){
        this("", 2017, 1, 1, "", "", "");
    }

    public Usuario(String nome, int ano, int mes, int dia, String telefone, String email, String endereco){
        this.nome = nome;
        this.dataNascimento = new Date(ano, mes, dia);
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String toString(){
        return "\nCódigo: "+ codUsuario +
               "\nNome: "  + nome +
        obj.writeObject(arq);
               "\nData de Nascimento:  "  + dataNascimento.getDate() + "/" + dataNascimento.getMonth() + "/" + dataNascimento.getYear() +
               "\nTelefone: "    + telefone +
               "\nEmail: " + email +
               "\nEndereco: " + endereco;
    }

    public void writeObject(RandomAccessFile arq) throws Exception{
        ByteArrayOutputStream registro = new ByteArrayOutputStream();
        DataOutputStream entrada = new DataOutputStream(registro);

        arq.seek(0);
        int ultimoCod = arq.readInt();
        codUsuario = ultimoCod + 1;

        arq.seek(arq.length());
        entrada.writeChar(' ');
        entrada.writeInt(ultimoCod + 1);
        entrada.writeUTF(nome);
        entrada.writeLong(dataNascimento.getTime());
        entrada.writeUTF(telefone);
        entrada.writeUTF(email);
        entrada.writeUTF(endereco);

        arq.writeInt(entrada.size());
        arq.write(registro.toByteArray());

        arq.seek(0);
        arq.writeInt(ultimoCod + 1);
        ultimoCod++;
    }

    public void readObject(RandomAccessFile arq) throws Exception{
        //System.out.println(arq.readInt());
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

                ByteArrayInputStream registro = new ByteArrayInputStream(array);
                DataInputStream entrada = new DataInputStream(registro);
                long data;

                //System.out.println(entrada.readChar());
                entrada.readChar();
                codUsuario = entrada.readInt();
                nome = entrada.readUTF();
                data = entrada.readLong();
                dataNascimento = new Date(data);
                telefone = entrada.readUTF();
                email = entrada.readUTF();
                endereco = entrada.readUTF();

                System.out.println(this);
            }else{
                arq.seek(pos);
                arq.seek(arq.getFilePointer() + tamanho);
            }
        }
    }

    public void deleteObject(RandomAccessFile arq) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite o codigo que sera deletado: ");
        int cod = sc.nextInt();

        arq.seek(4);

        boolean achou = false;
        while(!achou && arq.getFilePointer() != arq.length()){
            int tamanho = arq.readInt();
            byte[] array = new byte[tamanho];

            if(arq.read(array) != tamanho) {
                throw new IOException("Inconsistência nos dados");
            }

            arq.seek(arq.getFilePointer() - tamanho);

            ByteArrayInputStream registroin = new ByteArrayInputStream(array);
            DataInputStream entrada = new DataInputStream(registroin);
            ByteArrayOutputStream registroout = new ByteArrayOutputStream();
            DataOutputStream saida = new DataOutputStream(registroout);

            long pos = arq.getFilePointer();

            if(entrada.readChar() != '*' && entrada.readInt() == cod){
                achou = true;
                long data;

                codUsuario = cod;
                nome = entrada.readUTF();
                data = entrada.readLong();
                dataNascimento = new Date(data);
                telefone = entrada.readUTF();
                email = entrada.readUTF();
                endereco = entrada.readUTF();
                System.out.println(this);

                int confirmacao;1
                System.out.print("\nRealmente deseja excluir esse registro (1 - Sim / 2 - Não): ");
                confirmacao = sc.nextInt();

                if(confirmacao == 1){
                    arq.seek(pos);
                    saida.writeChar('*');
                    arq.write(registroout.toByteArray());
                }
            }else{
                arq.seek(pos);
                arq.seek(arq.getFilePointer() + tamanho);
            }
        }

        if(!achou){
            System.out.println("Registro não encontrado!");
        }
    }
}*/

public class Usuario implements Entidade{
    private int codUsuario;
    private String nome;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String endereco;

    private byte[] bytes;
    private int tamanhoRegistro;
    private long posicaoArquivo;

    public Usuario() throws Exception{
        this("", 2017, 1, 1, "", "", "");
    }

    public Usuario(String nome, int ano, int mes, int dia, String telefone, String email, String endereco) throws Exception{
        this.nome = nome;
        this.dataNascimento = new Date(ano, mes, dia);
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;

        setBytes();
    }

    public String toString(){
        return "\nCódigo: "+ codUsuario +
               "\nNome: "  + nome +
               "\nData de Nascimento:  "  + dataNascimento.getDate() + "/" + dataNascimento.getMonth() + "/" + dataNascimento.getYear() +
               "\nTelefone: "    + telefone +
               "\nEmail: " + email +
               "\nEndereco: " + endereco;
    }

    public void setBytes() throws Exception{
        ByteArrayOutputStream registro = new ByteArrayOutputStream();
        DataOutputStream entrada = new DataOutputStream(registro);

        entrada.writeChar(' ');
        entrada.writeInt(codUsuario);
        entrada.writeUTF(nome);
        entrada.writeLong(dataNascimento.getTime());
        entrada.writeUTF(telefone);
        entrada.writeUTF(email);
        entrada.writeUTF(endereco);

        tamanhoRegistro = entrada.size();

        bytes = registro.toByteArray();
    }

    public byte[] getBytes(){
        return bytes;
    }

    public void bytesToObject(byte[] dados) throws Exception{
        ByteArrayInputStream registro = new ByteArrayInputStream(dados);
        DataInputStream entrada = new DataInputStream(registro);
        long data;

        //System.out.println(entrada.readChar());
        entrada.readChar();
        codUsuario = entrada.readInt();
        nome = entrada.readUTF();
        data = entrada.readLong();
        dataNascimento = new Date(data);
        telefone = entrada.readUTF();
        email = entrada.readUTF();
        endereco = entrada.readUTF();
    }

    public int getTamanhoRegistro(){
        return tamanhoRegistro;
    }

    public void setPosicaoArquivo(long posicaoArquivo){
        this.posicaoArquivo = posicaoArquivo;
    }

    public long getPosicaoArquivo(){
        return posicaoArquivo;
    }

    public void setCodigo(int codUsuario) throws Exception{
        this.codUsuario = codUsuario;

        setBytes();
    }

    public int getCodigo(){
        return codUsuario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento(){
        return dataNascimento;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }
}
