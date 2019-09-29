import java.util.Scanner;

public class matrizCopia {
   public static void main(String[]args) {
   
   int i = getLine();
   int j = getColumn();
   
   double [][] matriz_um = new double [i][j];
   double [][] matriz_dois = new double [i][j];
   
   fillMatriz(matriz_um);
   copyMatriz(matriz_um,matriz_dois);
   showMensagem(matriz_dois);
   
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
   
   public static void fillMatriz(double [][] matriz_um) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("\n");
      for(int i = 0; i < matriz_um.length; i++) {
         for(int j = 0; j < matriz_um[i].length; j++) {
              System.out.print("Digite o valor da linha "+i+" e coluna "+j+": ");
              matriz_um[i][j] = scanner.nextDouble();
         } //fim for
      } //fim for
   } //fim fillMatriz()
   
   public static void copyMatriz(double [][] matriz_um, double [][] matriz_dois) {
      
      for(int i = 0; i < matriz_dois.length; i++) {
         for(int j = 0; j < matriz_dois[i].length; j++) {
              matriz_dois[i][j] = matriz_um[i][j];
         } //fim for
      } //fim for
   } //fim copyMatriz()
   
   public static void showMensagem(double [][] matriz_dois) {
      
      System.out.print("\n");
      for(int i = 0; i < matriz_dois.length; i++) {
         for(int j = 0; j < matriz_dois[i].length; j++) {
               System.out.println("O valor da matriz dois na linha "+i+" e na coluna "+j+": "+matriz_dois[i][j]);
         } //fim for
      } //fim for
   } //fim showMensagem() 
} //fim matrizCopia()