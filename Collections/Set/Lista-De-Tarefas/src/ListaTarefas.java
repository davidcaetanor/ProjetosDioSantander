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
        Tarefa tarefaPareRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getTituloTarefa().equalsIgnoreCase(titulo) && t.getDescricao().equalsIgnoreCase(desc)) {
                    tarefaPareRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaPareRemover);
            System.out.println("Tarefa Removida com Sucesso!");
        } else {
            System.out.println("O set esta vazio! ");
        }
        if (tarefaPareRemover != null){
            System.out.println("Tarefa Removida com sucesso");
        } else {
            System.out.println("Tarefa nao encontrada!");
        }
    }

    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            tarefaSet.forEach(System.out::println);
        } else {
            System.out.println("O Set esta vazio!");
        }
    }

    public int contarTarefas() {
       return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        try {
            Set<Tarefa> tarefasConcluidas = new HashSet<>();
            for (Tarefa t : tarefaSet) {
                if (t.isConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
            return tarefasConcluidas;
        } catch (RuntimeException e) {
            throw new RuntimeException("Erro! Tente Novamente", e);
        }
    }

    public Set<Tarefa> obterTarefasPendentes() {
        try {
            Set<Tarefa> tarefasPendentes = new HashSet<>();
            for (Tarefa t : tarefaSet) {
                if (!t.isConcluida()) {
                    tarefasPendentes.add(t);
                }
            }
            return tarefasPendentes;
        } catch (RuntimeException e) {
            throw new RuntimeException("Erro! Tente Novamente", e);
        }
    }

    public void marcarTarefaConcluida(String titulo, String desc) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getTituloTarefa().equalsIgnoreCase(titulo) && t.getDescricao().equalsIgnoreCase(desc)) {
                    t.setConcluida(true);
                    System.out.println(t.getTituloTarefa() + " Foi sinalizada como concluida com Sucesso!");
                    break;
                }
            }
        } else {
            System.out.println("Set Vazio, Adicione algumas tarefas antes! ");
        }
    }

    public void marcarTarePendente(String titulo, String desc) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getTituloTarefa().equalsIgnoreCase(titulo) && t.getDescricao().equalsIgnoreCase(desc)) {
                    t.setConcluida(false);
                    System.out.println(t.getTituloTarefa() + " Foi sinalizada para PENDENTE com Sucesso!");
                    break;
                }
            }
        } else {
            System.out.println("Set Vazio, Adicione algumas tarefas antes! ");
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }
}
