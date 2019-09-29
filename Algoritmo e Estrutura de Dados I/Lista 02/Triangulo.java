import java.util.Scanner;

public class Triangulo {

   public static void main (String [] args)
   {
      Scanner scanner = new Scanner(System.in); //Instaciando objeto da classe Scanner
      double a, b, c = 0; //declarando vari�veis do tipo double
      
      System.out.println("Digite o valor do primeiro cateto: "); 
      a = scanner.nextDouble(); //Recebendo o valor do cateto digitado pelo usu�rio
      
      System.out.println("Digite o valor do segundo cateto: ");
      b = scanner.nextDouble(); //Recebendo o valor do cateto digitado pelo usu�rio

      System.out.println("Digite o valor da hipotenusa: ");
      c = scanner.nextDouble(); //Recebendo o valor da hipotenusa digitado pelo usu�rio

      if( a+b > c && b+c > a && a+c > b) //Verificando se os n�meros satisfazem a condi��o para ser tri�ngulo
      {
         System.out.println("Esses valores correspondem a um tri�ngulo ");
      }
      else
      {
         System.out.println("N�o � um tri�ngulo ");
      }
   }//Fim da main
}//Fim da classe