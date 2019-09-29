import java.io.*;

public class Principal {
	public static void main(String[] args) {
		RandomAccessFile arq;

		Livro c = new Livro();
		Livro c1 = new Livro(1, "Eu, Robô", "Isaac Asimov", 14.90F);
		Livro c2 = new Livro(2, "Eu Sou a Lenda", "Richard Matheson", 21.99F);

		try {
			arq = new RandomAccessFile("dados.db", "rw");
			arq.seek(arq.length());

			long p1 = arq.getFilePointer();
			System.out.println(p1);
			c1.writeObject(arq);

			long p2 = arq.getFilePointer();
			System.out.println(p2);
			c2.writeObject(arq);

			arq.seek(p2);
			c.readObject(arq);
			System.out.println(c);

			arq.seek(p1);
			c.readObject(arq);
			System.out.println(c);

			arq.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
