import java.util.Scanner;

public class Somatorio {
   public static void main (String[]args) {
   
   Scanner scanner = new Scanner(System.in);
   
   double somatorio = 0.0, num = 1, den = 5;
   int termo;
   
   System.out.print("Digite o n�mero de termos: ");
   termo = scanner.nextInt();
   
   for (int i=0; i < termo; i++)
   {
      somatorio = (num / den) + somatorio;
      den+=2;  
   }
   
   System.out.print("\nO valor do somat�rio �: "+somatorio);
   } //fim da main()
} //fim da classe