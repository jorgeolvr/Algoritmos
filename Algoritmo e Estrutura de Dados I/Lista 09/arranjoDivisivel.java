import java.util.Scanner;

public class arranjoDivisivel {
   public static void main(String[]args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Digite o tamanho do arranjo: ");
      int qnt = scanner.nextInt();
      
      System.out.print("Digite o valor a ser dividido: ");
      int divisao = scanner.nextInt();
      
      int[]arranjo = new int[qnt];  
      
      int valor = validacao(arranjo, divisao);
      
     
         System.out.print("\nO número de valores no arranjo divisíveis por "+divisao+" é: "+valor);
   } //fim main()
   
   public static int validacao(int[]arranjo, int divisao) {
      Scanner scanner = new Scanner(System.in);
      
      int cont = 0;
      
      System.out.print("\n");
      
      for(int i = 0; i < arranjo.length; i++) {
   
         System.out.print("Digite o "+(i+1)+"º valor: ");
         arranjo[i] = scanner.nextInt(); 
         
         if(arranjo[i] % divisao ==0) {
               cont++; 
         }  //fim if        
      } //fim for()
      return cont;
   } //fim validacao()
} //fim classe