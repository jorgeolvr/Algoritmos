public class f2 {
   public static void main(String[]args) {
   
      System.out.println("------Fun��o------");
      System.out.println("| Fun��o de 0: "+function(0)+" |");
      System.out.println("| Fun��o de 1: "+function(1)+" |");
      System.out.println("| Fun��o de 5: "+function(5)+"|");
      System.out.println("------------------");
   }

   public static int function(int n) {
      if (n == 0) {
         return 1;
      }
      if (n == 1) {
         return 1;
      }
      else {
        return(function(n-1)+ 2 * function(n-2));
      }
   }
}