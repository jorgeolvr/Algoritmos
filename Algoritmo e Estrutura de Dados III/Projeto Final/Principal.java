import java.io.*;
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class Principal{
    public static void main(String[] args) throws Exception{
        Arquivo<Usuario> usuarios = new Arquivo<>(Usuario.class, "Usuario.db", "Usuario1.idx");
        Arquivo<Compra>  compras  = new Arquivo<>(Compra.class,  "Compra.db",  "Compra1.idx");
        Arquivo<Produto> produtos = new Arquivo<>(Produto.class, "Produto.db", "Produto1.idx");
        //Arquivo<Lista>   lista    = new Arquivo<>(Lista.class,   "Lista.db",   "Lista1.idx");
        Lista lista = new Lista();

        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        // Inicializacao
            // Usuarios
                usuarios.incluir(new Usuario("Teste 1", 2001, 01, 01, "1111-1111", "teste1@dominio.com", "Rua Teste 1"));               //1
                usuarios.incluir(new Usuario("Teste 2", 1992, 15, 07, "2222-2222", "teste2@dominio.com", "Rua Teste 2"));               //2
                usuarios.incluir(new Usuario("Teste 3", 1998, 17, 11, "3333-3333", "teste3@dominio.com", "Rua Teste 3"));               //3
                usuarios.incluir(new Usuario("Teste 4", 1995, 22, 03, "4444-4444", "teste4@dominio.com", "Rua Teste 4"));               //4
                usuarios.incluir(new Usuario("Teste 5", 2000, 19, 05, "5555-5555", "teste5@dominio.com", "Rua Teste 5"));               //5
                usuarios.incluir(new Usuario("Teste 6", 1989, 21, 06, "6666-6666", "teste6@dominio.com", "Rua Teste 6"));               //6
            // Produtos
                produtos.incluir(new Produto("Celular Android", "Celular Motorolla Android", "Preto", 1200.00f));                       //1
                produtos.incluir(new Produto("Celular IPhone", "IPhone 8 Plus", "Branco", 3700.00f));                                   //2
                produtos.incluir(new Produto("Televisão", "TV Smart TV 42'", "Preto", 1500.00f));                                       //3
                produtos.incluir(new Produto("PlayStation 4", "Console PlayStation 4 - Sony", "Preto", 1400.00f));                      //4
                produtos.incluir(new Produto("X-Box ONE", "Console X-Box ONE", "Preto", 1300.00f));                                     //5
                produtos.incluir(new Produto("Notebook", "Notebook ACER Aspire E1", "Preto", 1200.00f));                                //6
                produtos.incluir(new Produto("X-Box ONE X", "Console X-Box ONE X", "Preto", 3500.00f));                                 //7
                produtos.incluir(new Produto("Geladeira Brastemp", "Geladeira Brastemp Ative 429L", "Prata", 2200.00f));                //8
                produtos.incluir(new Produto("Microondas Brastemp", "Microondas Brastemp Ative 30L", "Branco", 250.00f));               //9
                produtos.incluir(new Produto("Guitarra Gibson Les Paul", "Guibson Les Paul Tiger Padrão 59", "Laranja", 1100.00f));     //10
            // Compras
                Compra compra = new Compra();
                lista.add(1,2);
                lista.add(1,3);
                compras.incluir(new Compra(2016, 11, 17, 5200.00f, 02));
                lista.add(2,3);
                lista.add(2,4);
                lista.add(2,7);
                compras.incluir(new Compra(2017, 12, 20, 6400.00f, 04));
                lista.add(3,1);
                compras.incluir(new Compra(2015, 05, 14, 1200.00f, 04));
                lista.add(4,1);
                compras.incluir(new Compra(2014, 04, 20, 1200.00f, 01));
                lista.add(5,2);
                compras.incluir(new Compra(2017, 10, 10, 3700.00f, 03));
                lista.add(6,6);
                compras.incluir(new Compra(2016, 06, 06, 1200.00f, 02));
                lista.add(7,6);
                compras.incluir(new Compra(2016, 8, 19, 1200.00f, 04));
                lista.add(8,9);
                lista.add(8,10);
                compras.incluir(new Compra(2014, 7, 02, 2450.00f, 05));
                lista.add(9,6);
                lista.add(9,10);
                compras.incluir(new Compra(2016, 11, 10, 2300.00f, 03));
                lista.add(10,3);
                lista.add(10,8);
                lista.add(10,9);
                compras.incluir(new Compra(2017, 06, 19, 3950.00f, 01));
        //Fim Inicializacao

        while(opcao != 0){
            System.out.println("\n====================================================================");
            System.out.println("Digite um número e escolha a sua opção:");
            System.out.println();
            System.out.println("     Usuario\t\t     Compras\t\t     Produtos");
            System.out.println("01 - Inserir usuario. \t06 - Inserir compra. \t11 - Inserir produto.");
            System.out.println("02 - Excluir usuario. \t07 - Excluir compra. \t12 - Excluir produto.");
            System.out.println("03 - Alterar usuario. \t08 - Alterar compra. \t13 - Alterar produto.");
            System.out.println("04 - Buscar usuario.  \t09 - Buscar compra.  \t14 - Buscar produto.");
            System.out.println("05 - Listar usuarios. \t10 - Listar compras. \t15 - Listar produtos.");
            System.out.println();
            System.out.println("     Gerenciamento");
            System.out.println("16 - Listar compras de usuario. \t\t17 - Detalhes de compra.");
            System.out.println("\n0  - Sair");
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

                    Usuario usuario = (Usuario)usuarios.buscarCodigo(codigo);

                    if(usuario != null){
                        System.out.println(usuario);

                        System.out.print("\nDeseja realmente deletar esse usuario (1 - Sim/ 2 - Não): ");
                        int opcao2 = Integer.parseInt(sc.nextLine());

                        if(opcao2 == 1){
                            usuarios.excluir(codigo);
                        }
                    }else{
                        System.out.println("Usuario não encontrado!");
                    }

                    break;
                case 3:
                    System.out.print("\nDigite o codigo do usuario que deseja alterar: ");
                    int codigoAltera = Integer.parseInt(sc.nextLine());

                    Usuario usuarioAltera = (Usuario)usuarios.buscarCodigo(codigoAltera);

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

                    Usuario usuarioBusca = (Usuario)usuarios.buscarCodigo(codigoBusca);

                    if(usuarioBusca != null){
                        System.out.println(usuarioBusca);
                    }else{
                        System.out.println("Usuario não existe.");
                    }

                    break;
                case 5:
                    Object[] listaUsuario = usuarios.listar();

                    for(int i=0; i<listaUsuario.length; i++)
                        System.out.println((Usuario)listaUsuario[i]);

                    break;
                case 6:
                    int diaCompra, mesCompra, anoCompra;
                    float preco = 0;
                    int codigoComprador;

                    System.out.print("\nDigite a data da compra: ");
                    System.out.print("\n\tDia: ");
                    diaCompra = Integer.parseInt(sc.nextLine());
                    System.out.print("\n\tMes: ");
                    mesCompra = Integer.parseInt(sc.nextLine());
                    System.out.print("\n\tAno: ");
                    anoCompra = Integer.parseInt(sc.nextLine());
                    /*System.out.print("\nDigite o preço: ");
                    preco = Float.parseFloat(sc.nextLine());*/
                    System.out.print("\nDigite o codigo do comprador: ");
                    codigoComprador = Integer.parseInt(sc.nextLine());

                    if((Usuario)usuarios.buscarCodigo(codigoComprador) != null){
                        int ultimoCodigoCompra = compras.getUltimoCodigo() + 1;
                        int opcProd = 1;
                        while(opcProd == 1){
                            int codProd;
                            System.out.print("Digite o codigo do produto presente na compra: ");
                            codProd = Integer.parseInt(sc.nextLine());
                            Produto produto = (Produto)produtos.buscarCodigo(codProd);
                            if(produto != null){
                                int confirmacaoProduto;
                                System.out.println(produto);
                                System.out.print("Deseja adicionar esse produto à compra (1- Sim / 2- Não): ");
                                confirmacaoProduto = Integer.parseInt(sc.nextLine());
                                if(confirmacaoProduto == 1){
                                    lista.add(ultimoCodigoCompra, codProd);
                                    preco = preco + produto.getPreco();
                                }
                            }else{
                                System.out.println("Produto não encontrado!");
                            }

                            System.out.print("Deseja adicionar mais produtos (1- Sim / 2- Nao): ");
                            opcProd = Integer.parseInt(sc.nextLine());
                        }

                        compras.incluir(new Compra(anoCompra, mesCompra, diaCompra, preco, codigoComprador));
                    }else{
                        System.out.println("\nUsuário não existente.");
                    }

                    break;
                case 7:
                    System.out.print("\nDigite o codigo da compra que deseja deletar: ");
                    int codigoCompra = Integer.parseInt(sc.nextLine());

                    Compra compraDelete = (Compra)compras.buscarCodigo(codigoCompra);

                    if(compraDelete != null){
                        System.out.println(compraDelete);

                        System.out.print("\nDeseja realmente deletar essa compra (1 - Sim/ 2 - Não): ");
                        int opcao2 = Integer.parseInt(sc.nextLine());

                        if(opcao2 == 1){
                            compras.excluir(codigoCompra);
                        }
                    }else{
                        System.out.println("Compra não encontrada!");
                    }

                    break;
                case 8:
                    System.out.print("\nDigite o codigo da compra que deseja alterar: ");
                    int codigoAlteraCompra = Integer.parseInt(sc.nextLine());

                    Compra compraAltera = (Compra)compras.buscarCodigo(codigoAlteraCompra);

                    if(compraAltera != null){
                        System.out.println(compraAltera);

                        System.out.print("\nDeseja realmente alterar essa compra (1 - Sim/ 2 - Não): ");
                        int opcao2 = Integer.parseInt(sc.nextLine());

                        if(opcao2 == 1){
                            int opc = -1;
                            while(opc != 0){
                                System.out.println("Digite qual dado voce quer alterar");
                                System.out.print("\n\t1 - Data da compra");
                                System.out.print("\n\t2 - Valor da compra");
                                System.out.print("\n\t3 - Codigo do comprador");
                                System.out.print("\n\t0 - Mudanca finalizada");
                                System.out.print("\nOpcao: ");

                                opc = Integer.parseInt(sc.nextLine());

                                switch(opc){
                                    case 1:
                                        System.out.println("Qual devera ser a nova data da compra: ");
                                        System.out.print("\n\tDia: ");
                                        dia = Integer.parseInt(sc.nextLine());
                                        System.out.print("\n\tMes: ");
                                        mes = Integer.parseInt(sc.nextLine());
                                        System.out.print("\n\tAno: ");
                                        ano = Integer.parseInt(sc.nextLine());
                                        compraAltera.setDataCompra(new Date(ano, mes, dia));

                                        break;
                                    case 2:
                                        System.out.println("Qual devera ser o novo valor: ");
                                        preco = Float.parseFloat(sc.nextLine());
                                        compraAltera.setPreco(preco);

                                        break;
                                    case 3:
                                        System.out.println("Qual é o codigo do novo comprador: ");
                                        codigoComprador = Integer.parseInt(sc.nextLine());
                                        compraAltera.setCodComprador(codigoComprador);

                                        break;
                                    case 0:
                                        break;
                                }
                            }
                            compraAltera.setBytes();
                            compras.alterar(compraAltera);
                        }
                    }else{
                        System.out.println("Compra não encontrada!");
                    }

                    break;
                case 9:
                    System.out.print("\nDigite o codigo da compra que deseja buscar: ");
                    int codigoBuscaCompra = Integer.parseInt(sc.nextLine());

                    Compra compraBusca = (Compra)compras.buscarCodigo(codigoBuscaCompra);

                    if(compraBusca != null){
                        System.out.println(compraBusca);
                    }else{
                        System.out.println("Compra não existe.");
                    }

                    break;
                case 10:
                    Object[] listaCompra = compras.listar();

                    for(int i=0; i<listaCompra.length; i++)
                        System.out.println((Compra)listaCompra[i]);

                    break;
                case 11:
                    String descricao;
                    String cor;

                    System.out.print("\nDigite o nome: ");
                    nome = sc.nextLine();
                    System.out.print("\nDigite a descrição: ");
                    descricao = sc.nextLine();
                    System.out.print("\nDigite a cor: ");
                    cor = sc.nextLine();
                    System.out.print("\nDigite o preço: ");
                    preco = Float.parseFloat(sc.nextLine());

                    produtos.incluir(new Produto(nome, descricao, cor, preco));

                    break;
                case 12:
                    System.out.print("\nDigite o código do produto que deseja deletar: ");
                    int codigoProduto = Integer.parseInt(sc.nextLine());

                    Produto produtoDelete = (Produto)produtos.buscarCodigo(codigoProduto);

                    if(produtoDelete != null){
                        System.out.println(produtoDelete);

                        System.out.print("\nDeseja realmente deletar esse produto (1 - Sim/ 2 - Não): ");
                        int opcao2 = Integer.parseInt(sc.nextLine());

                        if(opcao2 == 1){
                            produtos.excluir(codigoProduto);
                        }
                    }else{
                        System.out.println("Produto não encontrado!");
                    }

                    break;
                case 13:
                    System.out.print("\nDigite o codigo do produto que deseja alterar: ");
                    int codigoAlteraProduto = Integer.parseInt(sc.nextLine());

                    Produto produtoAltera = (Produto)produtos.buscarCodigo(codigoAlteraProduto);

                    if(produtoAltera != null){
                        System.out.println(produtoAltera);

                        System.out.print("\nDeseja realmente alterar esse produto (1 - Sim/ 2 - Não): ");
                        int opcao2 = Integer.parseInt(sc.nextLine());

                        if(opcao2 == 1){
                            int opc = -1;
                            while(opc != 0){
                                System.out.println("Digite qual dado voce quer alterar");
                                System.out.print("\n\t1 - Nome do produto");
                                System.out.print("\n\t2 - Descricao do produto");
                                System.out.print("\n\t3 - Cor do produto");
                                System.out.print("\n\t4 - Preço do produto");
                                System.out.print("\n\t0 - Mudanca finalizada");
                                System.out.print("\nOpcao: ");

                                opc = Integer.parseInt(sc.nextLine());

                                switch(opc){
                                    case 1:
                                        System.out.println("Qual devera ser o novo nome do produto: ");
                                        nome = sc.nextLine();
                                        produtoAltera.setNome(nome);
                                        break;
                                    case 2:
                                        System.out.println("Qual devera ser a nova descrição do produto: ");
                                        descricao = sc.nextLine();
                                        produtoAltera.setDescricao(descricao);
                                        break;
                                    case 3:
                                        System.out.println("Qual devera ser a nova cor do produto: ");
                                        cor = sc.nextLine();
                                        produtoAltera.setCor(cor);
                                        break;
                                    case 4:
                                        System.out.println("Qual devera ser o novo valor: ");
                                        preco = Float.parseFloat(sc.nextLine());
                                        produtoAltera.setPreco(preco);

                                        break;
                                    case 0:
                                        break;
                                }
                            }
                            produtoAltera.setBytes();
                            produtos.alterar(produtoAltera);
                        }
                    }else{
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 14:
                    System.out.print("\nDigite o codigo do produto que deseja buscar: ");
                    int codigoBuscaProduto = Integer.parseInt(sc.nextLine());

                    Produto produtoBusca = (Produto)produtos.buscarCodigo(codigoBuscaProduto);

                    if(produtoBusca != null){
                        System.out.println(produtoBusca);
                    }else{
                        System.out.println("Produto não existe.");
                    }

                    break;
                case 15:
                    Object[] listaProduto = produtos.listar();

                    for(int i=0; i<listaProduto.length; i++)
                        System.out.println((Produto)listaProduto[i]);

                    break;
                case 16:
                    System.out.print("\nDigite o codigo do usuario que deseja ver as compras: ");
                    int codigoUsuarioCompra = Integer.parseInt(sc.nextLine());

                    Object[] compraUsuario = compras.listar();
                    for(int i = 0; i < compraUsuario.length; i++){
                        if(((Compra)compraUsuario[i]).getCodComprador() == codigoUsuarioCompra){
                            System.out.println((Compra)compraUsuario[i]);
                        }
                    }

                    break;
                case 17:
                    System.out.print("\nDigite o codigo da compra que deseja detalhes: ");
                    int codigoCompraDetalhe = Integer.parseInt(sc.nextLine());

                    Compra compraDetalhe = (Compra)compras.buscarCodigo(codigoCompraDetalhe);
                    if(compraDetalhe != null){
                        System.out.println(compraDetalhe);
                        Object[] listaProdutos = lista.getProdutos(compraDetalhe.getCodigo());
                        System.out.println("\nProdutos comprados:" + listaProdutos.length);
                        for(int i = 0; i < listaProdutos.length; i++){
                            System.out.println((Produto)produtos.buscarCodigo((int)listaProdutos[i]) + "\n");
                        }
                    }

                    break;
                case 0:
                    break;
                default:
                System.out.println("Você não digitou um valor válido");
            }
        }
    }
}
