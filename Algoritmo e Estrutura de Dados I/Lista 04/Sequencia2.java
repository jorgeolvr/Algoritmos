import java.util.Scanner;

public class Sequencia2 {  
  
public int num = 1;
public int den = 100;

   public static void main (String[]args) {
   
   Sequencia2 obj = new Sequencia2();

   obj.getSequencia();
   
   }
   
   public void getSequencia()
   {
      for(int i = 0; i < 5; i++)
      {
      System.out.print(num +"/"+ den+", ");
      num++;
      den-=2;
        
      System.out.print(den +"/"+ num+" ");
      num++;
      den-=2;
               
      }     
   } //fim main()
} //fim da class