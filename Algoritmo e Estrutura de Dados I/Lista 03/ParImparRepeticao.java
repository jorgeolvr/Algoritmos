import java.util.Scanner;

public class ParImparRepeticao {

public static void main (String [] args){
   
   Scanner scanner = new Scanner(System.in); //Instanciando objeto da classe Scanner()
   
   int numero = 0;
   boolean  repeticao = true; //Variável tipo booleana para controle da repetição do programa
   char fim; //variável tipo caractere para finalização do programa

   do{

      System.out.println("Digite um número: ");
      numero = scanner.nextInt();
      
      if(numero % 2 == 0)
      {
         System.out.println("O número é par");
      }
      else
      {
         System.out.println("O número é impar");
      }
   do {
       System.out.println("\nFinalizar o programa? (S/N)");
       fim = scanner.next().charAt(0); //Usuário atribui valor à variável através do uso do objeto da classe Scanner()
         
       fim = Character.toUpperCase(fim); //Transforma o caractere atribuido à variável fim em um caractere maiúsculo

   if (fim == 'S') //Estrutura condicional caso usuário queira finalizar o programa
   {
      repeticao = false; //Caso a variável booleana receba falso, o programa encerra
   }
   else if ( fim == 'N') //Caso o usuário não queria continuar
   {
      repeticao = true; //Caso continue como true, o programa repete através da estrutura do...while
   }
   }while(fim != 'S' && fim != 'N'); //Loop da pergunta no console caso o usuário digite uma letra errada
      
   } while(repeticao == true);  //Fim da estrutura do...while
   } //Fim da main()
} //Fim da classe
