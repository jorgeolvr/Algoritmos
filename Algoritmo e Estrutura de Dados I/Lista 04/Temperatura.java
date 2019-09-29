import java.util.Scanner;

public class Temperatura {

   public static void main (String[]args) {

   int qnt = 0;
   double temppositivo = 0.0;
   double tempnegativo = 0.0;
   int qntpositivo = 0;
   int qntnegativo = 0; 

   Scanner scanner = new Scanner(System.in);
   Temperatura obj = new Temperatura();

   System.out.print("Digite a quantidade de valores: ");
   qnt = scanner.nextInt();

   
   double temp[] = new double[qnt];
   
      for(int i = 0; i < qnt; i++)
      {
         System.out.print("Digite o valor das temperaturas : ");
         temp[i] = scanner.nextDouble();
         
         if(temp[i] > 0)
         {
            temppositivo +=temp[i];
            qntpositivo++;
         }
         else
         {
            tempnegativo +=temp[i];
            qntnegativo++;
         }
      }
         
   double mediapositivo = temppositivo / qntpositivo;
   double medianegativo = tempnegativo / qntnegativo;
   double amptermica = mediapositivo - medianegativo;

   System.out.print("A média das temperaturas positivas é: "+mediapositivo);
   System.out.print("\nA média das temperaturas negativas é: "+medianegativo);
   System.out.print("\nA amplitude térmica é: "+amptermica);

   } //fim main()
} //fim da class