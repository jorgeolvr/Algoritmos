import java.util.Scanner;

public class Segundos {

   public static void main(String[]args) {
   
   System.out.println("Minutos para segundos\n");
   
   int seg = getTempo();
   
   mensagem(seg);
   
   } //fim main()
   
   public static int getTempo() {
   
   Scanner scanner = new Scanner(System.in);
   
   System.out.print("Digite o tempo em minutos: ");
   int min = scanner.nextInt();
   
   int tempo = min * 60;
   
   return tempo;
   
   } //fim getTempo
   
   public static void mensagem(int seg) {
   
    System.out.println("O tempo em segundos é: "+seg);
   
   } //fim mensagem()
} //fim classe