import java.util.Scanner;

public class arranjoIgual {
   public static void main(String[]args) {
      
      Scanner scanner = new Scanner(System.in);

      int a;
      int b;
      boolean repeticao = false;
      
      do{
         
         System.out.print("\nDigite o tamanho do primeiro arranjo: ");
         a = scanner.nextInt();
         
         System.out.print("Digite o tamanho do segundo arranjo: ");
         b = scanner.nextInt();

         if(a != b) {
            repeticao = true;
            System.out.print("\nDigite tamanhos iguais para todos os arranjos\n");
         } //fim if
         else {
            repeticao = false;
         }
      }while(repeticao); //fim do while()
      
      double[]arranjo_um = new double[a];
      double[]arranjo_dois = new double[b];
      
      boolean equal = getNum(arranjo_um, arranjo_dois);
           
      if(equal == true) {
         System.out.print("Os arranjos são iguais\n");
      } //fim if
      else {
         System.out.print("Os arranjos não são iguais\n");
      }
   } //fim main()
   
   public static boolean getNum(double[]arranjo_um, double[]arranjo_dois) {
      
      System.out.print("\n");
      Scanner scanner = new Scanner(System.in);
      
      boolean equal = false;
      
      for(int i = 0; i < arranjo_um.length; i++) {
         System.out.print("Digite o "+ (i+1) +"º valor do primeiro arranjo: ");
         arranjo_um[i] = scanner.nextDouble();
      } //fim for()
      
      System.out.print("\n");
      
      for(int j = 0; j < arranjo_dois.length; j++) {
         System.out.print("Digite o "+ (j+1) +"º valor do segundo arranjo: ");
         arranjo_dois[j] = scanner.nextDouble();
      }
      System.out.print("\n");
      for(int k = 0; k < arranjo_um.length; k++) {
         if(arranjo_um[k] == arranjo_dois[k]) {
            equal = true;
         } //fim if
         else {
            equal = false;
         }  
      } //fim for()
       return equal;      
   }  //fim getNum() 
} //fim classe