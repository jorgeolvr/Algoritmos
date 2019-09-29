import java.util.Scanner;

public class grafoRelacao {
   public static void main(String[]args) {
      boolean cadastro = false;
      String [] nomes = new String[7];
      String [][] amigos = new String[7][7];
      int [][] relacao = new int[7][7];
      int [] cont = new int[7];
      showMenu(nomes,cadastro,cont,amigos,relacao);
      getOpcao(nomes,cadastro,cont,amigos,relacao);
   }
   
   public static void getOpcao(String [] nomes, boolean cadastro, int [] cont, String [][] amigos, int relacao [][]) {
      Scanner scanner = new Scanner(System.in);
      
      char tecla = ' ';
      System.out.print("Escolha sua opção: ");
      int opcao = scanner.nextInt();
      
      switch(opcao) {
      
         case 0:
            exit(nomes,cadastro,cont,amigos,relacao);
            break;
            
         case 1:
            boolean cad = getPessoas(nomes);
            showMenu(nomes,cad,cont,amigos,relacao);
            break;
            
         case 2:
            relacaoAmizade(nomes,cont,amigos,relacao);
            showMenu(nomes,cadastro,cont,amigos,relacao);
            break;
           
         case 3:
            pesquisaPessoas(nomes,amigos);
            System.out.println("\nDigite (S/N) para continuar: ");
            tecla = scanner.next().charAt(0);
            tecla = Character.toUpperCase(tecla);
            if(tecla == 'S') {
               showMenu(nomes,cadastro,cont,amigos,relacao);
            }
            break;
         
         case 4:
            maiorNumero(nomes,relacao);
            System.out.print("\nDigite (S/N) para continuar: ");
            tecla = scanner.next().charAt(0);
            tecla = Character.toUpperCase(tecla);
            if(tecla == 'S') {
               showMenu(nomes,cadastro,cont,amigos,relacao);
            }
            break;
            
         case 5:
            inconsistencia(amigos,relacao);
            System.out.print("\nDigite (S/N) para continuar: ");
            tecla = scanner.next().charAt(0);
            tecla = Character.toUpperCase(tecla);
            if(tecla == 'S') {
               showMenu(nomes,cadastro,cont,amigos,relacao);
            }
         break;
         
         case 6:
            correspondencia(nomes,relacao);
            System.out.print("\nDigite (S/N) para continuar: ");
            tecla = scanner.next().charAt(0);
            tecla = Character.toUpperCase(tecla);
            if(tecla == 'S') {
               showMenu(nomes,cadastro,cont,amigos,relacao);
            }
      }
   }
   
   public static boolean getPessoas(String [] nomes) {
      Scanner scanner = new Scanner(System.in);       
      System.out.println("----------------------------------------------");
      System.out.println("\nCadastro de pessoas\n ");
      
      for(int i = 0; i < nomes.length; i++) {
         System.out.print("Digite o "+(i+1)+"º nome: ");
         nomes[i] = scanner.next();
      }
               
      System.out.println("Cadastro completo\n");
      boolean cadastro = true;
      return cadastro;  
   }
   
   public static void relacaoAmizade(String [] nomes, int [] cont, String amigos [][], int relacao [][]) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("----------------------------------------------");
      System.out.println("\nRelações de amizade\n ");
      System.out.print("Digite o nome da pessoa em questão: ");
      String nome = scanner.next();
      char resposta = ' ';
      int j = 0;
      int num = 0;
            
      if(nome.equals(nomes[0])) {
         for(int i = 0; i < nomes.length; i++) {
            System.out.print("\nPossui amizade com "+nomes[i]+" (S/N): ");
            resposta = scanner.next().charAt(0);
            resposta = Character.toUpperCase(resposta);
            if(resposta == 'S') {
               relacao[0][i] = 1;
            }
            else if(resposta == 'N') {
               relacao[0][i] = 0;
            }
            if(relacao[0][i] == 1) {
               cont[num]++;
               amigos[0][j] = nomes[i];
            }
            j++;
         }    
         num++;
      }
      
      else if(nome.equals(nomes[1])) {
         for(int i = 0; i < nomes.length; i++) {
            System.out.print("\nPossui amizade com "+nomes[i]+" (S/N): ");
            resposta = scanner.next().charAt(0);
            resposta = Character.toUpperCase(resposta);
            if(resposta == 'S') {
               relacao[1][i] = 1;
            }
            else if(resposta == 'N') {
               relacao[1][i] = 0;
            }
            if(relacao[1][i] == 1) {
               cont[num]++;
               amigos[1][j] = nomes[i];
            }
            j++;
         }    
         num++;
      }
      
