import java.util.Scanner;
abstract class FiguraGeo
{
	public abstract double perimetro();
}
class Triangulo extends FiguraGeo
{
	private double lado1;
	private double lado2;
	private double lado3;

	public void setlado1(double lado)
	{
		this.lado1=lado;
	}
	public void setlado2(double lado)
	{
		this.lado2=lado;
	}
	public void setlado3(double lado)
	{
		this.lado3=lado;
	}
	Triangulo(double L1, double L2, double L3)
	{
		setlado1(L1);
		setlado2(L2);
		setlado3(L3);
	}
	Triangulo(){}

	public void escreve()
	{
		System.out.println("Os lados do triângulo são:"+ getlado1()+","+getlado2()+","+getlado3());
	}
	public double getlado1()
	{
		return this.lado1;
	}
	public double getlado2()
	{
		return this.lado2;
	}
	public double getlado3()
	{
		return this.lado3;
	}
	public void escreveTipo()
	{
		int tipo_triangulo=Tipo();
		if(tipo_triangulo==0)System.out.println("Não é triângulo.");
		if(tipo_triangulo==1)System.out.println("Isósceles.");
		if(tipo_triangulo==2)System.out.println("Escaleno.");
		if(tipo_triangulo==3)System.out.println("Equilátero.");
	}
	public int Tipo()
    {
      int T=0;
      if(ehTriangulo()==true)
      {
    	if(this.lado1==this.lado2 && this.lado1==lado3)T=3;
    	if(((this.lado1!=this.lado2)&& (this.lado1!=this.lado3)&&(this.lado2==this.lado3))||((this.lado2!=this.lado1)&&(this.lado2!=this.lado3)&&(this.lado1==this.lado3))||((this.lado3!=this.lado1)&&(this.lado3!=this.lado2)&&(this.lado1==this.lado2)))T= 1;
    	if((this.lado1!=this.lado2)&&(this.lado1!=this.lado3)&&(this.lado2!=this.lado3))T=2;
      }
      return T;
    }
    public boolean ehTriangulo()
    {
    	double A=getlado1();
    	double B=getlado2();
    	double C=getlado3();
    	boolean F;
    	if((Math.abs(B-C))<A && A <((B+C))&&((Math.abs(A-C))<B && B<(A+C))&&((Math.abs(A-B))<C && C<(A+B)))F=true;
    	else F=false;
    	return F; 
    }
    public double perimetro()
    {
    	if(ehTriangulo()==true)
    	{
    		return getlado1()+getlado2()+getlado3();
    	}
    	else return 0;
    }
    public void le()
    {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Digite os lados do triângulo:");
    	double L1=scanner.nextDouble();
    	double L2=scanner.nextDouble();
    	double L3=scanner.nextDouble();
    	this.setlado1(L1);
    	this.setlado2(L2);
    	this.setlado3(L3);
    }			

}   
class Circulo extends FiguraGeo
{
	private double raio;

	Circulo(){}
	Circulo(double R)
	{
		setRaio(R);
	}
	
	public void setRaio(double R)
	{
		this.raio=R;
	}

	public double getRaio()
	{
		return this.raio;
	}

	public void escreve()
	{
		System.out.println("O raio do círculo é "+ getRaio());
	}

