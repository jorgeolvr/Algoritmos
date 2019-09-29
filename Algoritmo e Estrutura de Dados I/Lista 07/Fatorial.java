import java.util.Scanner;

public class Fatorial {
   public static void main(String[]args) {
   
      Scanner scanner = new Scanner(System.in);
      
      boolean repeticao = true;
      char verificacao = ' ';
      
      System.out.println("Cálculo de fatorial");
   
      do {
      
      int num = getNum();
      
      int fat = fatorial(num);
      
      mensagem(num, fat);
      
      System.out.print("\nDeseja calcular outro número? (S/N): ");
      verificacao = scanner.next().charAt(0);
      verificacao = Character.toUpperCase(verificacao);
      
      if(verificacao == 'N') {
         repeticao = false;
      } //fim if
   
      } while(repeticao == true); //fim do/while   
   } //fim main()
   
   public static int getNum() {
   
      Scanner scanner = new Scanner(System.in);
   
      System.out.print("\nDigite um número: ");
      int num = scanner.nextInt();
      
      return num;
   } //fim getNum()
   
   public static int fatorial(int num) {
      
      int fat = 1;
      
      for(int i = 0; i <= num; i++) {
      
      fat *= num;
      
      num -= 1;
      
      } //fim for
      
      return fat;
   } //fim fatorial()
   
   public static void mensagem(int num, int fat) {
      
      System.out.print("O fatorial do número "+num+" é: "+fat);
   } //fim mensagem()
} //fim classe