import java.util.Scanner;

public class Sistema {
    Scanner sc = new Scanner(System.in);

    public Sistema() {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        char op;
        do {
            System.out.print("""
                    Menu de Catalogos
                    1 - Adicionar Livro
                    2 - Pesquisar Livro Por Autor
                    3 - Pesquisar Livro Por Intervalo de Lançamento
                    4 - Pesquisar Livro Por Titulo
                    5 - Remover livro do Catalogo
                    6 - Encerrar o Programa

                    Digite a opçao:
                    """);
            String nomeDoLivro;
            String autorLivro;
            int anoPublicacao;
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
                    ct();
                }
                case '2' -> {
                    System.out.println("Pesquisando Livros pelo Autor");
                    System.out.println("--------------------------------------------");
                    System.out.print("Informe o autor do Livro: ");
                    autorLivro = sc.nextLine();
                    System.out.println();
                    catalogoLivros.pesquisarPorAutor(autorLivro).forEach(System.out::println);
                    ct();
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
                    catalogoLivros.pesquisaPorIntervaloAnos(anoInicial, anoFinal).forEach(System.out::println);
                    ct();
                }
                case '4' -> {
                    System.out.println("Pesquisando Livros por Titulo");
                    System.out.println("--------------------------------------------");
                    System.out.print("Informe o nome do Livro: ");
                    nomeDoLivro = sc.nextLine();
                    System.out.println();
                    catalogoLivros.pesquisarPorTitulo(nomeDoLivro).forEach(System.out::println);
                    ct();
                }
                case '5' -> {
                    System.out.println("Removendo Livros por Titulo e Autor");
                    System.out.println("--------------------------------------------");
                    System.out.print("Informe o nome do Livro: ");
                    nomeDoLivro = sc.nextLine();
                    System.out.println();
                    System.out.print("Informe o autor do Livro: ");
                    autorLivro = sc.nextLine();
                    System.out.println();
                    catalogoLivros.removerLivro(nomeDoLivro, autorLivro);
                    ct();
                }
                case '6' -> {
                    System.out.println("Aperte enter para encerrar o programa... ");
                    sc.nextLine();
                }
            }
        } while (op != '6');
        System.out.println("Lista de Catalogos encerrada!");
        sc.close();
    }

    public void ct() {
        String ct = "Aperte enter para continuar";
        System.out.println(ct);
        sc.nextLine();
    }
}
