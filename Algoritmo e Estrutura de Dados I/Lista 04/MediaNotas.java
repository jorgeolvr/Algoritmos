import java.util.Scanner;

public class MediaNotas {
   public static void main (String[]args) {
   
   Scanner scanner = new Scanner(System.in);
   
   int repeticao = 1;
   int num_alunos = 0;
   
   System.out.print("Digite o número de alunos: ");
   num_alunos = scanner.nextInt();
   
   double notas[] = new double[100];
   
   int aprovados = 0;
   int reprovados = 0;
   double maior = 0;
   double media = 0;
  
   while(repeticao <= num_alunos)
   {
   media = 0;
   System.out.print("\nNotas do "+repeticao+"º aluno");
      for(int i = 0; i < 3; i++)
      {
            System.out.print("\nDigite a nota: ");
            notas[i] = scanner.nextInt();
            media += notas[i];
      }
      
      media /= 3;
      
      System.out.print("A média é: "+media);
      
      if(media >=60 && media <= 100)
      {
         aprovados++;
         System.out.print("\nO aluno foi Aprovado\n");
      }
      else
      {
         reprovados++;
         System.out.print("\nO aluno foi Reprovado\n");
      }
      repeticao++;
   }
   
    System.out.print("\nO número de alunos aprovados foi: "+aprovados);
    System.out.print("\nO número de alunos reprovados foi: "+reprovados);

   
   } //fim main()
} //fim  class