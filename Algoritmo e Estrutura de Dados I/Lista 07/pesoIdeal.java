import java.util.Scanner;

public class pesoIdeal {
   public static void main(String[]args) {
   
   boolean repeticao = true;
   char resp = ' ';
   System.out.print("Peso ideal\n");
   
      do {
   
         char sexo = getSexo();   
         double altura = getAltura();
         double verificar_peso = verificarPeso(sexo, altura);
   
         mensagem(verificar_peso);
      
         Scanner scanner = new Scanner(System.in);
         System.out.print("\nDeseja Continuar o programa? ");
         resp = scanner.next().charAt(0);
         resp = Character.toUpperCase(resp);
      
         if(resp == 'N') {
            repeticao = false;
         } //fim if
         else if(resp == 'S') {
            repeticao = true;
         } //fim else if
      }while(repeticao == true); //fim do/while
   }
   
   public static char getSexo() {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("\nDigite seu sexo(M/F): ");
      char sexo = scanner.next().charAt(0);
      sexo = Character.toUpperCase(sexo);
      
      return sexo;   
   } //fim getSexo()
   
   public static double getAltura() {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Digite a sua altura: ");
      double altura = scanner.nextDouble();
      
      return altura;   
   } //fim getAltura()
   
   public static double verificarPeso(char sexo, double altura) {

      double peso = 0;
      switch (sexo) {
       
         case 'M': //Executa o cálculo caso o conteúdo da variável seja 'M'
         
            peso = (72.7 * altura) - 58;
            break; 
                     
         case 'F': //Executa o cálculo caso o conteúdo da variável seja 'F'
        
            peso = (62.1 * altura) - 44.7;
            break;     
      } //fim switch
      return peso; 
   } //fim verificarPeso()
   
   public static void mensagem(double resultado) {
   
      String valor = String.format("%.1f", resultado); //Reduz o número de casas decimais
      System.out.print("O seu peso ideal é "+valor+" Kg\n");     
   } //fim mensagem()
} //fim classe