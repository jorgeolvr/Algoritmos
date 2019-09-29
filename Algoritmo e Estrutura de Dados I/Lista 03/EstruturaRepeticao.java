import java.util.Scanner;

public class EstruturaRepeticao {

   public static void main (String [] args){
   
      Scanner scanner = new Scanner(System.in); //Instanciando objeto da classe Scanner()
   
      int opcao= 0; //Vari�vel tipo inteira para escolha das opera��es 
      int cont; //Declara��o da vari�vel tipo inteira para imprimir valores na tela
      int n = 0; //Vari�vel tipo inteira para controle na estrutura de repeti��o 'for'
      boolean  repeticao = true; //Vari�vel tipo booleana para controle da repeti��o do programa
      char fim; //vari�vel tipo caractere para finaliza��o do programa

      do{
         cont = 10; //Atribui��o de valor � vari�vel depois da estrutura 'do' para n�o perder o valor inicial no in�cio da repeti��o
         System.out.println("Estruturas de repeti��o");
         System.out.println("1) Com teste no final");
         System.out.println("2) Com teste no in�cio");
         System.out.println("3) Com vari�vel de controle");
         System.out.println("-----------------------------");
         System.out.print("Escolha uma op��o: ");
         opcao = scanner.nextInt(); //Usu�rio atribui valor � vari�vel atrav�s do uso do objeto da classe Scanner() 
      
   
   switch(opcao){ //Estrutura switch para escolha da opera��o 
      
      case 1: //Estrutura com teste no final
      
         System.out.print("Estrutura com teste no final: ");
            do{ //O 'do' � executado apenas uma vez e o 'while' repete a estrutura caso esteja dentro das condi��es
            
               System.out.print(cont +" "); //Escreve na tela valores de 10 a 1
               cont--; //Diminui uma unidade da vari�vel cont
               
            }while(cont > 0); //Enquanto a variavel cont for maior que zero
            
             do{ 
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
  
      break;
      
      case 2:
      
         System.out.print("Estrutura com teste no in�cio: ");
            while(cont > 0) //O while s� � executa a estrutura caso esteja dentro da condi��o
            {
               System.out.print(cont +" "); 
               cont--; //Diminui uma unidade da vari�vel cont
            }
         
            do{ 
            
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
                     
      break;
      
      case 3:
            
         n+= cont;
         System.out.print("Estrutura com vari�vel de controle: ");
            
            for(int i = 0; i < n; i++)
            {
               System.out.print(cont +" ");
               cont--;
            }
         
            do{
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
  
      break;
      
      default: //Op��o padr�o do switch
                
            if(opcao <= 0 || opcao >= 4) //Verifica se o valor digitado � menor o igual a zero ou se � maior ou igual a quatro
            {
               System.out.println("Op��o inv�lida"); //Se o valor digitado for inv�lido, as op��es v�o reaparecer na tela
               System.out.println("-----------------------------");
            }
         } //Fim do switch
      } while(repeticao == true);  //Fim da estrutura do...while
   } //Fim da main()
} //Fim da classe
