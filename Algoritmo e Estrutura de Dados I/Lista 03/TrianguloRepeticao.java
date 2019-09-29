import java.util.Scanner;

public class TrianguloRepeticao {

   public static void main (String [] args)
   {
      Scanner scanner = new Scanner(System.in); //Instaciando objeto da classe Scanner
      double cat1 = 0, cat2 = 0, hipotenusa = 0; //declarando variáveis do tipo double
      boolean repeticao = true; 

      do {
      System.out.print("\nDigite o valor do primeiro cateto: "); 
      cat1 = scanner.nextDouble(); //Recebendo o valor do cateto digitado pelo usuário
      
      System.out.print("Digite o valor do segundo cateto: ");
      cat2 = scanner.nextDouble(); //Recebendo o valor do cateto digitado pelo usuário

      System.out.print("Digite o valor da hipotenusa: ");
      hipotenusa = scanner.nextDouble(); //Recebendo o valor da hipotenusa digitado pelo usuário
      
      if(cat1 + cat2 > hipotenusa && cat2 + hipotenusa > cat1 && cat1 + hipotenusa > cat2) //Verificando se os números satisfazem a condição para ser triângulo
      {
         System.out.print("Esses valores correspondem a um triângulo");
         repeticao = true;
         
         if (cat1 != cat2 && cat1 != hipotenusa && cat2 != hipotenusa) //Estrutura de condição verificando a lógica 
         {
           System.out.print(" e seu tipo é escaleno");
         }
         else if (cat1 == cat2 && cat1 == hipotenusa && cat2 == hipotenusa) //Condição lógica de determinação do tipo de triângulo
         {
            System.out.print(" e seu tipo é equilátero");
         }
         else
         {
            System.out.print(" e seu tipo é isósceles");
         }    
      }   
      else
      {
         System.out.println("Não é um triângulo, use outros valores ");
         repeticao = false;
      }
      }while ( repeticao == false);
   }//Fim da main
}//Fim da classe

         
      