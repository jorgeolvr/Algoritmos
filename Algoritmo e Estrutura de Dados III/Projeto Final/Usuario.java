import java.io.*;
import java.util.Scanner;
import java.util.Date;

public class Usuario implements Entidade{
    private int codUsuario;
    private String nome;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String endereco;
    private char lapide;

    private byte[] bytes;
    private int tamanhoRegistro;
    private long posicaoArquivo;

    private AES crypt = new AES("ImportiertUsersKey01234567Import");

    public Usuario() throws Exception{
        this("", 2017, 1, 1, "", "", "");
    }

    public Usuario(String nome, int ano, int mes, int dia, String telefone, String email, String endereco) throws Exception{
        this.nome = nome;
        this.dataNascimento = new Date(ano, mes, dia);
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        lapide = ' ';

        setBytes();
    }

    public Usuario(int codUsuario, String nome, long data, String telefone, String email, String endereco) throws Exception{
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.dataNascimento = new Date(data);
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        lapide = ' ';

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

        entrada.writeChar(lapide);
        entrada.writeInt(codUsuario);
        entrada.writeUTF(nome);
        entrada.writeLong(dataNascimento.getTime());
        entrada.writeUTF(telefone);
        entrada.writeUTF(email);
        entrada.writeUTF(endereco);

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

    public void setLapide(){
        lapide = '*';
    }

    public char getLapide(){
        return lapide;
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

    public int compareTo( Object b ) {
        return codUsuario - ((Usuario)b).getCodigo();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
