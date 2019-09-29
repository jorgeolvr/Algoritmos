import java.util.Scanner;

public class Calculadora {

   public static void main (String [] args)
   {
      Scanner scanner = new Scanner(System.in); //Instaciando objeto da classe Scanner
      int opcao,a ,b = 0; //declarando variáveis do tipo inteiro
      double resultado = 0; //declarando variável do tipo double
      
      System.out.println("-------------Calculadora-----------");    
      System.out.println("-1 - Soma de dois números         -");
      System.out.println("-2 - Subtração de dois números    -");
      System.out.println("-2 - Multiplicação de dois números-");
      System.out.println("-2 - Divisão de dois números      -");
      System.out.println("-----------------------------------");  
      
      System.out.print("Digite o primero valor: ");
      a = scanner.nextInt(); //Recebendo o valor e atribuindo a variável 'a'
      System.out.print("Digite o segundo valor: ");
      b = scanner.nextInt(); //Recebendo o valor e atribuindo a variável 'b'
      
      System.out.print("Escolha sua opção: ");
      opcao = scanner.nextInt();
      
      switch(opcao) //switch verifica a valor da variável opcao e realiza a operação
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
      
      System.out.print("O resultado é: "+resultado);  
    }//Fim da main
}//Fim da classe