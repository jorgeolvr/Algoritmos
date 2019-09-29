import java.util.Scanner;

public class SomaNumeros {

   public static void main(String[]args) {
   
      int i = 1;
      
      double num1 = getNum(i);
      
      i++;
      
      double num2 = getNum(i);
   
      double total = soma(num1, num2);

      mensagem(total);  
   } //fim main()
   
   public static double getNum(int i) {
   
      Scanner scanner = new Scanner (System.in);
           
   
      System.out.print("Digite o "+i+"º número: ");
      int numero = scanner.nextInt();
   
      return numero;   
   } //fim getNum()
   
   
   
   public static double soma(double num1, double num2) {
   
      double resultado = num1 + num2;
     
      return resultado;    
   } //fim soma()
   

   public static void mensagem(double total) {
   
      System.out.println("O resultado da soma é: "+total);
   } //fim mensagem()
    
} //fim da classe
