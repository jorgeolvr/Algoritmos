import java.io.*;

public class Boletim {
	private int codigo;
	private String matricula;
	private String nome;
  private String materia;
	private float nota;

	public Boletim() {
		codigo = 0;
		matricula = "";
		nome = "";
    materia = "";
		nota = 0F;
	}

	public Boletim(int codigo, String matricula, String nome, String materia, float nota) {
		this.codigo = codigo;
		this.matricula = matricula;
		this.nome = nome;
    this.materia = materia;
		this.nota = nota;
	}

	public String toString() {
		return "\nCódigo........: " + codigo +
			     "\nMatrícula.....: " + matricula +
			     "\nNome do Aluno.: " + nome +
			     "\nMatéria.......: " + materia +
           "\nNota..........: " + nota;
	}

	protected void writeObject(RandomAccessFile arq) throws IOException {
		ByteArrayOutputStream registro = new ByteArrayOutputStream();
		DataOutputStream saida = new DataOutputStream(registro);

		saida.writeInt(codigo);
		saida.writeUTF(matricula);
		saida.writeUTF(nome);
    saida.writeUTF(materia);
		saida.writeFloat(nota);

		arq.writeShort(saida.size());
		arq.write(registro.toByteArray());
	}

	protected void readObject(RandomAccessFile arq) throws IOException {
		int tamanho = arq.readShort();
		byte[] array = new byte[tamanho];

		if(arq.read(array) != tamanho) {
			throw new IOException("Inconsistência nos dados");
		}

		ByteArrayInputStream registro = new ByteArrayInputStream(array);
		DataInputStream entrada = new DataInputStream(registro);

		codigo = entrada.readInt();
		matricula = entrada.readUTF();
		nome = entrada.readUTF();
    materia = entrada.readUTF();
		nota = entrada.readFloat();
	}
}
