import java.util.Scanner;

public class Triangulo {

   public static void main (String [] args)
   {
      Scanner scanner = new Scanner(System.in); //Instaciando objeto da classe Scanner
      double a, b, c = 0; //declarando variáveis do tipo double
      
      System.out.println("Digite o valor do primeiro cateto: "); 
      a = scanner.nextDouble(); //Recebendo o valor do cateto digitado pelo usuário
      
      System.out.println("Digite o valor do segundo cateto: ");
      b = scanner.nextDouble(); //Recebendo o valor do cateto digitado pelo usuário

      System.out.println("Digite o valor da hipotenusa: ");
      c = scanner.nextDouble(); //Recebendo o valor da hipotenusa digitado pelo usuário

      if( a+b > c && b+c > a && a+c > b) //Verificando se os números satisfazem a condição para ser triângulo
      {
         System.out.println("Esses valores correspondem a um triângulo ");
      }
      else
      {
         System.out.println("Não é um triângulo ");
      }
   }//Fim da main
}//Fim da classe