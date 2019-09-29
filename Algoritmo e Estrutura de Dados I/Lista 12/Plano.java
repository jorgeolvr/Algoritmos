import java.util.Scanner;

public class Plano {
   public static void main(String[]args) {
   
      int [] ponto_um = new int [2];
      int [] ponto_dois = new int [2];
      
      coordenada_um(ponto_um);
      coordenada_dois(ponto_dois);
      
      Intermediario intermediario = new Intermediario(ponto_um, ponto_dois);
      
      intermediario.escreve();
      
   }
   
   public static void coordenada_um(int [] ponto_um) {
      Scanner scanner = new Scanner(System.in);
      
      int x = 0;
      int y = 0;
      
      System.out.print("Digite o valor de X: ");
      x = scanner.nextInt();
      
      System.out.print("Digite o valor de Y: ");
      y = scanner.nextInt();
           
      ponto_um[0] = x;
      ponto_um[1] = y;
   }
   
    public static void coordenada_dois(int [] ponto_dois) {
      Scanner scanner = new Scanner(System.in);
      
      int x = 0;
      int y = 0;
      
      System.out.print("Digite o valor de X: ");
      x = scanner.nextInt();
      
      System.out.print("Digite o valor de Y: ");
      y = scanner.nextInt();
           
      ponto_dois[0] = x;
      ponto_dois[1] = y;
   }
}

class Intermediario {
   private int [] pontomedio = new int [2];
   
   Intermediario(int [] ponto_um, int [] ponto_dois) {
      setPontoMedioX(ponto_um);
      setPontoMedioY(ponto_dois);
   }
   
   public void setPontoMedioX(int [] ponto_um) {
      this.pontomedio[0] = (ponto_um[0] + ponto_um[1])/2;
   }
   
   public void setPontoMedioY(int [] ponto_dois) {
      this.pontomedio[1] = (ponto_dois[0] + ponto_dois[1])/2;
   }
   
   public int getPontoMedioX() {
      return this.pontomedio[0];
   }
   
   public int getPontoMedioY() {
      return this.pontomedio[1];
   }
   
   public void escreve() {
      System.out.print("Os pontos médios são: " +getPontoMedioX()+ " e " +getPontoMedioY()+ ".");
   }
}  