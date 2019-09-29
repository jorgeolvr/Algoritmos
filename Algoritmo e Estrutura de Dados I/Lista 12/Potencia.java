import java.util.Scanner;

public class Potencia {
    public static double calcPotencia (int num, int exp) {
      if(exp < 0) return 0;
      
      if (num == 0) {
         return 0;
      }
      else if (num == 1) {
         return 1;
      }
      else {
         return Math.pow(num, exp);
      }
   }
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Digite a base: ");
      int base = scanner.nextInt();
      System.out.print("Digite o expoente: ");
      int exp = scanner.nextInt();
      
      System.out.print("O resultado da potenciação é: "+calcPotencia(base,exp));
      
   }
}

