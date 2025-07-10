public class Main {
    public static void main(String[] args) {
        SomaNumeros listaSomaNumeros = new SomaNumeros();

        listaSomaNumeros.adicionarNumero(5);
        listaSomaNumeros.adicionarNumero(5);
        listaSomaNumeros.adicionarNumero(7);

        listaSomaNumeros.exibirNumeros();
        System.out.println();
        System.out.println("Soma dos Numeros: " + listaSomaNumeros.calcularSoma());

        System.out.println("Menor Numero: " + listaSomaNumeros.encontrarMenorNumero());

        System.out.println("Maior Numero: " + listaSomaNumeros.encontrarMaiorNumero());

    }
}
