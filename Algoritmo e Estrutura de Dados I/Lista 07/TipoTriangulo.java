import java.util.Scanner;

public class TipoTriangulo {
   public static void main(String[]args) {
   
   double cateto[] = new double[3];
   boolean repeticao = true;
   char resp = ' ';
   
      do {
   
         for(int i = 1; i < 3; i++) {
            cateto[i] = getCateto(i);
         }
   
         double hipotenusa = getHipotenusa();
         int resultado = verificar(cateto[0], cateto[1], hipotenusa);
   
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
   
   public static double getCateto(int i) {
      Scanner scanner = new Scanner(System.in);
      
      double cateto = 0;
      System.out.print("Digite o valor do "+i+"º cateto: ");
      cateto = scanner.nextDouble();
      
      return cateto;   
   } //fim getCateto()
   
   public static double getHipotenusa() {
      Scanner scanner = new Scanner(System.in);
      
      double hipotenusa = 0;
      System.out.print("Digite o valor da hipotenusa: ");
      hipotenusa = scanner.nextDouble();
      
      return hipotenusa; 
   } //fim getHipotenusa()
   
   public static int verificar(double cateto_um, double cateto_dois, double hipotenusa) {
   
      int resultado = 0;     
   
      if (cateto_um == cateto_dois && cateto_um == hipotenusa && cateto_dois == hipotenusa) 
      {
         resultado = 1;
      }
      else if (cateto_um != cateto_dois && cateto_um != hipotenusa && cateto_dois != hipotenusa)
      {
         resultado = 3;
      }
      else
      {
         resultado = 2;
      }  

      return resultado;
   } //fim verficar()
   
   public static void mensagem(int resultado) {
   
      if(resultado == 1) {
         System.out.print("\nO triângulo é equilátero\n");
      }
      else if(resultado == 2) {
         System.out.print("\nO triângulo é isósceles\n");
      }
      else {
         System.out.print("\nO triângulo é escaleno\n");
      }  
   } //fim mensagem()
} //fim classe