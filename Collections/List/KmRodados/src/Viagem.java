public class Viagem {
    private String destino;
    private int distanciaKM;

    public Viagem(String destino, int distanciaKM) {
        this.destino = destino;
        this.distanciaKM = distanciaKM;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDistanciaKM() {
        return distanciaKM;
    }

    public void setDistanciaKM(int distanciaKM) {
        this.distanciaKM = distanciaKM;
    }

    @Override
    public String toString() {
        return "Destino: " + destino + "Distancia: " + distanciaKM + " KM";
    }

}
