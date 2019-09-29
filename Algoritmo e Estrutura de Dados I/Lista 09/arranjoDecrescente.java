import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class arranjoDecrescente {
   public static void main(String[]args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Digite o tamanho do arranjo: ");
      int qnt = scanner.nextInt();
      
      Integer[]arranjo = new Integer[qnt];
      
      validacao(arranjo);
      
      Arrays.sort(arranjo, Collections.reverseOrder());
      //Imprime o Array
      System.out.print("A ordem decrescente é: ");
      for(int i: arranjo) {
         System.out.print(i+" ");
      } //fim for()
   } //fim main()
   
   public static void validacao(Integer[]arranjo) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("\n");
      
      for(int i = 0; i < arranjo.length; i++) {
         System.out.print("Digite o "+(i+1)+"º valor: ");
         arranjo[i] = scanner.nextInt();                
      } //fim for()
   } //fim validacao()
} //fim classe