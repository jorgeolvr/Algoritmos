public class ExemploPOO {
   public static void main(String[]args) {
   Triangulo A = new Triangulo(5,7,8);
   
   A.Setlado1(7);
   A.Setlado2(2);
   A.Setlado3(9);
   
   Triangulo B = new Triangulo(3,2,1);
   
   A.escreve();
   B.escreve();
   
   A.escreveTipo();
   B.escreveTipo();
   
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
   
   public void escreve() {
      System.out.println("Os lados do triângulo são: "+Getlado1()+", "+Getlado2()+", "+Getlado3()+".");  
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
   
   public void escreveTipo() {
      int tipo_triangulo = Tipo();
      
      switch(tipo_triangulo) {
         case 0:
            System.out.println("
            break;
         case 1:
            
   }
   
   public int Tipo() {
      
   } 
   
   public boolean 
}