import java.util.Scanner;

public class matrizIgual {
   public static void main(String[]args) {
   
   int i = getLine();
   int j = getColumn();
   
   double [][] matriz_um = new double [i][j];
   double [][] matriz_dois = new double [i][j];
   
   fillMatriz(matriz_um);
   fillMatriz(matriz_dois);
   boolean resultado = verificaMatriz(matriz_um,matriz_dois);
   showMensagem(resultado);
   
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
   
   public static boolean verificaMatriz(double [][] matriz_um, double [][] matriz_dois) {
      
      boolean resultado = true;
      for(int i = 0; i < matriz_um.length; i++) {
         for(int j = 0; j < matriz_um[i].length; j++) {
            if(matriz_um[i][j] != matriz_dois[i][j]) {
               resultado = false;
            } //fim if
         } //fim for
      } //fim for
      return resultado;
   } //fim verificaMatriz()
   
   public static void showMensagem(boolean resultado) {
      
      System.out.print("\n");
      if(resultado == true) {
         System.out.print("As matrizes são iguais ");
      } //fim if
      else {
         System.out.print("As matrizes são diferentes ");
      } //fim else
   }  //fim showMensagem()
} //fim matrizIgual()