import java.util.Scanner;

public class Chapa {
   public static void main (String[]args) {
   
   Scanner scanner = new Scanner(System.in);
   
   
   int voto = 2;
   int cont1 = 0;
   int cont2 = 0;
   
   System.out.println("|-------Elei��o-------|");
   System.out.println("| 1) Chapa01          |");
   System.out.println("| 2) Chapa02          |");
   System.out.println("| 0) Sair             |");
   System.out.println("|---------------------|");
        
   do {
   voto = 0;
   System.out.print("\nDigite o n�mero da chapa escolhida: ");
   voto = scanner.nextInt();
      if(voto > 2 || voto < 0)
      {
         System.out.print("\nVoto inv�lido\n"); 
      }
      
      if(voto == 0)
      {
         System.out.print("\nPrograma finalizado\n");   
      }

      if(voto == 1)
      {
         cont1++;
      }
      else if(voto == 2)
      {
         cont2++;
      }
   }while(voto != 0);
   
   if(cont1 > cont2)
   {
      System.out.print("\nA chapa 1 � vencedora das elei��es\n");      
   }
   else if (cont1 < cont2)
   {
      System.out.print("\nA chapa 2 � vencedora das elei��es\n");
   }
   else
   {
      System.out.print("\nHouve empate na elei��o\n");
   }
   
   System.out.print("\nO total de votos para a chapa 1 foi: "+cont1);
   System.out.print("\nO total de votos para a chapa 2 foi: "+cont2);
   
   } //fim da main()
} //fim da classe