      else if(nome.equals(nomes[2])) {
         for(int i = 0; i < nomes.length; i++) {
            System.out.print("\nPossui amizade com "+nomes[i]+" (S/N): ");
            resposta = scanner.next().charAt(0);
            resposta = Character.toUpperCase(resposta);
            if(resposta == 'S') {
               relacao[2][i] = 1;
            }
            else if(resposta == 'N') {
               relacao[2][i] = 0;
            }
            if(relacao[2][i] == 1) {
               cont[num]++;
               amigos[2][j] = nomes[i];
            }
            j++;
         }    
         num++;
      }
      
      else if(nome.equals(nomes[3])) {
         for(int i = 0; i < nomes.length; i++) {
            System.out.print("\nPossui amizade com "+nomes[i]+" (S/N): ");
            resposta = scanner.next().charAt(0);
            resposta = Character.toUpperCase(resposta);
            if(resposta == 'S') {
               relacao[3][i] = 1;
            }
            else if(resposta == 'N') {
               relacao[3][i] = 0;
            }
            if(relacao[3][i] == 1) {
               cont[num]++;
               amigos[3][j] = nomes[i];
            }
            j++;
         }    
         num++;
      }
      
      else if(nome.equals(nomes[4])) {
         for(int i = 0; i < nomes.length; i++) {
            System.out.print("\nPossui amizade com "+nomes[i]+" (S/N): ");
            resposta = scanner.next().charAt(0);
            resposta = Character.toUpperCase(resposta);
            if(resposta == 'S') {
               relacao[4][i] = 1;
            }
            else if(resposta == 'N') {
               relacao[4][i] = 0;
            }
            if(relacao[4][i] == 1) {
               cont[num]++;
               amigos[4][j] = nomes[i];
            }
            j++;
         }    
         num++;
      }
      
      else if(nome.equals(nomes[5])) {
         for(int i = 0; i < nomes.length; i++) {
            System.out.print("\nPossui amizade com "+nomes[i]+" (S/N): ");
            resposta = scanner.next().charAt(0);
            resposta = Character.toUpperCase(resposta);
            if(resposta == 'S') {
               relacao[5][i] = 1;
            }
            else if(resposta == 'N') {
               relacao[5][i] = 0;
            }
            if(relacao[5][i] == 1) {
               cont[num]++;
               amigos[5][j] = nomes[i];
            }
            j++;
         }    
         num++;
      }
      
