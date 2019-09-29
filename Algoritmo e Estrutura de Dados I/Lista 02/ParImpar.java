import java.util.Scanner;

public class ParImpar {

   public static void main (String [] args)
   {
      Scanner scanner = new Scanner(System.in); //Instaciando objeto da classe Scanner
      int numero = 0; //declarando variável do tipo inteira
      
      System.out.println("Digite um número: ");
      numero = scanner.nextInt();
      
      if(numero % 2 == 0) //Estrutura de condição verifica o valor 
      {
          System.out.println("O número é par"); //Mensagem para o usuário na tela
      }
      else
      {
          System.out.println("O número é impar");
      }
   } //Fim da main
} //Fim da classe