import java.util.Scanner;

public class EstruturaRepeticao {

   public static void main (String [] args){
   
      Scanner scanner = new Scanner(System.in); //Instanciando objeto da classe Scanner()
   
      int opcao= 0; //Variável tipo inteira para escolha das operações 
      int cont; //Declaração da variável tipo inteira para imprimir valores na tela
      int n = 0; //Variável tipo inteira para controle na estrutura de repetição 'for'
      boolean  repeticao = true; //Variável tipo booleana para controle da repetição do programa
      char fim; //variável tipo caractere para finalização do programa

      do{
         cont = 10; //Atribuição de valor à variável depois da estrutura 'do' para não perder o valor inicial no início da repetição
         System.out.println("Estruturas de repetição");
         System.out.println("1) Com teste no final");
         System.out.println("2) Com teste no início");
         System.out.println("3) Com variável de controle");
         System.out.println("-----------------------------");
         System.out.print("Escolha uma opção: ");
         opcao = scanner.nextInt(); //Usuário atribui valor à variável através do uso do objeto da classe Scanner() 
      
   
   switch(opcao){ //Estrutura switch para escolha da operação 
      
      case 1: //Estrutura com teste no final
      
         System.out.print("Estrutura com teste no final: ");
            do{ //O 'do' é executado apenas uma vez e o 'while' repete a estrutura caso esteja dentro das condições
            
               System.out.print(cont +" "); //Escreve na tela valores de 10 a 1
               cont--; //Diminui uma unidade da variável cont
               
            }while(cont > 0); //Enquanto a variavel cont for maior que zero
            
             do{ 
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
  
      break;
      
      case 2:
      
         System.out.print("Estrutura com teste no início: ");
            while(cont > 0) //O while só é executa a estrutura caso esteja dentro da condição
            {
               System.out.print(cont +" "); 
               cont--; //Diminui uma unidade da variável cont
            }
         
            do{ 
            
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
                     
      break;
      
      case 3:
            
         n+= cont;
         System.out.print("Estrutura com variável de controle: ");
            
            for(int i = 0; i < n; i++)
            {
               System.out.print(cont +" ");
               cont--;
            }
         
            do{
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
  
      break;
      
      default: //Opção padrão do switch
                
            if(opcao <= 0 || opcao >= 4) //Verifica se o valor digitado é menor o igual a zero ou se é maior ou igual a quatro
            {
               System.out.println("Opção inválida"); //Se o valor digitado for inválido, as opções vão reaparecer na tela
               System.out.println("-----------------------------");
            }
         } //Fim do switch
      } while(repeticao == true);  //Fim da estrutura do...while
   } //Fim da main()
} //Fim da classe
