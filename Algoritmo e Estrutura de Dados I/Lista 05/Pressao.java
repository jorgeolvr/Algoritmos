import java.util.Scanner;

public class Pressao {
   public static void main (String[]args) {
   
   Scanner scanner = new Scanner(System.in);

   int amostras = 0;
   int media = 0;
   int total = 0;
   int cont = 1;
   int maior = 0;
      
   System.out.print("Digite o número de amostras: ");
   amostras = scanner.nextInt();
   
   int pressao[] = new int[amostras];
   
   for (int i=0; i < amostras; i++)
   {
      System.out.print("Digite a pressão da "+cont+"ª amostra: ");
      pressao[i] = scanner.nextInt();
      if(pressao[i] >= 1)
      {
         total += pressao[i];
         cont++;
      }
      else
      {
         System.out.print("\nValor da pressão é inválido\n");
      }
      
      if(maior <= pressao[i])
      {
         maior = pressao[i];
      }   
   }
   
   media = total/amostras;
   
   System.out.print("\nA maior pressão é: "+maior);
   System.out.print("\nO valor médio da pressão é: "+media);
   
   } //fim da main()
} //fim da classe