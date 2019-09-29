import java.util.Scanner;

public class arranjoPesquisa {
   public static void main(String[]args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Digite o tamanho do arranjo: ");
      int qnt = scanner.nextInt();
      
      System.out.print("Digite o valor a ser buscado: ");
      int busca = scanner.nextInt();
      
      double[]arranjo = new double[qnt];  
      
      boolean valor = validacao(arranjo, busca);
      
      if(valor == true) {
         System.out.print("\nO valor existe no arranjo");
      } //fim if
      else {
         System.out.print("\nO valor não existe no arranjo");
      }
   } //fim main()
   
   public static boolean validacao(double[]arranjo, int busca) {
      Scanner scanner = new Scanner(System.in);
      
      boolean valor = false;
      
      System.out.print("\n");
      
      for(int i = 0; i < arranjo.length; i++) {
   
         System.out.print("Digite o "+(i+1)+"º valor: ");
         arranjo[i] = scanner.nextInt(); 
         
            if(arranjo[i] == busca) {
               valor = true;
            } //fim if         
         } //fim for()
      return valor;
   } //fim validacao
} //fim classe