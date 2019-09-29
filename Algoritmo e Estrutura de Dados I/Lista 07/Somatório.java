import java.util.Scanner;

public class Somat�rio {
   public static void main(String[]args) {
      
      int opcao = 0;
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("----------SOMAT�RIO----------");
      System.out.println("| 1) Escolha um n�mero      |");
      System.out.println("| 2) Sair do programa       |");
      System.out.println("-----------------------------");
      
      System.out.print("\nDigite a sua op��o: ");
      opcao = scanner.nextInt();
      
      switch(opcao) {
         
         case 1:
         
              int somatorio = somatorio();
              mensagem(somatorio);
              
              break;
              
         case 2:
         
              System.out.print("Programa finalizado");
              break;
         
         default:
               
              System.out.print("Op��o inv�lida");
      } //fim switch
   } // fim main()
   
   public static int somatorio() {
      
      int num = 0;
      int numero = 1;
      int somatorio = 0;
      
      Scanner scanner = new Scanner(System.in);
      System.out.print("Digite a quantidade de n�meros: ");
      num = scanner.nextInt();
      
      for(int i = 0; i < num; i++) {
         somatorio += numero;
         numero++;
      } //fim for
      return somatorio;
   } //fim somatorio()
   
   public static void mensagem(int resultado) {
      
      System.out.println("O resultado do somat�rio �: "+resultado);
   } //fim mensagem()
} //fim classe