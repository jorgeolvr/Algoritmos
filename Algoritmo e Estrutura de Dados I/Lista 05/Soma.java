import java.util.Scanner;

public class Soma {
   public static void main (String[]args) {
   
   Scanner scanner = new Scanner(System.in);
   
   int somatorio = 0;
   int num = 0, num2 = 0;
   
   System.out.print("Digite o n�mero: ");
   num = scanner.nextInt();
   
   System.out.print("Digite o segundo n�mero: ");
   num2 = scanner.nextInt();
   
   if(num > num2)
   {
      System.out.print("Valores inv�lidos ");
   }
   else
   {
      for (int i=0; i < num2; i++)
      {
         somatorio = num + somatorio;
         num++;
      }
   }
   
   System.out.print("\nO valor da soma dos n�meros inteiros �: "+somatorio);
   } //fim da main()
} //fim da classe