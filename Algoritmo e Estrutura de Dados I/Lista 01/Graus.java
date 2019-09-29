import java.util.Scanner; //Importando o recurso Scanner do pacote util do java

public class Graus
{
   public static void main (String[]args)
   {
      double celsius, farenheit; //Declaração de duas variáveis reais 
      
      Scanner scanner = new Scanner(System.in); //Instanciando objeto da classe Scanner
      
      System.out.println("Digite a temperatura em farenheit: ");
      farenheit = scanner.nextDouble(); //Atribuindo o valor da temperatura à variável farenheit
      
      celsius = (farenheit - 32) * 5.0/9.0; //Cálculo de conversão da temperatura para celsius
      
      System.out.println("A temperatura em celsius é: " +celsius); //Recurso System.out mostrando na tela do usuário o resultado da conversão
      
      
   }
}
