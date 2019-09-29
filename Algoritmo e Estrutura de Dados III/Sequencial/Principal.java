import java.io.*;
import java.util.Scanner;
import java.util.Date;

public class Principal{
    public static void main(String[] args) throws Exception{
        Arquivo<Usuario> usuarios = new Arquivo<>("Usuario.db");

        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        while(opcao != 0){
            System.out.println("\n====================================================================");
            System.out.println("Digite um número e escolha a sua opção:");
            System.out.println();
            System.out.println("1 - Inserir registro.");
            System.out.println("2 - Excluir registro.");
            System.out.println("3 - Alterar registro.");
            System.out.println("4 - Buscar registro.");
            System.out.println("5 - Listar registros.");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

            opcao = Integer.parseInt(sc.nextLine());
            switch(opcao){
                case 1:
                    String nome;
                    int dia, mes, ano;
                    String telefone;
                    String email;
                    String endereco;

                    System.out.print("\nDigite o nome: ");
                    nome = sc.nextLine();
                    System.out.print("\nDigite a data de nascimento: ");
                    System.out.print("\n\tDia: ");
                    dia = Integer.parseInt(sc.nextLine());
                    System.out.print("\n\tMes: ");
                    mes = Integer.parseInt(sc.nextLine());
                    System.out.print("\n\tAno: ");
                    ano = Integer.parseInt(sc.nextLine());
                    System.out.print("\nDigite o telefone: ");
                    telefone = sc.nextLine();
                    System.out.print("\nDigite o email: ");
                    email = sc.nextLine();
                    System.out.print("\nDigite o endereco: ");
                    endereco = sc.nextLine();

                    usuarios.incluir(new Usuario(nome, ano, mes, dia, telefone, email, endereco));

                    break;
                case 2:
                    System.out.print("\nDigite o codigo do usuario que deseja deletar: ");
                    int codigo = Integer.parseInt(sc.nextLine());

                    Usuario usuario = usuarios.busca(codigo, new Usuario());

                    if(usuario != null){
                        System.out.println(usuario);

                        System.out.print("\nDeseja realmente deletar esse usuario (1 - Sim/ 2 - Não): ");
                        int opcao2 = Integer.parseInt(sc.nextLine());

                        if(opcao2 == 1){
                            usuarios.deletar(usuario);
                        }
                    }else{
                        System.out.println("Usuario não encontrado!");
                    }

                    break;
                case 3:
                    System.out.print("\nDigite o codigo do usuario que deseja alterar: ");
                    int codigoAltera = Integer.parseInt(sc.nextLine());

                    Usuario usuarioAltera = usuarios.busca(codigoAltera, new Usuario());

                    if(usuarioAltera != null){
                        System.out.println(usuarioAltera);

                        System.out.print("\nDeseja realmente alterar esse usuario (1 - Sim/ 2 - Não): ");
                        int opcao2 = Integer.parseInt(sc.nextLine());

                        if(opcao2 == 1){
                            int opc = -1;
                            while(opc != 0){
                                System.out.println("Digite qual dado voce quer alterar");
                                System.out.print("\n\t1 - Nome");
                                System.out.print("\n\t2 - Data de nascimento");
                                System.out.print("\n\t3 - Telefone");
                                System.out.print("\n\t4 - Email");
                                System.out.print("\n\t5 - Endereco");
                                System.out.print("\n\t0 - Mudanca finalizada");
                                System.out.print("\nOpcao: ");

                                opc = Integer.parseInt(sc.nextLine());

                                switch(opc){
                                    case 1:
                                        System.out.println("Qual devera ser o novo nome: ");
                                        nome = sc.nextLine();
                                        usuarioAltera.setNome(nome);

                                        break;
                                    case 2:
                                        System.out.println("Qual devera ser a nova data de nascimento: ");
                                        System.out.print("\n\tDia: ");
                                        dia = Integer.parseInt(sc.nextLine());
                                        System.out.print("\n\tMes: ");
                                        mes = Integer.parseInt(sc.nextLine());
                                        System.out.print("\n\tAno: ");
                                        ano = Integer.parseInt(sc.nextLine());
                                        usuarioAltera.setDataNascimento(new Date(ano, mes, dia));

                                        break;
                                    case 3:
                                        System.out.println("Qual devera ser o novo telefone: ");
                                        telefone = sc.nextLine();
                                        usuarioAltera.setTelefone(telefone);

                                        break;
                                    case 4:
                                        System.out.println("Qual devera ser o novo e-mail: ");
                                        email = sc.nextLine();
                                        usuarioAltera.setEmail(email);

                                        break;
                                    case 5:
                                        System.out.println("Qual devera ser o novo endereço: ");
                                        endereco = sc.nextLine();
                                        usuarioAltera.setEndereco(endereco);

                                        break;
                                    case 0:
                                        break;
                                }
                            }
                            usuarioAltera.setBytes();
                            usuarios.alterar(usuarioAltera);
                        }
                    }else{
                        System.out.println("Usuario não encontrado!");
                    }

                    break;
                case 4:
                    System.out.print("\nDigite o codigo do usuario que deseja buscar: ");
                    int codigoBusca = Integer.parseInt(sc.nextLine());

                    Usuario usuarioBusca = usuarios.busca(codigoBusca, new Usuario());

                    if(usuarioBusca != null){
                        System.out.println(usuarioBusca);
                    }else{
                        System.out.println("Usuario não existe.");
                    }

                    break;
                case 5:
                    usuarios.listar(new Usuario());
                    break;
                case 0:
                    break;
                default:
                System.out.println("Você não digitou um valor válido");
            }
        }
    }
}
