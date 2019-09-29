import java.util.Scanner;

public class PotenciaRecursiva {
    public static int calcPotencia(int num, int exp) {
      if(exp < 0) return 1;

      else if (exp == 1) {
         return num;
      }
      else {
         return num * calcPotencia(num, exp - 1);
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

