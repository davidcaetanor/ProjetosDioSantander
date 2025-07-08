import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        char op;
        do {
            String nomeDoLivro;
            String autorLivro;
            int anoPublicacao;

            catalogoLivros.menu();
            op = sc.next().charAt(0);
            sc.nextLine();

            System.out.println();

            switch (op) {
                case '1' -> {
                    System.out.println("Adicionando Livros ao catalogo!!");
                    System.out.println("--------------------------------------------");
                    System.out.print("Informe o nome do Livro: ");
                    nomeDoLivro = sc.nextLine();
                    System.out.print("Informe o autor do Livro: ");
                    autorLivro = sc.nextLine();
                    System.out.print("Informe o ano de Publicao do Livro: ");
                    anoPublicacao = sc.nextInt();
                    catalogoLivros.adicionarLivro(nomeDoLivro, autorLivro, anoPublicacao);
                    System.out.println("Livro Cadastrado com Sucesso!");
                    sc.nextLine();
                }
                case '2' -> {
                    System.out.println("Pesquisando Livros pelo Autor");
                    System.out.println("--------------------------------------------");
                    System.out.print("Informe o autor do Livro: ");
                    autorLivro = sc.nextLine();
                    catalogoLivros.pesquisarPorAutor(autorLivro).forEach(System.out::println);
                }
                case '3' -> {
                    System.out.println("Pesquisando Livros pelo Intervalo de Anos");
                    System.out.println("--------------------------------------------");
                    int anoInicial;
                    int anoFinal;
                    while (true) {
                        System.out.print("Informe um ano inicial: ");
                        anoInicial = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Informe um ano final: ");
                        anoFinal = sc.nextInt();
                        sc.nextLine();
                        if (anoInicial > anoFinal) {
                            System.out.println("O Ano inicial precisa ser inferior ao Ano Final. ");
                        } else {
                            break;
                        }
                    }
                    catalogoLivros.pesquisaPorIntervaloAnos(anoInicial,anoFinal).forEach(System.out::println);
                }
                case '4' ->{//TODO: TERMINAR CASES
                }
            }
            } while (op != '6') ;
            sc.close();
        }

    }
