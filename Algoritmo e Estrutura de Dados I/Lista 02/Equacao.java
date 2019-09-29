import java.util.Scanner;

public class Equacao {

   public static void main (String [] args)
   {
      Scanner scanner = new Scanner(System.in); //Instaciando objeto da classe Scanner
      float a, b, c, delta = 0, sqrtdelta = 0, raiz1 = 0, raiz2 = 0; //declarando vari�veis do tipo inteiro
      double resultado = 0; //declarando vari�vel do tipo double
            
      System.out.print("Digite o primero valor: ");
      a = scanner.nextFloat(); //Recebendo o valor e atribuindo a vari�vel 'a'
      System.out.print("Digite o segundo valor: ");
      b = scanner.nextFloat(); //Recebendo o valor e atribuindo a vari�vel 'b'
      System.out.print("Digite o terceiro valor: ");
      c = scanner.nextFloat(); //Recebendo o valor e atribuindo a vari�vel 'b'
      
      if( a != 0) //verifica se o valor da vari�vel 'a' � diferente de 0
      {
         delta = (b*b) - (4*a*c);
         sqrtdelta = (float)Math.sqrt(delta);
      }
      
      if(delta>=0) //Verfica se o valor da vari�vel "delta" � igual ou maior que zero
      {
         raiz1 = ((-1)*b + sqrtdelta) / (2*a);
         raiz2 = ((-1)*b - sqrtdelta) / (2*a);
      }
      
      System.out.print("As ra�zes do delta s�o: " + raiz1 + " e " + raiz2);
         
    }//Fim da main
}//Fim da classe