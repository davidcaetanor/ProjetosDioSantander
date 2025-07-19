public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados setConvidados = new ConjuntoConvidados();

        setConvidados.adicionarConvidado("David",5445);
        setConvidados.adicionarConvidado("Cleber",5452);
        setConvidados.adicionarConvidado("Fernando",5449);
        setConvidados.adicionarConvidado("David4",5452);

        System.out.println(setConvidados.contarConvidados());
        setConvidados.exibirConvidados();
        System.out.println("---------------------------------------------");
        setConvidados.removerConvidado(5452);
        System.out.println(setConvidados.contarConvidados());
        setConvidados.exibirConvidados();

    }
}
