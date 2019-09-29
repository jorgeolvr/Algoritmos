import java.util.Scanner;

public class TrianguloRepeticao {

   public static void main (String [] args)
   {
      Scanner scanner = new Scanner(System.in); //Instaciando objeto da classe Scanner
      double cat1 = 0, cat2 = 0, hipotenusa = 0; //declarando vari�veis do tipo double
      boolean repeticao = true; 

      do {
      System.out.print("\nDigite o valor do primeiro cateto: "); 
      cat1 = scanner.nextDouble(); //Recebendo o valor do cateto digitado pelo usu�rio
      
      System.out.print("Digite o valor do segundo cateto: ");
      cat2 = scanner.nextDouble(); //Recebendo o valor do cateto digitado pelo usu�rio

      System.out.print("Digite o valor da hipotenusa: ");
      hipotenusa = scanner.nextDouble(); //Recebendo o valor da hipotenusa digitado pelo usu�rio
      
      if(cat1 + cat2 > hipotenusa && cat2 + hipotenusa > cat1 && cat1 + hipotenusa > cat2) //Verificando se os n�meros satisfazem a condi��o para ser tri�ngulo
      {
         System.out.print("Esses valores correspondem a um tri�ngulo");
         repeticao = true;
         
         if (cat1 != cat2 && cat1 != hipotenusa && cat2 != hipotenusa) //Estrutura de condi��o verificando a l�gica 
         {
           System.out.print(" e seu tipo � escaleno");
         }
         else if (cat1 == cat2 && cat1 == hipotenusa && cat2 == hipotenusa) //Condi��o l�gica de determina��o do tipo de tri�ngulo
         {
            System.out.print(" e seu tipo � equil�tero");
         }
         else
         {
            System.out.print(" e seu tipo � is�sceles");
         }    
      }   
      else
      {
         System.out.println("N�o � um tri�ngulo, use outros valores ");
         repeticao = false;
      }
      }while ( repeticao == false);
   }//Fim da main
}//Fim da classe

         
      