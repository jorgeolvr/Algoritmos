import java.util.Scanner; //Importando o recurso Scanner do pacote util do java

public class Graus
{
   public static void main (String[]args)
   {
      double celsius, farenheit; //Declara��o de duas vari�veis reais 
      
      Scanner scanner = new Scanner(System.in); //Instanciando objeto da classe Scanner
      
      System.out.println("Digite a temperatura em farenheit: ");
      farenheit = scanner.nextDouble(); //Atribuindo o valor da temperatura � vari�vel farenheit
      
      celsius = (farenheit - 32) * 5.0/9.0; //C�lculo de convers�o da temperatura para celsius
      
      System.out.println("A temperatura em celsius �: " +celsius); //Recurso System.out mostrando na tela do usu�rio o resultado da convers�o
      
      
   }
}
