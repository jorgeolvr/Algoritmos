import java.util.Scanner;

public class Calculadora {

   public static void main (String [] args)
   {
      Scanner scanner = new Scanner(System.in); //Instaciando objeto da classe Scanner
      int opcao,a ,b = 0; //declarando vari�veis do tipo inteiro
      double resultado = 0; //declarando vari�vel do tipo double
      
      System.out.println("-------------Calculadora-----------");    
      System.out.println("-1 - Soma de dois n�meros         -");
      System.out.println("-2 - Subtra��o de dois n�meros    -");
      System.out.println("-2 - Multiplica��o de dois n�meros-");
      System.out.println("-2 - Divis�o de dois n�meros      -");
      System.out.println("-----------------------------------");  
      
      System.out.print("Digite o primero valor: ");
      a = scanner.nextInt(); //Recebendo o valor e atribuindo a vari�vel 'a'
      System.out.print("Digite o segundo valor: ");
      b = scanner.nextInt(); //Recebendo o valor e atribuindo a vari�vel 'b'
      
      System.out.print("Escolha sua op��o: ");
      opcao = scanner.nextInt();
      
      switch(opcao) //switch verifica a valor da vari�vel opcao e realiza a opera��o
      {
      
         case 1: 
         {
            resultado = a+b;
            break;
         }
         case 2:
         {
            resultado = a-b;
            break;
         }
         case 3:
         {
            resultado = a*b;
            break;
         }
         case 4:
         {
            resultado = a/b;
         }
      }
      
      System.out.print("O resultado �: "+resultado);  
    }//Fim da main
}//Fim da classe