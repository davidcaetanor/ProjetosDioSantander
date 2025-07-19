import java.util.ArrayList;
import java.util.List;

public class CarroKwid {
    private final int kmPorLitro = 24;
    List<Viagem> viagemList;
    private double litrosgasolinaAtual;

    public CarroKwid(double gasolinaAtual) {
        this.viagemList = new ArrayList<>();
        this.litrosgasolinaAtual = gasolinaAtual;
    }

    public double getLitrosgasolinaAtual() {
        return litrosgasolinaAtual;
    }

    public void abastecerGasolina(double gasolinaAtual) {
        this.litrosgasolinaAtual += gasolinaAtual;
    }

    public double consumoViagem() {
        double litrosNecessarios = 0;
        for(Viagem viagem: viagemList){
            litrosNecessarios += (double) viagem.getDistanciaKM() / kmPorLitro;
        }
        return litrosNecessarios;
    }

    public void addViagem(String destino, int distancia) {
        viagemList.add(new Viagem(destino, distancia));
    }

    public void consigoViajar(){
        boolean consigoviajar = litrosgasolinaAtual > consumoViagem();
        if (consigoviajar){
            System.out.println("O Carro esta pronto pra viajar");
        } else{
            System.out.println("Precisa abastecer o carro!");
        }
    }
    public int kmTotal(){
        int kmtotal = 0;
        for (Viagem v : viagemList){
            kmtotal += v.getDistanciaKM();
        }
        return kmtotal;
    }

    public void exibirDetalhes() {
        viagemList.forEach(System.out::println);
    }
}
