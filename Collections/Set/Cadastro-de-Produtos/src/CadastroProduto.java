import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;


    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int qtd){
        produtoSet.add(new Produto(nome, codigo, preco, qtd));
    }

    public Set<Produto> ordenarProdutosPorNome(){
        // <- Usado para ordenar o HashSet utilizando o Comparable e TreeSet
        //        new TreeSet<>(produtoSet);    <<< Forma Atual de fazer isso!!!
        return new TreeSet<>(produtoSet);
    }

    public Set<Produto> ordenarProdutosPorPreco(){
       Set<Produto> ordenadoPorPreco = new TreeSet<>(new ComparePorPreco());
       ordenadoPorPreco.addAll(produtoSet);
       return ordenadoPorPreco;
    }

    public void exibir(){

    }
}
