public interface Entidade extends Comparable, Cloneable {
    public void setBytes() throws Exception;
    public byte[] getBytes();

    public void bytesToObject(byte[] dados) throws Exception;

    public void setLapide();
    public char getLapide();

    public void setCodigo(int codigo) throws Exception;
    public int getCodigo();

    public void setPosicaoArquivo(long pos);
    public long getPosicaoArquivo();

    public int getTamanhoRegistro();

    public int compareTo(Object T);
    public Object clone() throws CloneNotSupportedException;
}