      else if(nome.equals(nomes[6])) {
         for(int i = 0; i < nomes.length; i++) {
            System.out.print("\nPossui amizade com "+nomes[i]+" (S/N): ");
               resposta = scanner.next().charAt(0);
               resposta = Character.toUpperCase(resposta);
               if(resposta == 'S') {
                  relacao[6][i] = 1;
               }
               else if(resposta == 'N') {
                  relacao[6][i] = 0;
               }
               if(relacao[6][i] == 1) {
                  cont[num]++;
                  amigos[6][j] = nomes[i];
               }
               j++;
            }    
            num++;
         }
      }
      
      public static void pesquisaPessoas(String [] nomes, String [][] amigos) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("----------------------------------------------");
         
         char tecla = ' ';
         
         System.out.println("\nPesquisa de amigos\n ");
         System.out.print("Digite o nome da pessoa em questão: ");
         String nome = scanner.next();
               
         if(nome.equals(nomes[0])) {
            System.out.print("Os amigos de "+nomes[0]+" são: ");
            for(int i = 0; i < amigos.length; i++) {
               if(amigos[0][i] != null) {
                  System.out.print(amigos[0][i]+" ");
               }
            }
         }
            
         else if (nome.equals(nomes[1])) {
            System.out.print("Os amigos de "+nomes[1]+" são: ");
            for(int i = 0; i < amigos.length; i++) {
               if(amigos[1][i] != null) {
                  System.out.print(amigos[1][i]+" ");
               }
            }
         }
            
         else if (nome.equals(nomes[2])) {
            System.out.print("Os amigos de "+nomes[2]+" são: ");
            for(int i = 0; i < amigos.length; i++) {
               if(amigos[2][i] != null) {
                  System.out.print(amigos[2][i]+" ");
               }
            }
         }
              
         else if (nome.equals(nomes[3])) {
            System.out.print("Os amigos de "+nomes[3]+" são: ");
            for(int i = 0; i < amigos.length; i++) {
               if(amigos[3][i] != null) {
                  System.out.print(amigos[3][i]+" ");
               }
            }
         }
         
         else if (nome.equals(nomes[4])) {
            System.out.print("Os amigos de "+nomes[4]+" são: ");
            for(int i = 0; i < amigos.length; i++) {
               if(amigos[4][i] != null) {
                  System.out.print(amigos[4][i]+" ");
               }
            }
         }
           
         else if (nome.equals(nomes[5])) {
            System.out.print("Os amigos de "+nomes[5]+" são: ");
            for(int i = 0; i < amigos.length; i++) {
               if(amigos[5][i] != null) {
                  System.out.print(amigos[5][i]+" ");
               }
            }
         }
            
         else if (nome.equals(nomes[6])) {
            System.out.print("Os amigos de "+nomes[6]+" são: ");
            for(int i = 0; i < amigos.length; i++) {
               if(amigos[6][i] != null) {
                  System.out.print(amigos[6][i]+" ");
               }
            }
         }
      }
            
      public static void maiorNumero(String[]nomes, int relacao [][]) {
         System.out.println("----------------------------------------------");
         System.out.println("\nMaior número de amigos\n");
         
         int soma = 0;
         int linha = 0;
         int temp = 0;
         
         for(int i = 0; i < relacao.length; i++) {
            soma = 0;
            for(int j = 0; j < relacao[i].length; j++) {
               soma += relacao[i][j];
                  if(soma > temp) {
                     temp = soma;
                     linha = i;
                  }
               }
            }
      System.out.print("A pessoa com mais amigos é "+nomes[linha]+" com "+temp+" amigos\n");
      }
            
      public static void inconsistencia(String amigos [][], int relacao [][]) {
         System.out.println("----------------------------------------------");
         System.out.println("\nInconsistências\n");        
         System.out.print("Pessoas que possuem amizade com elas mesmas: ");
         
         for(int i = 0; i < relacao.length; i++) {
            if(relacao[i][i] == 1) {
               System.out.print(amigos[i][i]+" ");
            }
         }
      System.out.println("\n");
      }
            
      public static void correspondencia(String [] nomes, int relacao [][]) {
         System.out.println("----------------------------------------------");
         System.out.println("\nAmizades não correspondidas\n"); 
         for(int i = 0; i < relacao.length; i++) {
            for(int j = 0; j < relacao[i].length; j++) {
               if((relacao[i][j] == 0) && (relacao[j][i] == 1)) {
                  System.out.println(nomes[j]+" tem amizade não correspondida com "+nomes[i]);
               }
            }
         }
      }
      
   public static void showMenu(String [] nomes, boolean cadastro, int [] cont, String [][] amigos, int relacao[][]) {
      int opcao;
      opcao = 0;
      Scanner scanner = new Scanner(System.in);
      System.out.println("---------------MENU DO PROGRAMA---------------");
      System.out.println("0) Sair do programa");
      if(cadastro == false) {
         System.out.println("1) Cadastrar pessoas");
      }
      else {
         System.out.println("1) Re-cadastrar pessoas");
      }
      if(cadastro == true) {
         System.out.println("2) Relação de amizades");     
         System.out.println("3) Pesquisar amigos de uma pessoa");
         System.out.println("4) Pessoa com maior número de amigos");
         System.out.println("5) Verificar inconsistência");
         System.out.println("6) Verificar amizades não correspondidas");
      }
      System.out.println("----------------------------------------------");
      getOpcao(nomes,cadastro,cont,amigos,relacao);
   }
   
   public static void exit(String [] nomes, boolean cadastro, int [] cont, String [][] amigos, int relacao [][]) {
      Scanner scanner = new Scanner(System.in);
      char exit;
      boolean repeticao = true;
      do {
         System.out.print("\nDeseja finalizar a aplicação? ");
         exit = scanner.next().charAt(0); 
         exit = Character.toUpperCase(exit);
               
         if(exit != 'S' && exit != 'N') {
            System.out.print("Opção inválida");
         }
         if(exit == 'S') {
         repeticao = false;
         System.out.print("Programa finalizado");
         }  
         else if(exit == 'N') {
            showMenu(nomes,cadastro,cont,amigos,relacao);
         }  
      } while(repeticao);
   }
}