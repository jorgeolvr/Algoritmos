import java.util.Scanner;

public class Divisao {
   public static void main(String[]args) {
   
   double numero[] = new double[3];
   boolean repeticao = true;
   char resp = ' ';
   
      do {
   
         for(int i = 1; i < 3; i++) {
            numero[i] = getNumero(i);
         } //fim for
         
         int resultado = verificar(numero[1], numero[2]);
   
         mensagem(resultado);
      
         Scanner scanner = new Scanner(System.in);
         System.out.print("\nDeseja Continuar o programa? ");
         resp = scanner.next().charAt(0);
         resp = Character.toUpperCase(resp);
      
         if(resp == 'N') {
            repeticao = false;
         } //fim if
         else if(resp == 'S') {
            repeticao = true;
         } //fim else if
      }while(repeticao == true); //fim do/while
   } //fim main()
   
   public static double getNumero(int i) {
      Scanner scanner = new Scanner(System.in);
      
      double numero = 0;
      System.out.print("Digite o valor do "+i+"º número: ");
      numero = scanner.nextDouble();
      
      return numero;   
   } //fim getNumero()
   
   public static int verificar(double numero_um, double numero_dois) {
   
      int resultado = 0;
      
      if (numero_um % numero_dois == 0) {
         resultado = 1;
      } //fim if
      else {
         resultado = 2;
      }  //fim else

      return resultado;
   } //fim verificar()
   
   public static void mensagem(int resultado) {
   
      if(resultado == 1) {
         System.out.print("\nO número é divisível\n");
      } //fim if
      else {
         System.out.print("\nO número não é divisível\n");
      } //fim else
   } //fim mensagem()
} //fim classe