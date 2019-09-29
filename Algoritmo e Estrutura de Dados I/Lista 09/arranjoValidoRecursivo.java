import java.util.Scanner;

public class arranjoValidoRecursivo {
   public static void main(String[]args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Digite o tamanho do arranjo: ");
      int termos = scanner.nextInt();
      
      int i = 1;
      int cont = 1;
      
      double[]arranjo = new double[termos];  
      
      validacao(arranjo);
      
      int qnt = qntValidos(arranjo,i,cont);
      
      mensagem(qnt);   
   } //fim main()
   
   public static void validacao(double[]arranjo) {
      Scanner scanner = new Scanner(System.in);
      
      int cont = 0;
      int flag = 1;
      System.out.print("\n");
      
      for(int i = 0; i < arranjo.length; i++) {
   
         System.out.print("Digite o "+(i+1)+"º valor: ");
         arranjo[i] = scanner.nextInt();
      } //fim for()
   } //fim validacao()
   
   public static int qntValidos(double [] arranjo, int i, int cont) {
      if(i > arranjo.length || arranjo[i-1] == 0) {
         return 0;
      } //fim if
      else {
         return cont + qntValidos(arranjo,i+1,cont);
      }
   } //fim qntvalidos()
   
   public static void mensagem(int qnt) {
      System.out.print("\nO número de valores válidos é: "+qnt);
   } //fim mensagem()
} //fimclasse