import java.util.Scanner; //Importando o recurso Scanner do pacote util do java

public class TipoTriangulo
{
   public static void main (String[]args)
   {
      
      double cat1 = 0, cat2 = 0, hipotenusa = 0; //Declara��o de tr�s vari�veis do tipo real
  
      Scanner scanner = new Scanner(System.in); //Instanciando o objeto da classe Scanner
      
      System.out.println("Digite o valor do primeiro cateto: ");
      cat1 = scanner.nextDouble(); //Atribui��o de valor � vari�vel 
      
      System.out.println("Digite o valor do segundo cateto: ");
      cat2 = scanner.nextDouble();
      
      System.out.println("Digite o valor da hipotenusa: ");
      hipotenusa = scanner.nextDouble();
      
      
      if (cat1 != cat2 && cat1 != hipotenusa && cat2 != hipotenusa) //Estrutura de condi��o verificando a l�gica 
      {
         System.out.println("o tri�ngulo � escaleno");
      }
      else if (cat1 == cat2 && cat1 == hipotenusa && cat2 == hipotenusa) //Condi��o l�gica de determina��o do tipo de tri�ngulo
      {
         System.out.println("o tri�ngulo � equil�tero");
      }
      else
      {
         System.out.println("o tri�ngulo � is�sceles");
      }  
   }
}
