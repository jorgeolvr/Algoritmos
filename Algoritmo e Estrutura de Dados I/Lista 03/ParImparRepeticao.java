import java.util.Scanner;

public class ParImparRepeticao {

public static void main (String [] args){
   
   Scanner scanner = new Scanner(System.in); //Instanciando objeto da classe Scanner()
   
   int numero = 0;
   boolean  repeticao = true; //Vari�vel tipo booleana para controle da repeti��o do programa
   char fim; //vari�vel tipo caractere para finaliza��o do programa

   do{

      System.out.println("Digite um n�mero: ");
      numero = scanner.nextInt();
      
      if(numero % 2 == 0)
      {
         System.out.println("O n�mero � par");
      }
      else
      {
         System.out.println("O n�mero � impar");
      }
   do {
       System.out.println("\nFinalizar o programa? (S/N)");
       fim = scanner.next().charAt(0); //Usu�rio atribui valor � vari�vel atrav�s do uso do objeto da classe Scanner()
         
       fim = Character.toUpperCase(fim); //Transforma o caractere atribuido � vari�vel fim em um caractere mai�sculo

   if (fim == 'S') //Estrutura condicional caso usu�rio queira finalizar o programa
   {
      repeticao = false; //Caso a vari�vel booleana receba falso, o programa encerra
   }
   else if ( fim == 'N') //Caso o usu�rio n�o queria continuar
   {
      repeticao = true; //Caso continue como true, o programa repete atrav�s da estrutura do...while
   }
   }while(fim != 'S' && fim != 'N'); //Loop da pergunta no console caso o usu�rio digite uma letra errada
      
   } while(repeticao == true);  //Fim da estrutura do...while
   } //Fim da main()
} //Fim da classe
