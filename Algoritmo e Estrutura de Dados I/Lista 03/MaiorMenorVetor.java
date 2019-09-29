import java.util.Scanner;

public class MaiorMenorVetor
{
public double numero[] = new double[10];

public static void main (String [] args)
{
   Scanner scanner = new Scanner(System.in); //Instanciando objeto da classe Scanner()
   MaiorMenorVetor obj = new MaiorMenorVetor(); // Instanciando objeto da classe MaiorMenorVetor()
      
   for (int i = 0; i < obj.numero.length; i++)
   {
      System.out.println("Digite o valor da posição "+i+":");
      obj.numero[i] = scanner.nextDouble(); //A variável recebece o valor digitado pelo usuário
   }
   
   System.out.println("Menor numero é: " + obj.getMenor()); //Executa o método getMaior()
   System.out.println("Maior numero é: " + obj.getMaior()); //Executa o método getMenor()
} // Fim da main()


public double getMaior()
{
   double maior = numero[0]; //A variável maior recebe o valor da variável numero na posição 0 
   
   for (int i = 0; i < numero.length; i++) //Realiza o laço até atingir o número de vetores
   {
      if (numero[i] > maior) //Verifica se o número nas demais posições são maiores do que a contida na variável maior
      {
         maior = numero[i]; //Caso seja maior, o valor do vetor é atribuído a variável maior
      }
   }
return maior; //Termina retornando a variável maior número
}

public double getMenor()
{
   double menor = numero[0]; //A variável menor recebe o valor da variável numero na posição 0 
   
   for (int i = 0; i < numero.length; i++) //Realiza o laço até atingir o número de vetores
   {
      if (numero[i] < menor) //Verifica se o número nas demais posições são menores do que a contida na variável menor
      {
         menor = numero[i]; //Caso seja menor, o valor do vetor é atribuído a variável menor
      }
   }
return menor; //Termina retornando a variável menor número
} //Fim do método getMenor()
} //Fim da classe
