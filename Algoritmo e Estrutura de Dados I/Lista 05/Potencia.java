import java.util.Scanner;

public class Potencia{
   public static void main(String [] args){
      Scanner scanner = new Scanner(System.in);
      
      int e, i, resultado;
        
      for(i=0; i<=10; i++)
      {
         resultado =1;
         e=i;
         
         while (e > 0)
         {
            resultado=resultado*2;
            e--;
         }
         
        System.out.println("2^" + i + " = " + resultado); 
        
      } //fim loop
   } //fim da main()
} //fim da classe