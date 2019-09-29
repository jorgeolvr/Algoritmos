import java.util.Scanner;

public class Fibonacci {

   public static void main (String[]args) {
   
      for (int i = 0; i < 15; i++)
	   {
	      System.out.print(Fibonacci(i)+", ");
	   }
      
}
   
   public static int Fibonacci(int n)
   {
	int a = 0;
	int b = 1;
   
		for (int i = 0; i < n; i++)
	   {
	      int temp = a;
	      a = b;
	      b = temp + b;
	   }
      
	return a;
   
   } //fim main()
} //fim class