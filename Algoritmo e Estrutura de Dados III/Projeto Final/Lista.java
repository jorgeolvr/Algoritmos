import java.io.*;
import java.util.*;

public class Lista{
    private RandomAccessFile arquivo;

    public Lista() throws Exception{
        arquivo = new RandomAccessFile("Lista.db", "rw");
    }

    public void add(int codCompra, int codProduto) throws Exception{
        arquivo.seek(arquivo.length());
        arquivo.writeInt(codCompra);
        arquivo.writeInt(codProduto);
    }

    public Object[] getProdutos(int codCompra) throws Exception{
        ArrayList<Integer> lista = new ArrayList<Integer>();
        arquivo.seek(0);

        while(arquivo.getFilePointer() != arquivo.length()){
            if(arquivo.readInt() == codCompra){
                lista.add(arquivo.readInt());
            }else{
                arquivo.readInt();
            }
        }

        Object[] res = lista.toArray();
        return res;
    }
}
