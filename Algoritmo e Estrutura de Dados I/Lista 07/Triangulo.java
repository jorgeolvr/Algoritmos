import java.util.Scanner;

public class Triangulo {
   public static void main(String[]args) {
   
   double cateto_um = getCateto();
   double cateto_dois = getCateto();
   double hipotenusa = getHipotenusa();
   
   boolean resultado = verificar(cateto_um, cateto_dois, hipotenusa);
   
   mensagem(resultado);
   
   } //fim main()
   
   public static double getCateto() {
      Scanner scanner = new Scanner(System.in);
      
      int i = 1;
      double cateto = 0;
      System.out.print("Digite o valor do "+i+"º cateto: ");
      cateto = scanner.nextDouble();
      i++;
      
     return cateto;   
   } //fim getCateto()
   
   public static double getHipotenusa() {
      Scanner scanner = new Scanner(System.in);
      
      double hipotenusa = 0;
      System.out.print("Digite o valor da hipotenusa: ");
      hipotenusa = scanner.nextDouble();
      
      return hipotenusa; 
   } //fim getHipotenusa()
   
   public static boolean verificar(double cateto_um, double cateto_dois, double hipotenusa) {
   
      boolean triangulo = false;
   
         if( cateto_um+cateto_dois > hipotenusa && cateto_dois+hipotenusa > cateto_um && cateto_um+hipotenusa > cateto_dois) { //Verificando se os números satisfazem a condição para ser triângulo
         
         triangulo = true;
         
         }
         
         return triangulo;
   } //fim verificar()
   
   public static void mensagem(boolean resultado) {
   
      if( resultado == true) {
         System.out.print("\nA figura é um triângulo");
      }
      else {
         System.out.print("\nA figura é não um triângulo");
      }   
   } //fim mensagem()
} //fim classe