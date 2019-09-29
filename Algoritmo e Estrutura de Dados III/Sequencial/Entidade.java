/*import java.io.*;

public interface Entidade{
    public void writeObject(RandomAccessFile arq) throws Exception;
    public void readObject(RandomAccessFile arq) throws Exception;
    public void deleteObject(RandomAccessFile arq) throws Exception;
}*/

public interface Entidade{
    public void setBytes() throws Exception;
    public byte[] getBytes();

    public void bytesToObject(byte[] dados) throws Exception;

    public void setCodigo(int codigo) throws Exception;
    public int getCodigo();

    public void setPosicaoArquivo(long pos);
    public long getPosicaoArquivo();

    public int getTamanhoRegistro();
}
