import java.util.Scanner; //Importando o recurso Scanner do pacote util do java

public class PesoIdeal
{
   public static void main (String[]args)
   {
      
      double peso = 0, altura = 0; //Declaração das variáveis tipo real
      char sexo; //Declaração da variável tipo caractere
      
      Scanner scanner = new Scanner(System.in); //Instanciando o objeto da classe Scanner
      
      System.out.println("Digite a altura: ");
      altura = scanner.nextDouble(); //Variável altura recebendo o valor digitado
      
      System.out.println("Digite o sexo: ");
      sexo = scanner.next().charAt(0); //Variável sexo recebendo um caractere digitado
      
      switch (sexo) //Estrutura de condição 'switch' verificando o conteúdo da variável sexo
      {
         case 'm': //Executa o cálculo caso o conteúdo da variável seja 'm'
         
            peso = (72.7 * altura) - 58;
            break;
            
         case 'M': //Executa o cálculo caso o conteúdo da variável seja 'M'
         
            peso = (72.7 * altura) - 58;
            break; 
         
       
         case 'f': //Executa o cálculo caso o conteúdo da variável seja 'f'
        
            peso = (62.1 * altura) - 44.7;
            break;
            
         case 'F': //Executa o cálculo caso o conteúdo da variável seja 'F'
        
            peso = (62.1 * altura) - 44.7;
            break;
        
      }
      
           
      System.out.println("O peso ideal da pessoa é : " +peso+ " quilos"); //Mostra na tela o resultado do cálculo
      
      
   }
}
