import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaDeEventos agendaDeEventos = new AgendaDeEventos();

        agendaDeEventos.adicionarEvento(LocalDate.of(2025, Month.JULY,20), "Evento 1", "Travis Scott");
        agendaDeEventos.adicionarEvento(LocalDate.of(2025, 7,23), "Evento 2", "Justin Bieber");
        agendaDeEventos.adicionarEvento(LocalDate.of(2025, 8,12), "Evento 3", "Post Malone");
        agendaDeEventos.adicionarEvento(LocalDate.of(2025, 1,20), "Evento 4", "MC IG ");
        agendaDeEventos.adicionarEvento(LocalDate.of(2025, Month.AUGUST,11), "Evento 5", "Matue");
        agendaDeEventos.adicionarEvento(LocalDate.of(2026, Month.FEBRUARY,17), "Evento 6", "Sotam");

        agendaDeEventos.exibirMap();

        System.out.println();
        agendaDeEventos.obterProximoEvento();
    }
}