	public void le()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o raio do círculo:");
		double R =scanner.nextDouble();
		this.setRaio(R);
	}

	public double perimetro()
	{
		return 6.28*getRaio();
	}

}
class triangulo_arranjo
{
	private double [][]A= new double[100][3];
	private String [] B=new String[100];
	public void menu()
	{
		System.out.println("Menu triângulo.");
		System.out.println("1-Ler um novo triângulo.");
		System.out.println("2-Listar todos os triângulos criados.");
		System.out.println("3-Escrever o triângulo na posição desejada.");
		System.out.println("4-Verificar o tipo de triângulo na posição desejada.");
		System.out.println("5-Verificar o perímetro do triângulo na posição desejada.");
		System.out.println("6-Sair.");
		int z=0,i=0,option;
		do
		{
			System.out.println("Digite a opção:");
		    Scanner scanner = new Scanner(System.in);
		    option=scanner.nextInt();
		    switch(option)
		    {
			    case 1: read_triangle_array(A,B,i,z);
			            i++;
			            z++;
			    break;
			    case 2: show_all_triangles(B,z);
			    break;
			    case 3: show_triangles(B,z);
			    break;
			    case 4: type_triangle(A,z);
			    break;
			    case 5: escreve_perimetro(A,z);
			    break;
			    case 6: System.out.println("Sair menu triângulo.");
			    break;
			    default : System.out.println("Opção inválida.");
		    }


		}while(option!=6);
		
	}
    public void read_triangle_array(double [][]A, String []B,int i,int z)
    {
    	System.out.println("Digite o nome deste triângulo:");
    	Scanner scanner = new Scanner(System.in);
    	B[z]=scanner.next();
    	System.out.println("Digite os lados do triângulo");
    	for(int j=0;j<A[i].length;j++)
    	{
    		A[i][j]=scanner.nextDouble();
    	}
     
    }
    public void show_all_triangles(String []B, int z)
    {
      for(int v=0;v<=z;v++)
      {
         System.out.println("Na posição "+v+" temos o triângulo "+ B[v]);
      }
    
    
    }
    public void show_triangles(String []B, int z)
    {
      System.out.println("Digite a posição do triângulo que deseja verificar: ");
      Scanner scanner = new Scanner(System.in);
      int K=scanner.nextInt();
      if(K<z)System.out.println(B[K]);
      else System.out.println("Não há triângulo nessa posição.");
    
    
    }
    public void type_triangle(double [][]A, int z)
    {
      System.out.println("Digite a posição do triângulo que deseja verificar: ");
      Scanner scanner = new Scanner(System.in);
      int K=scanner.nextInt();
      if(K<z)
      {
        double B=A[K][0];
        double C=A[K][1];
        double D=A[K][2];
        if((B==C) && (B==D))
        {
          System.out.println("\n\n Este triângulo é equilátero");
        }
        else if(((B!=C)&&(B!=D)&&(C==D))||((C!=B)&&(C!=D)&&(B==D))||((D!=B)&&(D!=C)&&(B==C)))
        {
          System.out.println("\n\n Este triângulo é isósceles");
        }
        else
        {
          System.out.println("\n\n Este triângulo é escaleno");
        }  
      }
      else System.out.println("Não há triângulo nessa posição.");
    } 
    public void escreve_perimetro(double [][]A,int z)
    {
      System.out.println("Digite a posição do triângulo que deseja verificar: ");
      Scanner scanner = new Scanner(System.in);
      int K=scanner.nextInt();
      if(K<z)
      {	
        double P=A[K][0]+A[K][1]+A[K][2];
        System.out.println("O perímetro é "+P);
      }
      else System.out.println("Não há triângulo nessa posição.");  
    }    
}
class circulo_arranjo
{
	private double [] A= new double[100];
	private String [] B= new String[100];

	public void menu()
	{
		System.out.println("Menu:círculo.");
		System.out.println("1_Ler um novo círculo.");
		System.out.println("2_Listar todos os triângulos listados.");
		System.out.println("3_Mostrar círculo na posição desejada.");
		System.out.println("4_Mostrar perímetro do círculo.");
		System.out.println("5_Sair.");
		int z=0,i=0,option;

		do
		{
			System.out.println("Digite a opção");
			Scanner scanner = new Scanner(System.in);
			option=scanner.nextInt();
			switch(option)
			{
				case 1: read_circule(A,B,z,i);
				z++;
				break;
				case 2: show_all_circules(B,z);
				break;
				case 3: show_circule(B,z);
				break;
				case 4: escreve_perimetro(A,z);
				break;
				case 5: System.out.println("Sair menu círculo.");
				break;
				default: System.out.println("Opção inválida.");

			}


		}while(option!=5);

	}

	public static void read_circule(double[] A, String[]B,int z,int i)
	{
		System.out.println("Digite o nome do círculo:");
		Scanner scanner = new Scanner(System.in);
		B[z]=scanner.next();
		System.out.println("Digite o raio do círculo");
		A[i]=scanner.nextDouble();
	}

	public static void show_all_circules(String []B, int z)
	{
        System.out.println("Os círculos são:");
		for(int j=0;j<z;j++)
		{
			System.out.println(B[j]);
		}	
	}

	public static void show_circule(String []B,int z)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a posição do círculo que deseja verificar:");
        int X=scanner.nextInt();
        if(X<z)System.out.println(B[X]);
        else System.out.println("Não há círculo nessa posição.");
	}

	public static void escreve_perimetro(double []A,int z)
	{
		System.out.println("Digite a posição do triângulo que deseja verificar: ");
        Scanner scanner = new Scanner(System.in);
        int K=scanner.nextInt();
		if(K<z) System.out.println("O perímetro é: "+ (6.28*A[K]));
		else System.out.println("Não há círculo nessa posição.");
	}		
	
}
public class trabalhopratico25
{
	public static void main(String[]args)
	{
		System.out.println("Trabalho prático 2.");
		Triangulo A = new Triangulo();
		A.le();
		A.escreve();
		A.escreveTipo();
		System.out.println("Perímetro é "+A.perimetro());
		Circulo B = new Circulo();
		B.le();
		B.escreve();
		System.out.println("O perímetro é "+ B.perimetro());
		circulo_arranjo C= new circulo_arranjo();
		triangulo_arranjo T= new triangulo_arranjo();
		char G;
		do
		{
			G=menu_figGeo();
			if(G=='C') C.menu();
			if(G=='T') T.menu();
            if(G=='S') System.out.println("Programa encerrado.");
            else System.out.println("Opção inválida.");
		}while (G!='S');

	}
	public static char menu_figGeo()
	{
		System.out.println("Digite a figura geométrica desejada:Triângulo ou círculo?");
		System.out.println("Se desejar sair do programa, digite sair.");
		Scanner scanner = new Scanner(System.in);
		char G=scanner.next().charAt(0);
		G=Character.toUpperCase(G);
		return G;
	}
}
