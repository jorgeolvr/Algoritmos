import java.util.Scanner;

public class SomaDeNumeros
{
   public static void main (String [] args)
   {
      Scanner scanner = new Scanner(System.in);
   
      double num1 = 0;
      double soma = 0;
      double num2 = 0;
   
      System.out.print("Digite o primeiro n�mero: "); //Mostra na tela a mensagem
      num1 = scanner.nextDouble();
   
      System.out.println("Digite o segundo n�mero: ");
      num2 = scanner.nextDouble();
      
      soma = num1 + num2;
      
      
      System.out.println("A soma do n�mero �: "+soma);
            
    
   }
}