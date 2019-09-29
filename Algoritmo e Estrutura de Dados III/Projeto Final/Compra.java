import java.io.*;
import java.util.Scanner;
import java.util.Date;

public class Compra implements Entidade{
    private int codCompra;
    private Date dataCompra;
    private float preco;

    private int codComprador;

    private char lapide;

    private byte[] bytes;
    private int tamanhoRegistro;
    private long posicaoArquivo;

    private AES crypt = new AES("ImportiertBuyKey012345Importiert");

    public Compra() throws Exception{
        this(2017, 1, 1, 0.0f, 0);
    }

    public Compra(int ano, int mes, int dia, float preco, int codComprador) throws Exception{
        this.dataCompra = new Date(ano, mes, dia);
        this.preco = preco;
        this.codComprador = codComprador;
        lapide = ' ';

        setBytes();
    }

    public String toString(){
        return "\nCódigo: " + codCompra +
               "\nCódigo comprador: " + codComprador +
               "\nData da compra:  "  + dataCompra.getDate() + "/" + dataCompra.getMonth() + "/" + dataCompra.getYear() +
               "\nPreço: "    + preco;
    }

    public void setBytes() throws Exception{
        ByteArrayOutputStream registro = new ByteArrayOutputStream();
        DataOutputStream entrada = new DataOutputStream(registro);

        entrada.writeChar(lapide);
        entrada.writeInt(codCompra);
        entrada.writeLong(dataCompra.getTime());
        entrada.writeFloat(preco);
        entrada.writeInt(codComprador);

        bytes = crypt.encrypt(registro.toByteArray());
        tamanhoRegistro = bytes.length;
    }

    public byte[] getBytes(){
        return bytes;
    }

    public void bytesToObject(byte[] dados) throws Exception{
        dados = crypt.decrypt(dados);
        ByteArrayInputStream registro = new ByteArrayInputStream(dados);
        DataInputStream entrada = new DataInputStream(registro);
        long data;

        //System.out.println(entrada.readChar());
        lapide = entrada.readChar();
        codCompra = entrada.readInt();
        data = entrada.readLong();
        dataCompra = new Date(data);
        preco = entrada.readFloat();
        codComprador = entrada.readInt();
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

    public void setLapide(){
        lapide = '*';
    }

    public char getLapide(){
        return lapide;
    }

    public void setCodigo(int codCompra) throws Exception{
        this.codCompra = codCompra;

        setBytes();
    }

    public int getCodigo(){
        return codCompra;
    }

    public void setDataCompra(Date dataCompra){
        this.dataCompra = dataCompra;
    }

    public Date getDataCompra(){
        return dataCompra;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public float getPreco(){
        return preco;
    }

    public void setCodComprador(int codComprador){
        this.codComprador = codComprador;
    }

    public float getCodComprador(){
        return codComprador;
    }

    public int compareTo( Object b ) {
        return codCompra - ((Compra)b).getCodigo();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
