public class Main {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto("Mouse", 4787, 320, 1);
        cadastroProduto.adicionarProduto("Teclado", 487, 600, 1);
        cadastroProduto.adicionarProduto("Monitor", 187, 1000, 1);
        cadastroProduto.adicionarProduto("Gabinete", 2787, 390, 1);
        cadastroProduto.adicionarProduto("Mouse", 4787, 75.4, 1);
        cadastroProduto.adicionarProduto("Mouse", 4787, 75.4, 1);

        System.out.println("Ordenado Por Nome: ");
        cadastroProduto.ordenarProdutosPorNome().forEach(System.out::println);

        System.out.println("Ordenado por Preco: ");
        cadastroProduto.ordenarProdutosPorPreco().forEach(System.out::println);

    }
}
