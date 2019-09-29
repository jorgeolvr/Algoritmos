import java.util.Scanner; //Importando o recurso Scanner do pacote util do java

public class Bissexto
{
   public static void main (String[]args)
   {
      
      int ano = 0; //Iniciando variável tipo inteiro com o valor 0
      
      Scanner scanner = new Scanner(System.in); //Instanciando a classe Scanner
      
      System.out.println("Digite o ano: ");
      ano = scanner.nextInt(); //Atribuição do valor digitado pelo usuário na variável 'ano'
      
      if(ano%400 == 0) //Verfificação matemática através de uma estrutura condicional
      {
         System.out.println("O ano é bissexto"); //Uso do recurso System.out para mostrar mensagem na tela do usuário
      }
      else if (ano%100 != 0 && ano%4 == 0)
      {
         System.out.println("O ano é bissexto");
      }
      else
      {
         System.out.println("O ano não é bissexto");
      }      
   }
}
