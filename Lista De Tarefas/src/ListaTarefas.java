import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String titulo, String desc) {
        tarefaSet.add(new Tarefa(titulo, desc));
    }

    public void removerTarefa(String titulo, String desc) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getTituloTarefa().equalsIgnoreCase(titulo) && t.getDescricao().equalsIgnoreCase(desc)) {
                    tarefaSet.remove(t);
                    break;
                } else {
                    System.out.println("Nao foi localizado nenhuma tarefa com esse titulo e descriçao, verifique! ");
                }
            }
        } else {
            System.out.println("O set esta vazio! ");
        }
    }

    public void exibirTarefas() {
        tarefaSet.forEach(System.out::println);
    }

    public void contarTarefas() {
        if (!tarefaSet.isEmpty()) {
            int qtdTarefas = tarefaSet.size();
            System.out.println("Temos " + qtdTarefas + " tarefas registradas");
        } else {
            System.out.println("O Set esta vazio! ");
        }
    }

}
