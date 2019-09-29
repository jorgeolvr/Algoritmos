import java.util.Scanner;

public class DiasVida {

   public static void main (String [] args){
   
      Scanner scanner = new Scanner(System.in); //Instanciando objeto da classe Scanner()
      
      int idade = 0, ano_atual = 0, ano_nasc = 0, dias_vida = 0;
      
         System.out.print("Digite a data de nascimento: ");
         ano_nasc = scanner.nextInt();
      
         System.out.print("Digite o ano atual: ");
         ano_atual = scanner.nextInt();
         
         idade = ano_atual - ano_nasc;
         
         dias_vida = idade * 365;
         
         System.out.print("Você viveu "+dias_vida+" dias");

         } //Fim da main()
} //Fim da classe
