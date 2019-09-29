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
      System.out.println("Digite o valor da posi��o "+i+":");
      obj.numero[i] = scanner.nextDouble(); //A vari�vel recebece o valor digitado pelo usu�rio
   }
   
   System.out.println("Menor numero �: " + obj.getMenor()); //Executa o m�todo getMaior()
   System.out.println("Maior numero �: " + obj.getMaior()); //Executa o m�todo getMenor()
} // Fim da main()


public double getMaior()
{
   double maior = numero[0]; //A vari�vel maior recebe o valor da vari�vel numero na posi��o 0 
   
   for (int i = 0; i < numero.length; i++) //Realiza o la�o at� atingir o n�mero de vetores
   {
      if (numero[i] > maior) //Verifica se o n�mero nas demais posi��es s�o maiores do que a contida na vari�vel maior
      {
         maior = numero[i]; //Caso seja maior, o valor do vetor � atribu�do a vari�vel maior
      }
   }
return maior; //Termina retornando a vari�vel maior n�mero
}

public double getMenor()
{
   double menor = numero[0]; //A vari�vel menor recebe o valor da vari�vel numero na posi��o 0 
   
   for (int i = 0; i < numero.length; i++) //Realiza o la�o at� atingir o n�mero de vetores
   {
      if (numero[i] < menor) //Verifica se o n�mero nas demais posi��es s�o menores do que a contida na vari�vel menor
      {
         menor = numero[i]; //Caso seja menor, o valor do vetor � atribu�do a vari�vel menor
      }
   }
return menor; //Termina retornando a vari�vel menor n�mero
} //Fim do m�todo getMenor()
} //Fim da classe
