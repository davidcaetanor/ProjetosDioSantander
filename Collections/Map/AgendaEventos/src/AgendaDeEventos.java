import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaDeEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaDeEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirMap() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
        Evento proximoEvento = null;
        LocalDate proximaData = null;

        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        LocalDate dataAtual = LocalDate.now();

        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximoEvento = entry.getValue();
                proximaData = entry.getKey();
                break;
            }
        }
        if (proximoEvento != null) {
            System.out.print("O Proximo" + proximoEvento);
            DateTimeFormatter formatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Data: " + proximaData.format(formatada));
        } else {
            System.out.println("Nao tem eventos futuros cadastrados! ");
        }
    }

    @Override
    public String toString() {
        return "\n" + eventosMap + "\n";
    }
}
