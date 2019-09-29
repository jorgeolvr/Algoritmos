import java.io.*;

public class Livro {
	private int codigo;
	private String titulo;
	private String autor;
	private float preco;

	public Livro() {
		codigo = 0;
		titulo = "";
		autor = "";
		preco = 0F;
	}

	public Livro(int codigo, String titulo, String autor, float preco) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco; 
	}

	public String toString() {
		return "\nCódigo..: " + codigo +
			   "\nTítulo..: " + titulo +
			   "\nAutor...: " + autor +
			   "\nPreço...: " + preco;
	}

	protected void writeObject(RandomAccessFile arq) throws IOException {
		ByteArrayOutputStream registro = new ByteArrayOutputStream();
		DataOutputStream saida = new DataOutputStream(registro);

		saida.writeInt(codigo);
		saida.writeUTF(titulo);
		saida.writeUTF(autor);
		saida.writeFloat(preco);

		arq.writeShort(saida.size());
		arq.write(registro.toByteArray());
	}

	protected void readObject(RandomAccessFile arq) throws IOException {
		int tamanho = arq.readShort();
		byte[] ba = new byte[tamanho];

		if(arq.read(ba) != tamanho) {
			throw new IOException("Inconsistência nos dados");
		}

		ByteArrayInputStream registro = new ByteArrayInputStream(ba);
		DataInputStream entrada = new DataInputStream(registro);

		codigo = entrada.readInt();
		titulo = entrada.readUTF();
		autor = entrada.readUTF();
		preco = entrada.readFloat();
	}
}