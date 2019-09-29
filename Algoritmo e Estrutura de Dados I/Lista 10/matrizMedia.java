import java.util.Scanner;

public class matrizMedia {
   public static void main(String[]args) {
   
   int i = getLine();
   int j = getColumn();
   int f = getFileiraMedia();
   
   int [][] matriz_um = new int [i][j];
   
   fillMatriz(matriz_um);
   double media = mediaMatriz(matriz_um,f,j);
   showMensagem(media);
   
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
   
   public static int getFileiraMedia() {  
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Digite a coluna que será feita a média: ");
      int f = scanner.nextInt();
      
      return f;
   } //fim getFileiraMedia()
   
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
   
   public static double mediaMatriz(int [][] matriz_um, int f, int j) {
      double media = 0;
      boolean resultado = true;
      for(int i = 0; i < matriz_um.length; i++) {
            media = media + matriz_um[i][f];
      } //fim for
      
      media /= j;
      return media;
   } //fim mediaMatriz()
   
   public static void showMensagem(double media) {
      
      System.out.print("\n");
      System.out.println("A média da coluna é: "+media);
   } //fim showMensagem()
} //fim matrizMedia()
