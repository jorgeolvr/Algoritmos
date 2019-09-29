import java.util.Scanner;

public class Teste {

   public static void saudacao(int n) {
      if(n < 0) return;
      for(int i = 0; i < n; i++)
      {  
         System.out.println("Bom dia");
      }
   }
    
   public static void main(String[]args) {
      int num = levezes();

      saudacao(num);  
   } 
   
   public static int levezes() {
   
   Scanner scanner = new Scanner (System.in);
   
   System.out.print("Digite a quantidade de vezes: ");
   int numero = scanner.nextInt();
   
   return numero;
       
   } 

}

