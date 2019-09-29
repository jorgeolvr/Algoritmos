import java.util.Scanner;

public class arranjoPositivo {
   public static void main(String[]args) {
      
      Scanner scanner = new Scanner(System.in);

      int a;
         
      System.out.print("\nDigite o tamanho do primeiro arranjo: ");
      a = scanner.nextInt();
               
      double[]arranjo_um = new double[a];
      
      boolean positivo = getNum(arranjo_um);
           
      if(positivo == true) {
         System.out.print("O arranjo é positivo\n");
      } //fim if
      else {
         System.out.print("O arranjo é negativo\n");
      }
   } //fim main()
   
   public static boolean getNum(double[]arranjo_um) {
      
      System.out.print("\n");
      Scanner scanner = new Scanner(System.in);
      
      boolean positivo = true;
      
      for(int i = 0; i < arranjo_um.length; i++) {
         System.out.print("Digite o "+ (i+1) +"º valor do primeiro arranjo: ");
         arranjo_um[i] = scanner.nextDouble();
      } //fim for()
      
      System.out.print("\n");
      
      for(int j = 0; j < arranjo_um.length; j++) {
         if(arranjo_um[j] < 0) {
            positivo = false;
         } //fim if
      } //fim for()
       return positivo;      
   } // fim getNum()
} //fim classe
