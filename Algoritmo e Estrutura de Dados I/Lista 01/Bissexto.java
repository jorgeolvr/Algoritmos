import java.util.Scanner; //Importando o recurso Scanner do pacote util do java

public class Bissexto
{
   public static void main (String[]args)
   {
      
      int ano = 0; //Iniciando vari�vel tipo inteiro com o valor 0
      
      Scanner scanner = new Scanner(System.in); //Instanciando a classe Scanner
      
      System.out.println("Digite o ano: ");
      ano = scanner.nextInt(); //Atribui��o do valor digitado pelo usu�rio na vari�vel 'ano'
      
      if(ano%400 == 0) //Verfifica��o matem�tica atrav�s de uma estrutura condicional
      {
         System.out.println("O ano � bissexto"); //Uso do recurso System.out para mostrar mensagem na tela do usu�rio
      }
      else if (ano%100 != 0 && ano%4 == 0)
      {
         System.out.println("O ano � bissexto");
      }
      else
      {
         System.out.println("O ano n�o � bissexto");
      }      
   }
}
