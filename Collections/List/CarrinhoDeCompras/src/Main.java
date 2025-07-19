import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Abacate", 2, 5);
        carrinho.adicionarItem("Morango", 3, 10);
        carrinho.adicionarItem("Abacate", 1, 1);

        carrinho.exibirItens();

        carrinho.adicionarItem("Banana", 15, 2);

        carrinho.removerItem("Abacate");

        carrinho.exibirItens();

        System.out.println("Valor total - R$ " + carrinho.calcularValorTotal());

    }
}
