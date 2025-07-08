public class Main {
    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        System.out.println("O numero total de tarefas na lista eh: " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.adicionarTarefa("Tarefa 1");
        listaDeTarefas.adicionarTarefa("Tarefa 1");
        listaDeTarefas.adicionarTarefa("Tarefa 3");
        System.out.println("O numero total de tarefas na lista eh: " + listaDeTarefas.obterNumeroTotalTarefas());
        listaDeTarefas.removerTarefa("Tarefa ");
        System.out.println("O numero total de tarefas na lista eh: " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.obterDescricoesTarefas();

    }
}
