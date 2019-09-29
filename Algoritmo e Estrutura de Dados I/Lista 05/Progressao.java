import java.util.Scanner;

public class Progressao{

  public static void main(String[] args){
  
  Scanner scanner = new Scanner(System.in); //Instanciando objeto da classe Scanner()
  
  int qnt = 0;
  int razao = 0;
  int num1 = 0;
  int somatorio = 0;
  
  System.out.print("Digite a quantidade de termos da progressão: ");
  qnt = scanner.nextInt();
  
  System.out.print("Digite o termo inicial: ");
  num1 = scanner.nextInt();
  
  System.out.print("Digite a razão da progressão: ");
  razao = scanner.nextInt();
    
  System.out.print("A sequência de termos da progressão é: "+num1);
  
  somatorio = num1;
  
   for(int i = 1; i < qnt; i++)
      {
         
         num1 = num1 + razao;
         System.out.print(", "+num1);
         somatorio += num1;        
      }
      
      System.out.print("\nO somatorio dos valores da progressão é: "+somatorio);
   } //fim da main()
} //fim da classe