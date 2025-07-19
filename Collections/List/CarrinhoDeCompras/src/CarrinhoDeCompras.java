import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeItens;

    public CarrinhoDeCompras(){
        this.listaDeItens = new ArrayList<>();
    }
    public void adicionarItem(String nome, int qtd, double price){
        listaDeItens.add(new Item(nome, qtd,price));
    }
    public void removerItem(String nome){
        List<Item> itensRemove = new ArrayList<>();
        for(Item i : listaDeItens){
            if(i.getName().equalsIgnoreCase(nome)){
                itensRemove.add(i);
            }
        }
        listaDeItens.removeAll(itensRemove);
    }

    public void exibirItens(){
        listaDeItens.forEach(System.out::println);
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        for(Item i : listaDeItens){
            valorTotal += i.getPrice() * i.getQt();
        }
        return valorTotal;
    }
}
