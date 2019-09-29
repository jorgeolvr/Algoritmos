public class Fibonacci {
   public static void fibo(int [] valores) {
      if(valores.length < 3) return;
      
      valores[0] = 0;
      valores[1] = 1;
      valores[2] = 1;
      
      for(int i = 3; i < valores.length; i++) {
         valores[i] = valores[(i-1)] + valores[(i-2)];
      }  
   }
   public static void main(String[] args) {
      int [] valores = new int[11];
      fibo(valores);
      for(int i = 0; i < valores.length; i++) {
      System.out.print(valores[i]+" ");
   }
}
}

