import java.util.Scanner;

public class matrizAcimaDiagonal {
   public static void main(String[]args) {
   
   int i = getLine();
   int j = getColumn(i);
   
   double [][] matriz_um = new double [i][j];
   
   fillMatriz(matriz_um);
   double media = mediaMatriz(matriz_um,j);
   showMensagem(media);
   
   } //fim main()
   
   public static int getLine() {
      Scanner scanner = new Scanner(System.in);
      int i = 0;
      
         System.out.print("Digite o número de linhas: ");
         i = scanner.nextInt();
      
      return i;
   } //fim getLine()
   
    public static int getColumn(int i) {
      Scanner scanner = new Scanner(System.in);
      int j = 0;
      
      do {
         System.out.print("Digite o número de colunas: ");
         j = scanner.nextInt();
      } while(j != i); //fim while
      return j;
   } //fim getColumn()
   
   public static void fillMatriz(double [][] matriz) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("\n");
      for(int i = 0; i < matriz.length; i++) {
         for(int j = 0; j < matriz[i].length; j++) {
              System.out.print("Digite o valor da linha "+i+" e coluna "+j+": ");
              matriz[i][j] = scanner.nextInt();
         } //fim for
      } //fim for
   } //fim fillMatriz()
   
   public static double mediaMatriz(double [][] matriz_um, int k) {
      double media = 0;
      for(int i = 0; i < matriz_um.length; i++) {
         for(int j = 0; j < matriz_um[i].length; j++) {
            if( i != j && i > j) {
               media = media + matriz_um[i][j];
            } //fim if
         } //fim for
      } //fim for
      media /= k;
      return media;
   } //fim mediaMatriz()
   
   public static void showMensagem(double media) {
      
      System.out.print("\n");
      System.out.println("A média dos valores acima da diagonal é: "+media);
   } //fim showMensagem()
} //fim matrizAcimaDiagonal()
