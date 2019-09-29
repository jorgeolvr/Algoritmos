import java.util.Scanner;

public class POO {
   public static void main(String[]args) {
   
   Triangulo valores = new Triangulo();
   
   double cateto_um = valores.Read();
   double cateto_dois = valores.Read();
   double hipotenusa = valores.Read();
   
   Triangulo triangulo = new Triangulo(cateto_um, cateto_dois, hipotenusa);
   
   triangulo.escreve();
   
   boolean verificacao = triangulo.isTriangulo();
   
   triangulo.Tipo(verificacao);
   
   triangulo.escreveTipo(verificacao);
   
   triangulo.perimetro(verificacao);
   
   Arranjo arranjo = new Arranjo();
   
   arranjo.Escolha(verificacao);

   }
}

class Triangulo {

   private double lado1;
   private double lado2;
   private double lado3;
   
   public void Setlado1(double l) {
      this.lado1 = l;
   }
   
   public void Setlado2(double l) {
      this.lado2 = l;
   }
   
   public void Setlado3(double l) {
      this.lado3 = l;
   }
   
   Triangulo(double l1, double l2, double l3) {
      Setlado1(l1);
      Setlado2(l2);
      Setlado3(l3);
   }
   
   Triangulo() {
      Setlado1(0);
      Setlado2(0);
      Setlado3(0);
   }
   
   public double read() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Digite o valor do triângulo: ");
      double valor = scanner.nextDouble();
      
      return valor;  
   }
   
   public void escreve() {
      System.out.println("\nOs valores digitados correspondente aos lados são: "+Getlado1()+", "+Getlado2()+", "+Getlado3());  
   }
   
   public double Getlado1() {
      return this.lado1;
   }
   
   public double Getlado2() {
      return this.lado2;
   }
   
   public double Getlado3() {
      return this.lado3;
   }
   
   public void escreveTipo(boolean triangulo) {
      int tipo_triangulo = Tipo(triangulo);
      
      switch(tipo_triangulo) {
         case 0:
            System.out.println("\nNão é um triangulo");
            break;
         case 1:
            System.out.println("\nO triângulo é escaleno");
            break;
         case 2:
            System.out.println("\nO triângulo é equilátero");
            break;
         case 3:
            System.out.println("\nO triângulo é isósceles");
            break;
      }
   }
   
   public int Tipo(boolean triangulo) {
      int num_tipo = 0;
     
      if(triangulo == false) {
         num_tipo = 0;
      }
      else {
         if (this.lado1 == this.lado2 && this.lado1 == this.lado3 && this.lado2 == this.lado3) //Condição lógica de determinação do tipo de triângulo
         {
            num_tipo = 1;   
         }
         else if (this.lado1 != this.lado2 && this.lado1 != this.lado3 && this.lado2 != this.lado3) //Condição lógica de determinação do tipo de triângulo
         {
            num_tipo = 3;
         }
         else
         {
            num_tipo = 2;
         }  
      }
      return num_tipo;
   } 
   
   public boolean isTriangulo() {
      boolean verificacao = false;
      
      if( this.lado1 + this.lado2 > this.lado3 && this.lado2 + this.lado3 > this.lado1 && this.lado1 + this.lado3 > this.lado2) { //Verificando se os números satisfazem a condição para ser triângulo
         verificacao = true;
      }  
      return verificacao;
   }

   public double perimetro(boolean verificacao) {
   double perimetro = 0;
      if(verificacao == true) {
         perimetro = this.lado1 + this.lado2 + this.lado3;
      
         System.out.println("\nO perímetro do triângulo é: "+perimetro);
      }
      else {
         System.out.println("\nNão é possível calcular o perímetro");
      }
      return perimetro;
   }
}

class Arranjo {

   
   public int Menu() {
   int opcao = 0;
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("\nMenu de criação de triangulos");
   System.out.println("1) Ler novo triângulo");
   System.out.println("2) Listar triângulos");
   System.out.println("3) Pesquisar triângulo");
   System.out.println("4) Verificar perímetro");
   System.out.print("\nDigite sua opção: ");
   opcao = scanner.nextInt(); 
   System.out.print(opcao);
   return opcao;
   }
   
   public void Escolha(boolean verificacao) {
      int opcao = Menu();
      char resposta = ' ';
      boolean repeticao = false;
      Scanner scanner = new Scanner(System.in);
      if(opcao == 1) {
               Menu();
      }
            
      if(opcao == 2) {
         System.out.print("Listagem de triângulos: ");
            for(int i = 0; i < arranjo_triangulo.length; i++) {
               if(arranjo_triangulo[i] != null) {
                  System.out.print("Triângulo "+i+" "+arranjo_triangulo[i].Getlado1());
                  System.out.print(" "+arranjo_triangulo[i].Getlado2());
                  System.out.print(" "+arranjo_triangulo[i].Getlado3());
               }
            }
      Menu();
      }
            
      if(opcao == 3) {
         int posicao;
         System.out.print("Pesquisa de triângulos: ");
         System.out.print("Digite a posição do triângulo: ");
         posicao = scanner.nextInt();
            
           for(int i = 0; i < arranjo_triangulo.length; i++) {
               if(posicao == i) {
                  System.out.print("A posição "+i+" tem os valores: "+arranjo_triangulo[i].Getlado1());
                  System.out.print(" "+arranjo_triangulo[i].Getlado2());
                  System.out.print(" "+arranjo_triangulo[i].Getlado3());
               }
            }
      Menu(); 
      }
            
      if(opcao == 4) {
         int posicao;
         System.out.print("Perímetro de triângulos: ");
         System.out.print("Digite a posição do triângulo: ");
         posicao = scanner.nextInt();
            
            for(int i = 0; i < arranjo_triangulo.length; i++) {
               if(posicao == i) {
               System.out.print("A posição "+i+" tem o perimetro: "+arranjo_triangulo[i].perimetro(verificacao));
            }
         } 
         Menu();
      }     
   }
}