import java.util.Scanner;

public class matrizTransposta {
   public static void main(String[]args) {
   
   int i = getLine();
   int j = getColumn();
   
   int [][] matriz_um = new int [i][j];
   int [][] matriz_dois = new int [j][i];
   
   fillMatriz(matriz_um);
   createMatriz(matriz_um,matriz_dois);
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
   
   public static void fillMatriz(int [][] matriz) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("\n");
      for(int i = 0; i < matriz.length; i++) {
         for(int j = 0; j < matriz[i].length; j++) {
              System.out.print("Digite o valor da linha "+i+" e coluna "+j+": ");
              matriz[i][j] = scanner.nextInt();
         } //fim for
      } //fim for
   } //fim fillMatriz()
   
   public static void createMatriz(int [][] matriz_um, int [][] matriz_dois) {
      
      boolean resultado = true;
      for(int i = 0; i < matriz_um.length; i++) {
         for(int j = 0; j < matriz_um[i].length; j++) {
            matriz_dois[j][i] = matriz_um[i][j];
        } //fim for
      } //fim for
   } //fim createMatriz()
   
   public static void showMensagem(int [][] matriz_dois) {
      
      System.out.print("\n");
       for(int i = 0; i < matriz_dois.length; i++) {
         for(int j = 0; j < matriz_dois[i].length; j++) {
               System.out.println("O valor da matriz dois na linha "+i+" e na coluna "+j+": "+matriz_dois[i][j]);
         } //fim for
      } //fim for
   } //fim showMensagem() 
} //fim matrizTransposta()
