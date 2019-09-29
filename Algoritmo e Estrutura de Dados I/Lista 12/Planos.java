import java.util.Scanner;

public class Planos {
   public static void main(String[]args) {

      menu();


   }
   
   public static void menu() {
      Triangulo menu = new Triangulo();
      Scanner scanner = new Scanner(System.in);
      System.out.println("1) Criar tri�ngulo");
      System.out.println("2) Criar Circulo");
      System.out.print("Digite sua op��o: ");
      int opcao = scanner.nextInt();
      
      if(opcao == 1) {
         menu.menuTriangulo();
      }
     // else if(opcao == 2) {
     //    menuCirculo();
     // }
   }

class Triangulo {
   Scanner scanner = new Scanner(System.in);

   private double cateto_um;
   private double cateto_dois;
   private double hipotenusa;
   
     
    public static void menuTriangulo() {
            
   Triangulo [] arranjo = new Triangulo [100];
   Triangulo triangulo = new Triangulo();
      Scanner scanner = new Scanner(System.in);

      int opcao = 0;
      
      System.out.println("\nMenu de cria��o de triangulos");
      System.out.println("1) Ler novo tri�ngulo");
      System.out.println("2) Listar tri�ngulos");
      System.out.println("3) Pesquisar tri�ngulo");
      System.out.println("4) Verificar per�metro");
      System.out.print("\nDigite sua op��o: ");
      opcao = scanner.nextInt();
      
      switch(opcao) {
         case 0:
            System.out.print("N�o � tri�ngulo");
            break;
         case 1:
               triangulo = new Triangulo(); //O new cria um novo objeto
                  double cateto_um = triangulo.Read();
                  double cateto_dois = triangulo.Read();
                  double hipotenusa = triangulo.Read();
                  
                  triangulo.SetCateto_um(cateto_um);
                  triangulo.SetCateto_dois(cateto_dois);
                  triangulo.SetHipotenusa(hipotenusa);

            for(int i = 0; i < arranjo.length; i++) {   

               arranjo[i] = triangulo;
            }
            
            menuTriangulo();
            break;
         case 2:
         
            
            triangulo.Write();
            menuTriangulo();
            break;              
      }

   }

      
   Triangulo() {
      SetCateto_um(0);
      SetCateto_dois(0);
      SetHipotenusa(0);
   }
   
   Triangulo(double cateto_um, double cateto_dois, double hipotenusa) {
      SetCateto_um(cateto_um);
      SetCateto_dois(cateto_dois);
      SetHipotenusa(hipotenusa);  
   }
   
   public void SetCateto_um(double lado) {
      this.cateto_um = lado;
   }
   
   public void SetCateto_dois(double lado) {
      this.cateto_dois = lado;
   }
   
   public void SetHipotenusa(double lado) {
      this.hipotenusa = lado;
   }
   
   public double GetCateto_um() {
      return this.cateto_um;
   }
   
   public double GetCateto_dois() {
      return this.cateto_dois;
   }
   
   public double GetHipotenusa() {
      return this.hipotenusa;
   }
   
   public double Read() {
      System.out.print("Digite o valor do tri�ngulo: ");
      double valor = scanner.nextDouble();
      
      return valor;
   }
   
   public void Write() {
      System.out.println("\nOs lados s�o: "+GetCateto_um()+" "+GetCateto_dois()+" "+GetHipotenusa());
   }
   
   public boolean isTriangulo() {
      boolean verificacao = false;
       
      if(this.cateto_um + this.cateto_dois > this.hipotenusa && this.cateto_dois + this.hipotenusa > this.cateto_um && this.cateto_um + this.hipotenusa > this.cateto_dois) {
         verificacao = true;
      }  
      return verificacao;
   }
   
   public int Tipo(boolean triangulo) {
      int num_tipo = 0;
      
      if(triangulo == false) {
         num_tipo = 0;
      }
      else {
         if (this.cateto_um == this.cateto_dois && this.cateto_um == this.hipotenusa && this.cateto_dois == this.hipotenusa)
         {
            num_tipo = 1;   
         }
         else if (this.cateto_um != this.cateto_dois && this.cateto_um != this.hipotenusa && this.cateto_dois != this.hipotenusa)
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
   
   public void escreveTipo(boolean triangulo) {
      int tipo_triangulo = Tipo(triangulo);
       
      switch(tipo_triangulo) {
         case 0:
            System.out.println("\nN�o � um tri�ngulo");
            break;
         case 1:
            System.out.println("\nO tri�ngulo � escaleno");
            break;
         case 2:
            System.out.println("\nO tri�ngulo � equil�tero");
            break;
         case 3:
            System.out.println("\nO tri�ngulo � is�sceles");
            break;
      }
   }
   
   public double perimetro(boolean verificacao) {
      double perimetro = 0;
      if(verificacao == true) {
         perimetro = this.cateto_um + this.cateto_dois + this.hipotenusa;
       
         System.out.println("\nO per�metro do tri�ngulo �: "+perimetro);
      }
      else {
         System.out.println("\nN�o � poss�vel calcular o per�metro");
      }
      return perimetro;
   }
}

class Circulo {
   Scanner scanner = new Scanner(System.in);
   private double raio;
   
   Circulo() {
      SetRaio(0);
   }
   
   Circulo(double raio) {
      SetRaio(raio);
   }
   
   public void SetRaio(double raio) {
      this.raio = raio;
   }
   
   public double GetRaio() {
      return this.raio;
   }
   
   public double Read() {
      System.out.print("\nDigite o raio do circulo: ");
      double valor = scanner.nextDouble();
      
      return valor;
   }
   
   public void Write() {
      System.out.print("\nO raio �: "+GetRaio());
   } 
}
}