import java.util.Scanner;

public class Divisao {
   public static void main (String[]args) {
   
   Scanner scanner = new Scanner(System.in);
   
   double result = 0;
   int cont = 0;
   double num = 1;
   double den = 2;
   
   result = num / den;
   
   do {
   
   result = result / 2;
   cont++;
   
   } while (result > 0.0001);
   
   
   System.out.print("\nO número de divisões são: "+cont);
   
   } //fim da main()
} //fim da classe