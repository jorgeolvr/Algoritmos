import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo {
   public static void main(String[]args) {
      File arquivo = new File("TESTE.DAT");
      
      try {
         if(arquivo.createNewFile()) {
            System.out.println("O arquivo foi criado");
         }
         else {
            System.out.println("Arquivo existente");
         }
      }
      catch(IOException ex) {
         System.out.print(ex);
      }
   
      try(FileWriter fw = new FileWriter(arquivo)) {
         fw.write("1\r\n");
         fw.write("2\r\n");
         fw.write("3\r\n");
         fw.write("4\r\n");
         fw.write("7\r\n");
         fw.write("8\r\n");
         fw.write("9\r\n");
         fw.flush();
      }
      catch(IOException ex) {
         ex.printStackTrace();
      }
      
      try(FileReader fr = new FileReader(arquivo) ){
         int c = fr.read();
         while(c!=-1) {
            if(c % 2 == 0) {
               System.out.print((char)c);
            }
            c = fr.read();
         }
      }
      catch(IOException ex) {
         ex.printStackTrace();
      }
   }
}