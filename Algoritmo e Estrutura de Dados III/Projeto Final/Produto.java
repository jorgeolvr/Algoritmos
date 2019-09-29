import java.io.*;

public class Produto implements Entidade{
    private int codProduto;
    private String nome;
    private String descricao;
    private String cor;
    private float preco;
    private char lapide;

    private byte[] bytes;
    private int tamanhoRegistro;
    private long posicaoArquivo;

    private AES crypt = new AES("ImportiertProductKey01234567Impo");

    public Produto() throws Exception{
        this(0, "", "", "", 0.00f);
    }

    public Produto(String nome, String descricao, String cor, float preco) throws Exception{
        this.nome = nome;
        this.descricao = descricao;
        this.cor = cor;
        this.preco = preco;
        lapide = ' ';

        setBytes();
    }

    public Produto(int codProduto, String nome, String descricao, String cor, float preco) throws Exception{
        this.codProduto = codProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.cor = cor;
        this.preco = preco;
        lapide = ' ';

        setBytes();
    }

    public String toString(){
        return "\nCódigo: "+ codProduto +
               "\nNome: "  + nome +
               "\nDescriçao: "    + descricao +
               "\nCor: " + cor +
               "\nPreço: " + preco;
    }

    public void setBytes() throws Exception{
        ByteArrayOutputStream registro = new ByteArrayOutputStream();
        DataOutputStream entrada = new DataOutputStream(registro);

        entrada.writeChar(lapide);
        entrada.writeInt(codProduto);
        entrada.writeUTF(nome);
        entrada.writeUTF(descricao);
        entrada.writeUTF(cor);
        entrada.writeFloat(preco);

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
        codProduto = entrada.readInt();
        nome = entrada.readUTF();
        descricao = entrada.readUTF();
        cor = entrada.readUTF();
        preco = entrada.readFloat();
    }

    public int getTamanhoRegistro(){
        return tamanhoRegistro;
    }

    public void setPosicaoArquivo(long posicaoArquivo){
        this.posicaoArquivo = posicaoArquivo;
    }

    public void setLapide(){
        lapide = '*';
    }

    public char getLapide(){
        return lapide;
    }

    public long getPosicaoArquivo(){
        return posicaoArquivo;
    }

    public void setCodigo(int codProduto) throws Exception{
        this.codProduto = codProduto;

        setBytes();
    }

    public int getCodigo(){
        return codProduto;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public float getPreco(){
        return preco;
    }

    public int compareTo( Object b ) {
        return codProduto - ((Produto)b).getCodigo();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
