import java.io.*;

public class Principal {
	public static void main(String[] args) {
		RandomAccessFile arq;

		Boletim boletim = new Boletim();
		Boletim aluno1 = new Boletim(1, "559855", "Jorge Oliveira", "AED", 20.5F);
    Boletim aluno2 = new Boletim(2, "559816", "João Silva", "AC2", 18.9F);

		try {
			arq = new RandomAccessFile("dados.db", "rw");
			arq.seek(arq.length());

			long pos1 = arq.getFilePointer();
			System.out.println(pos1);
			aluno1.writeObject(arq);

			long pos2 = arq.getFilePointer();
			System.out.println(pos2);
			aluno2.writeObject(arq);

			arq.seek(pos2);
			boletim.readObject(arq);
			System.out.println(boletim);

			arq.seek(pos1);
			boletim.readObject(arq);
			System.out.println(boletim);

			arq.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
