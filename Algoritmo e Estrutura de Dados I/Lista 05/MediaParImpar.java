import java.util.Scanner;

public class MediaParImpar {
   public static void main (String[]args) {
   
   Scanner scanner = new Scanner(System.in);
   
   int num_par = 0;
   int num_impar = 0;
   int num = 0;
   int media_par = 0;
   int media_impar = 0;
   int cont = 0;

   do { 
   System.out.print("Digite o n�mero par ou impar: ");
   num = scanner.nextInt();
   cont++;

   if(num % 2 == 0)
   {
   num_par = num;
   }
   else
   {
   num_impar = num;
   }
   } while(num != 0);
   
   if(num == 0)
   {
   System.out.print("Programa finalizado");
   }
   
   media_par = num_par/cont;
   media_impar = num_impar/cont;
 
   System.out.print("A m�dia dos valores pares �: "+media_par);
   System.out.print("A m�dia dos valores impares �: "+media_impar);
   
   } //fim da main()
} //fim da classe