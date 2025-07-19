import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int qtd, double preco) {
        estoqueMap.put(codigo, new Produto(nome, qtd, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0.0;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) { // pega os valores da collection, nesse caso, objetos '''PRODUTO''
                valorTotalEstoque += p.getPreco() * p.getQtd();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoqueMap.values()) {
            if (p.getPreco() > maiorPreco) {
                maiorPreco = p.getPreco();
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueMap.values()) {
            if (p.getPreco() < menorPreco) {
                menorPreco = p.getPreco();
                produtoMaisBarato = p;
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoEmMaiorQTD() {
        Produto deMaiorQuantidade = null;
        int maiorQuantidade = Integer.MIN_VALUE;
        for (Produto p : estoqueMap.values()) {
            if (p.getQtd() > maiorQuantidade) {
                maiorQuantidade = p.getQtd();
                deMaiorQuantidade = p;
            }
        }
        return deMaiorQuantidade;
    }

    public Produto obterProdutoComMaiorQuantidadeComValor() {
        Produto produtoComQuantidadeValor = null;
        double somaPrecoXQuantidade = Double.MIN_VALUE;
        for (Produto p : estoqueMap.values()) {
            if (p.getPreco() * p.getQtd() > somaPrecoXQuantidade) {
                somaPrecoXQuantidade = p.getPreco()*p.getQtd();
                produtoComQuantidadeValor = p;
            }
        }
        return produtoComQuantidadeValor;
    }


    public double valorTotalProdutoComMaiorQuantidadeEValor(){
        Produto produtoX = obterProdutoComMaiorQuantidadeComValor();
        return produtoX.getPreco() * produtoX.getQtd();
    }
}
