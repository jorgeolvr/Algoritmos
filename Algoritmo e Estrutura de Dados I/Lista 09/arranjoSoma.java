import java.util.Scanner;

public class arranjoSoma {
   public static void main(String[]args) {
      
      Scanner scanner = new Scanner(System.in);
      
      boolean repeticao = false;
      int a;
      int b;
      int c;
      
      do{
         a = 0;
         b = 0;
         c = 0;
         
         System.out.print("\nDigite o tamanho do primeiro arranjo: ");
         a = scanner.nextInt();
         
         System.out.print("Digite o tamanho do segundo arranjo: ");
         b = scanner.nextInt();
         
         System.out.print("Digite o tamanho do arranjo da somatória: ");
         c = scanner.nextInt();
                  
         if(a != b || a != c) {
            repeticao = true;
            System.out.print("\nDigite tamanhos iguais para todos os arranjos\n");
         } //fim if
         else {
            repeticao = false;
         }
      }while(repeticao); //fim do while()
      
      double[]arranjo_um = new double[a];
      double[]arranjo_dois = new double[b];
      double[]somatorio = new double[c];
      
      getNum(arranjo_um, arranjo_dois, somatorio);
      for(int l = 0; l < somatorio.length; l++) {
         System.out.print("\n|-----Posição "+ (l+1) +"-------|\n");
         System.out.print("|Arranjo um:     "+arranjo_um[l]+"  |\n");
         System.out.print("|Arranjo dois:  +"+arranjo_dois[l]+"  |\n");
         System.out.print("|                ---  |\n");
         System.out.print("|Soma:           "+somatorio[l]+" |\n");
         System.out.print("|---------------------|\n");
      } //fim for()
   } //fim main()
   
   public static void getNum(double[]arranjo_um, double[]arranjo_dois, double[]somatorio) {
      
      System.out.print("\n");
      Scanner scanner = new Scanner(System.in);
      
      for(int i = 0; i < arranjo_um.length; i++) {
         System.out.print("Digite o "+ (i+1) +"º valor do primeiro arranjo: ");
         arranjo_um[i] = scanner.nextDouble();
      } //fim for()
      
      System.out.print("\n");
      
      for(int j = 0; j < arranjo_dois.length; j++) {
         System.out.print("Digite o "+ (j+1) +"º valor do segundo arranjo: ");
         arranjo_dois[j] = scanner.nextDouble();
      } //fim for()
      System.out.print("\n");
      for(int k = 0; k < somatorio.length; k++) {
            somatorio[k] = arranjo_um[k] + arranjo_dois[k];      
      } //fim for() 
   } //fim getNum()
} //fim classe