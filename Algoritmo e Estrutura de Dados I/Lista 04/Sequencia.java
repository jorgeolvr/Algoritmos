import java.util.Scanner;

public class Sequencia {

Scanner scanner = new Scanner(System.in);
public int razao;
public int num;

   public static void main (String[]args){        
   
   Sequencia obj = new Sequencia();
   
   obj.getSequencia();        
   }
   
   public void getSequencia() {
    
   System.out.print("Digite a razão da sequência: ");
   razao = scanner.nextInt();
   
   System.out.print("Digite o primeiro número da sequência: ");
   num = scanner.nextInt();
   
   
   System.out.print("A sequencia é: "+ num +", ");

  
      for(int i = 0; i < 10; i++)
      {
         num = num + razao;
         System.out.print(num +", ");
      }
   } //fim main()
} //fim class
   
   