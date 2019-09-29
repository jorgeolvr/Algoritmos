import java.util.Scanner; //Importando o recurso Scanner do pacote util do java

public class PesoIdeal
{
   public static void main (String[]args)
   {
      
      double peso = 0, altura = 0; //Declara��o das vari�veis tipo real
      char sexo; //Declara��o da vari�vel tipo caractere
      
      Scanner scanner = new Scanner(System.in); //Instanciando o objeto da classe Scanner
      
      System.out.println("Digite a altura: ");
      altura = scanner.nextDouble(); //Vari�vel altura recebendo o valor digitado
      
      System.out.println("Digite o sexo: ");
      sexo = scanner.next().charAt(0); //Vari�vel sexo recebendo um caractere digitado
      
      switch (sexo) //Estrutura de condi��o 'switch' verificando o conte�do da vari�vel sexo
      {
         case 'm': //Executa o c�lculo caso o conte�do da vari�vel seja 'm'
         
            peso = (72.7 * altura) - 58;
            break;
            
         case 'M': //Executa o c�lculo caso o conte�do da vari�vel seja 'M'
         
            peso = (72.7 * altura) - 58;
            break; 
         
       
         case 'f': //Executa o c�lculo caso o conte�do da vari�vel seja 'f'
        
            peso = (62.1 * altura) - 44.7;
            break;
            
         case 'F': //Executa o c�lculo caso o conte�do da vari�vel seja 'F'
        
            peso = (62.1 * altura) - 44.7;
            break;
        
      }
      
           
      System.out.println("O peso ideal da pessoa � : " +peso+ " quilos"); //Mostra na tela o resultado do c�lculo
      
      
   }
}
