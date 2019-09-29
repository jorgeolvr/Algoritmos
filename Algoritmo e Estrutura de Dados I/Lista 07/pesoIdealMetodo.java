import java.util.Scanner;

public class pesoIdealMetodo {
   public static void main(String[]args) {
   
   boolean repeticao = true;
   char resp = ' ';
   System.out.print("Peso ideal\n");
   
      do {
   
         char sexo = getSexo();   
         double altura = getAltura();
         switch (sexo) {
       
         case 'M': //Executa o cálculo caso o conteúdo da variável seja 'M'
            double verificar_peso_masc = verificarPesoMasc(sexo, altura); 
            mensagem(verificar_peso_masc);
            break;                    
         case 'F': //Executa o cálculo caso o conteúdo da variável seja 'F'
            double verificar_peso_fem = verificarPesoFem(sexo, altura);
            mensagem(verificar_peso_fem);
            break;     
         }   
              
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
      }while(repeticao == true); // fim do/while
   } // fim main()
   
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
   
   public static double verificarPesoMasc(char sexo, double altura) {

      double peso_masc = 0;
      peso_masc = (72.7 * altura) - 58;
      return peso_masc; 
   } //fim verificarPesoMasc()
   
   public static double verificarPesoFem(char sexo, double altura) {

      double peso_fem = 0;
      peso_fem = (62.1 * altura) - 44.7;
      return peso_fem; 
   } //fim verficarPesoFem()
   
   public static void mensagem(double resultado) {
   
   String valor = String.format("%.1f", resultado); //Reduz o número de casas decimais
   System.out.print("O seu peso ideal é "+valor+" Kg\n");       
   } //fim mensagem()
} //fim classe