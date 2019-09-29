import java.util.Scanner;

public class Perimetro {

  public static void main(String[]args) {
   
   System.out.println("Calculo do per�metro do ret�ngulo\n");
    
   double base = getBase();
   double altura = getAltura();
   
   double perimetro = perimetro(base, altura);
   
   mensagem(perimetro);
   
   } // fim main()

   public static double getBase() {
   
   Scanner scanner = new Scanner(System.in);
   
   System.out.print("Digite o valor da base do ret�ngulo: ");
   double base = scanner.nextDouble();
   
   return base;
   
   } //fim getBase()
   
   public static double getAltura() {
   
   
   Scanner scanner = new Scanner(System.in);
   
   System.out.print("Digite o valor da altura do ret�ngulo: ");
   double altura = scanner.nextDouble();
   
   return altura;
   
   } //fim getAltura()
   
   public static double perimetro(double base, double altura) {
   
   double perimetro = (2 * base) + (2 * altura);
   
   return perimetro;
   
   } //fim perimetro()
   
   public static void mensagem(double perimetro) {
   
   System.out.print("O valor do per�metro do ret�ngulo �: "+perimetro);
   
   } //fim mensagem() 
} //fim classe