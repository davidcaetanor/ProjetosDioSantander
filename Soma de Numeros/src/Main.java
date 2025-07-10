public class Main {
    public static void main(String[] args) {
        SomaNumeros listaSomaNumeros = new SomaNumeros();

        listaSomaNumeros.adicionarNumero(8);
        listaSomaNumeros.adicionarNumero(3);
        listaSomaNumeros.adicionarNumero(7);
        listaSomaNumeros.adicionarNumero(2);
        listaSomaNumeros.adicionarNumero(12);
        listaSomaNumeros.adicionarNumero(1);

        System.out.println("Ordem de Insercao");
        listaSomaNumeros.exibirNumeros();
        System.out.println();

        System.out.println("Soma dos Numeros: " + listaSomaNumeros.calcularSoma());

        System.out.println("Menor Numero: " + listaSomaNumeros.encontrarMenorNumero());

        System.out.println("Maior Numero: " + listaSomaNumeros.encontrarMaiorNumero());
        System.out.println();

        System.out.println("Ordem de numeros crescentes");
        listaSomaNumeros.ordemNumerosAscendente();
        listaSomaNumeros.exibirNumeros();
        System.out.println("----------------------");

        System.out.println("Ordem de numeros decrescentes");
        listaSomaNumeros.ordemNumerosDescendentes();
        listaSomaNumeros.exibirNumeros();

    }
}
