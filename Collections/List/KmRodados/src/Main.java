public class Main {
    public static void main(String[] args) {
        CarroKwid carro = new CarroKwid(130);
        carro.addViagem("Ubatuba", 500);
        carro.addViagem("Mogi", 250);
        carro.addViagem("Ilha Bela", 2500);
        carro.consigoViajar();
        carro.exibirDetalhes();
        System.out.printf("Esse percurso tem %d KM\n",carro.kmTotal());
        System.out.println("---------------------------------------------------------");
        System.out.printf("Gasolina Necessaria %.2f Litros\n", carro.consumoViagem());
        System.out.printf("Gasolina Atual %.2f Litros\n", carro.getLitrosgasolinaAtual());

    }
}
