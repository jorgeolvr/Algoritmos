public class f1 {
   public static void main(String[]args) {
   
      System.out.println("------Fun��o------");
      System.out.println("| Fun��o de 0: "+function(0)+" |");
      System.out.println("| Fun��o de 1: "+function(1)+" |");
      System.out.println("| Fun��o de 4: "+function(4)+"|");
      System.out.println("------------------");

   
   }
   
   public static int function(int n) {
   
      if(n == 0) {
         return 1;
      }
      else {
         return n*function(n-1);
      }
   }
}