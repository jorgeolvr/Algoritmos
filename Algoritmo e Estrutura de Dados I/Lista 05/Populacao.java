import java.util.Scanner;

public class Populacao{
   public static void main(String [] args){
      Scanner scanner = new Scanner(System.in);
      
      int idade=0;
      int maior = 0;
      char sexomaior = ' ';
      String sexoextenso = " ";
      char sexo = ' ';
      double contm = 0;
      double contf = 0;
      double total = 0;
      double porcm = 0;
      double porcf = 0;
      
      while(idade >= 0)
      {
      System.out.print("Digite a idade: ");
      idade = scanner.nextInt();
      
         if(idade < 0)
         {
            System.out.print("\nPrograma finalizado\n");
         }
      
         if (idade >= 0 || idade > 150)
         {
            System.out.print("Digite o sexo: ");
            sexo = scanner.next().charAt(0);
      
            sexo = Character.toUpperCase(sexo);
      
            total++;
      
            if(idade > maior)
            {
               maior = idade;
               sexomaior = sexo;
            }
      
            if(sexomaior == 'F')
            {
               sexoextenso = "feminino";
            }
            else
            {
               sexoextenso = "masculino";
            }
      
            if(sexo == 'M')
            {
               contm++;
            }
            else
            {
               contf++;
            }
      
            if(sexo != 'M' && sexo != 'F')
            {
               System.out.print("Sexo inválido\n");
            }
         }
      }
      
      porcm = (contm/total)*100;
      porcf = (contf/total)*100;
            
      System.out.print("\nA porcentagem de pessoas do sexo masculino é: "+porcm+"%");
      System.out.print("\nA porcentagem de pessoas do sexo feminino é: "+porcf+"%");
      System.out.print("\nA maior idade é "+maior+" anos e essa pessoa é do sexo "+sexoextenso);        
   } //fim da main()
} //fim da classe