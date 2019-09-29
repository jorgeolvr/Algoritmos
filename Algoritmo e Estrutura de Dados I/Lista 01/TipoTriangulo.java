import java.util.Scanner; //Importando o recurso Scanner do pacote util do java

public class TipoTriangulo
{
   public static void main (String[]args)
   {
      
      double cat1 = 0, cat2 = 0, hipotenusa = 0; //Declaração de três variáveis do tipo real
  
      Scanner scanner = new Scanner(System.in); //Instanciando o objeto da classe Scanner
      
      System.out.println("Digite o valor do primeiro cateto: ");
      cat1 = scanner.nextDouble(); //Atribuição de valor à variável 
      
      System.out.println("Digite o valor do segundo cateto: ");
      cat2 = scanner.nextDouble();
      
      System.out.println("Digite o valor da hipotenusa: ");
      hipotenusa = scanner.nextDouble();
      
      
      if (cat1 != cat2 && cat1 != hipotenusa && cat2 != hipotenusa) //Estrutura de condição verificando a lógica 
      {
         System.out.println("o triângulo é escaleno");
      }
      else if (cat1 == cat2 && cat1 == hipotenusa && cat2 == hipotenusa) //Condição lógica de determinação do tipo de triângulo
      {
         System.out.println("o triângulo é equilátero");
      }
      else
      {
         System.out.println("o triângulo é isósceles");
      }  
   }
}
