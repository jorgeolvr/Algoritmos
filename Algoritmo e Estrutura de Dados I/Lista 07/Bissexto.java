import java.util.Scanner; //Importando o recurso Scanner do pacote util
 
public class Bissexto {
   public static void main (String[]args) {
   
       int ano = getAno();
       
       boolean resultado = verificar(ano);
       
       mensagem(resultado);         
   } //fim main()
   
   public static int getAno() {
   
      Scanner scanner = new Scanner(System.in);
   
      System.out.print("Digite o ano: ");
      int ano = scanner.nextInt();
   
      return ano; 
   } //fim getAno()
   
   public static boolean verificar(int ano) {
   
      boolean bissexto = false;
   
      if(ano%400 == 0) {
         bissexto = true;
      } //fim if
      
      else if (ano%100 != 0 && ano%4 == 0) {
         bissexto = true;
      } // fim else if
   
      return bissexto;
   } //fim verficar()
   
   public static void mensagem(boolean resultado) {
   
      if(resultado) {
         System.out.println("O ano é bissexto");
      } //fim if
      else {
         System.out.println("O ano não é bissexto");
      } //fim else
   } //fim mensagem()
} //fim classe