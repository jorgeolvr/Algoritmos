import java.util.Scanner;

public class arranjoValido {
   public static void main(String[]args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Digite o tamanho do arranjo: ");
      int qnt = scanner.nextInt();
      
      double[]arranjo = new double[qnt];  
      
      int valores = validacao(arranjo);
      
      System.out.print("A quantidade de valores válidos são: "+valores);
   }
   
   public static int validacao(double[]arranjo) {
      Scanner scanner = new Scanner(System.in);
      
      int cont = 0;
      int flag = 1;
      System.out.print("\n");
      
      for(int i = 0; i < arranjo.length; i++) {
   
         System.out.print("Digite o "+(i+1)+"º valor: ");
         arranjo[i] = scanner.nextInt();
         if (arranjo[i] == 0) {
           flag = 0; 
         }
            
         if(arranjo[i] > 0 && flag != 0) {
            cont++;            
         }
      }
      return cont;
   }
}