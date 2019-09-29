import java.util.Scanner;

public class Soma {
   public static void main (String[]args) {
   
   Scanner scanner = new Scanner(System.in);
   
   int somatorio = 0;
   int num = 0, num2 = 0;
   
   System.out.print("Digite o número: ");
   num = scanner.nextInt();
   
   System.out.print("Digite o segundo número: ");
   num2 = scanner.nextInt();
   
   if(num > num2)
   {
      System.out.print("Valores inválidos ");
   }
   else
   {
      for (int i=0; i < num2; i++)
      {
         somatorio = num + somatorio;
         num++;
      }
   }
   
   System.out.print("\nO valor da soma dos números inteiros é: "+somatorio);
   } //fim da main()
} //fim da classe