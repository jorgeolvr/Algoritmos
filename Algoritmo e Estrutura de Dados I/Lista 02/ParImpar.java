import java.util.Scanner;

public class ParImpar {

   public static void main (String [] args)
   {
      Scanner scanner = new Scanner(System.in); //Instaciando objeto da classe Scanner
      int numero = 0; //declarando vari�vel do tipo inteira
      
      System.out.println("Digite um n�mero: ");
      numero = scanner.nextInt();
      
      if(numero % 2 == 0) //Estrutura de condi��o verifica o valor 
      {
          System.out.println("O n�mero � par"); //Mensagem para o usu�rio na tela
      }
      else
      {
          System.out.println("O n�mero � impar");
      }
   } //Fim da main
} //Fim da classe