import java.util.Scanner;

public class matrizProduto {
   public static void main(String[]args) {
   
   int i = getLine();
   int j = getColumn();
   
   double [][] matriz_um = new double [i][j];
   double [][] matriz_dois = new double [i][j];
   double [][] matriz_produto = new double [i][j];
   
   fillMatriz(matriz_um);
   fillMatriz(matriz_dois);
   multMatriz(matriz_um,matriz_dois,matriz_produto);
   showMensagem(matriz_produto);
   
   } //fim main()
   
   public static int getLine() {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Digite o número de linhas: ");
      int i = scanner.nextInt();
      
      return i;
   } //fim getLine()
   
    public static int getColumn() {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Digite o número de colunas: ");
      int j = scanner.nextInt();
      
      return j;
   } //fim getColumn()
   
   public static void fillMatriz(double [][] matriz) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("\n");
      for(int i = 0; i < matriz.length; i++) {
         for(int j = 0; j < matriz[i].length; j++) {
              System.out.print("Digite o valor da linha "+i+" e coluna "+j+": ");
              matriz[i][j] = scanner.nextDouble();
         } //fim for
      } //fim for
   } //fim fillMatriz()
   
   public static void multMatriz(double [][] matriz_um, double [][] matriz_dois, double [][] matriz_produto) {

      for(int i = 0; i < matriz_um.length; i++) {
         for(int j = 0; j < matriz_um[i].length; j++) {
              matriz_produto[i][j] = matriz_dois[i][j] * matriz_um[i][j];
         } //fim for
      } //fim for
   } //fim multMatriz()
   
   public static void showMensagem(double [][] matriz_produto) {
      
      System.out.print("\n");
      for(int i = 0; i < matriz_produto.length; i++) {
         for(int j = 0; j < matriz_produto[i].length; j++) {
               System.out.println("O produto das matrizes na linha "+i+" e na coluna "+j+": "+matriz_produto[i][j]);
         } //fim for
      } //fim for
   } //fim showMensagem() 
} //fim matrizProduto()