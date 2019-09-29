import java.util.Scanner;

public class matrizSoma {
   public static void main(String[]args) {
   
   int i = getLine();
   int j = getColumn();
   
   double [][] matriz_um = new double [i][j];
   double [][] matriz_dois = new double [i][j];
   double [][] matriz_soma = new double [i][j];
   
   fillMatriz(matriz_um);
   fillMatriz(matriz_dois);
   somaMatriz(matriz_um,matriz_dois,matriz_soma);
   showMensagem(matriz_soma);
   
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
   
   public static void somaMatriz(double [][] matriz_um, double [][] matriz_dois, double [][] matriz_soma) {

      for(int i = 0; i < matriz_um.length; i++) {
         for(int j = 0; j < matriz_um[i].length; j++) {
              matriz_soma[i][j] = matriz_dois[i][j] + matriz_um[i][j];
         } //fim for
      } //fim for
   } //fim somaMatriz()
   
   public static void showMensagem(double [][] matriz_soma) {
      
      System.out.print("\n");
      for(int i = 0; i < matriz_soma.length; i++) {
         for(int j = 0; j < matriz_soma[i].length; j++) {
               System.out.println("A soma das matrizes na linha "+i+" e na coluna "+j+": "+matriz_soma[i][j]);
         } //fim for
      } //fim for
   } //fim showMensagem() 
} //fim matrizSoma()
