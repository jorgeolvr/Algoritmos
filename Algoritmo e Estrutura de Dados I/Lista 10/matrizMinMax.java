import java.util.Scanner;

public class matrizMinMax {
   public static void main(String[]args) {
   
   int i = getLine();
   int j = getColumn(i);
   
   int [][] matriz_um = new int [i][j];
   
   int linha = fillMatriz(matriz_um);
   int maior = minmaxMatriz(matriz_um,linha);
   showMensagem(maior);
   
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
   
   public static int fillMatriz(int [][] matriz) {
      Scanner scanner = new Scanner(System.in);
      int linha = 0;
      int menor = 50;
      
      System.out.print("\n");
      for(int i = 0; i < matriz.length; i++) {
         for(int j = 0; j < matriz[i].length; j++) {
            System.out.print("Digite o valor da linha "+i+" e coluna "+j+": ");
            matriz[i][j] = scanner.nextInt();
            if(matriz[i][j] < menor) {
               menor = matriz[i][j];
               linha = i;
         } //fim if
      } //fim for
   } //fim for
      return linha;
   } //fim fillMatriz()
   
   public static int minmaxMatriz(int [][] matriz_um, int linha) {
      int maior = 0;
      
      for(int i = 0; i < matriz_um.length; i++) {
         for(int j = 0; j < matriz_um[i].length; j++) {
            if(matriz_um[linha][j] > maior) {
               maior = matriz_um[linha][j];
            } //fim if
         } //fim for
      } //fim for
      return maior;
   } //fim minmaxMatriz()
   
   public static void showMensagem(int maior) {
      
      System.out.print("\n");
      System.out.println("O maior valor da linha onde se encontra o menor valor é: "+maior);
   } //fim showMensagem()
} //fim matrizMinMax()
