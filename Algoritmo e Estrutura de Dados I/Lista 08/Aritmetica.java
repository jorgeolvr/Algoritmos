import java.util.Scanner;

public class Aritmetica {
   public static int decrescente(int n) {  
      if(n == 0) {
         return 0;
      }
      else {
         return (1 + decrescente(n-1));
      }
   }
   
   public static int somatorio(int inf, int sup) {
      if (sup == inf) {
         return inf;
      }
      else {
         return sup + somatorio(inf, sup - 1);
      }
   }
   
   public static double cubo(double num) {
      if (num == 0) {
         return 0;
      }
      else if (num == 1) {
         return 1;
      }
      else {
         return Math.pow(num, 3) + cubo(num-1);
      }
   }
      
   static long fibo(int n) {
      if (n < 2) {
         return n; 
      }
      else {
         return fibo(n - 1) + fibo(n - 2); 
      } 
   }
}
   
class Resultado {
   public static void main(String[]args) {
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Digite o n�mero de termos da sequ�ncia decrescente: ");
      int n = scanner.nextInt();
      System.out.print("A sequ�ncia descrecente �: ");
      
      for(int i = n; i >= 0; i--) {
         System.out.print(Aritmetica.decrescente(i)+" ");
      }
      
      System.out.println("\n");
      System.out.print("Digite o limite inferior de termos do somat�rio: ");
      int inf = scanner.nextInt();
      System.out.print("Digite o limite superior de termos do somat�rio: ");
      int sup = scanner.nextInt();
         
      int somatorio = Aritmetica.somatorio(inf, sup); 
     
      System.out.print("A soma dos termos dentro do intervalo �: "+somatorio);
      
      System.out.println("\n");
      System.out.print("Digite o n�mero para calcular o valor do cubo at� 0: ");
      double num = scanner.nextDouble();
      double somacubo = Aritmetica.cubo(num);
      String valor = String.format("%.0f", somacubo);
      System.out.print("A soma do cubo dos n�meros �: "+valor);
      
      System.out.print("\n");
      System.out.print("\nA sequ�ncia fibonacci �: ");
      
      for (int k = 0; k < 11; k++) {
         System.out.print(Aritmetica.fibo(k) + " "); 
      } 
   }
}
      