import java.util.Scanner;
public class Pesquisa {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Digite o número de linhas: ");
      int i = scanner.nextInt();
      System.out.print("Digite o número de colunas: ");
      int j = scanner.nextInt();
      
      double [][] arranjo = new double[i][j];
      
      completaMatriz(arranjo);
      pesquisaMatriz(arranjo);
      
   }
   
   public static void completaMatriz(double [][] arranjo) {
      Scanner scanner = new Scanner(System.in);
      
      for(int i = 0; i < arranjo.length; i++) {
         for(int j = 0; j < arranjo[i].length; j++) {
            System.out.print("Digite o valor da linha "+(i+1)+" e coluna "+(j+1)+": ");
            arranjo[i][j] = scanner.nextDouble();
         }
      }
   }
   
   public static void pesquisaMatriz(double [][] arranjo) {
      Scanner scanner = new Scanner(System.in);
      
      int cont = 0;
      System.out.print("Digite o valor para pesquisar: ");
      double valor = scanner.nextDouble();
      
      for(int i = 0; i < arranjo.length; i++) {
         for(int j = 0; j < arranjo[i].length; j++) {
            if(valor == arranjo[i][j]) {
               cont++;
            }
         }
     }
     System.out.print("O número de ocorrências do número "+valor+" é de: "+cont);
   }
   }