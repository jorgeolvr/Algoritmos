import java.util.Scanner; //Importando o recurso Scanner do pacote util do java

public class Hipotenusa
{
   public static void main (String[]args)
   {
      double cat1, cat2, hipotenusa; //Declara��o de tr�s vari�veis do tipo real
      
      Scanner scanner = new Scanner(System.in); //Instanciando um objeto da classe Scanner
      
      System.out.println("Digite o valor do primeiro cateto");
      cat1 = scanner.nextDouble(); //Vari�vel recebendo valor referente ao cateto
      
      System.out.println("Digite o valor do segundo cateto");
      cat2 = scanner.nextDouble(); //Vari�vel recebendo o valor do segundo cateto
      
      hipotenusa = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2)); //C�lculo referente ao teorema de pit�goras
      
      System.out.println("O valor da hipotenusa �: " +hipotenusa); //Mostra ao usu�rio o valor da hipotenusa
   }
}