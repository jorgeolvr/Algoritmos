import java.util.Scanner; //Importando o recurso Scanner do pacote util do java

public class Hipotenusa
{
   public static void main (String[]args)
   {
      double cat1, cat2, hipotenusa; //Declaração de três variáveis do tipo real
      
      Scanner scanner = new Scanner(System.in); //Instanciando um objeto da classe Scanner
      
      System.out.println("Digite o valor do primeiro cateto");
      cat1 = scanner.nextDouble(); //Variável recebendo valor referente ao cateto
      
      System.out.println("Digite o valor do segundo cateto");
      cat2 = scanner.nextDouble(); //Variável recebendo o valor do segundo cateto
      
      hipotenusa = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2)); //Cálculo referente ao teorema de pitágoras
      
      System.out.println("O valor da hipotenusa é: " +hipotenusa); //Mostra ao usuário o valor da hipotenusa
   }
}