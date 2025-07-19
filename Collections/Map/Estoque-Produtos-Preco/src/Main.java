public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutosMAP = new EstoqueProdutos();

        estoqueProdutosMAP.adicionarProduto(1,"Mouse",12,200);
        estoqueProdutosMAP.adicionarProduto(2,"Teclado",10,510);
        estoqueProdutosMAP.adicionarProduto(3,"Tv",2,1050);
        estoqueProdutosMAP.adicionarProduto(4,"Gabinete",3,280);
        estoqueProdutosMAP.adicionarProduto(5,"Processador",5,799);
        estoqueProdutosMAP.adicionarProduto(6,"Placa de Video",2,1200);
        estoqueProdutosMAP.adicionarProduto(7,"Controle",6,357);

        System.out.println("1ª Exibiçao de Todos os Produtos");
        estoqueProdutosMAP.exibirProdutos();
        System.out.println();

        System.out.println("Produto mais barato");
        System.out.println(estoqueProdutosMAP.obterProdutoMaisBarato());
        System.out.println();

        System.out.println("Produto Mais Caro em Estoque");
        System.out.println(estoqueProdutosMAP.obterProdutoMaisCaro());
        System.out.println();

        System.out.println("Produto em Maior QUANTIDADE em ESTOQUE");
        System.out.println(estoqueProdutosMAP.obterProdutoEmMaiorQTD());
        System.out.println();

        System.out.println("Produto COM MAIOR VALOR por QUANTIDADE TOTAL em ESTOQUE");
        System.out.println(estoqueProdutosMAP.obterProdutoComMaiorQuantidadeComValor());
        System.out.printf("Com o valor total de R$ %.2f \n", estoqueProdutosMAP.valorTotalProdutoComMaiorQuantidadeEValor());

        System.out.println();
        System.out.println("Valor total em Estoque");
        System.out.printf("R$ %.2f", estoqueProdutosMAP.calcularValorTotalEstoque());
        System.out.println();
    }
}
