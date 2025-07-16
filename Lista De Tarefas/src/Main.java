public class Main {
    public static void main(String[] args) {
        ListaTarefas listaDeTarefas = new ListaTarefas();

        listaDeTarefas.adicionarTarefa("Estudar", "Abrir a DIO e Estudar Set com Collections");
        listaDeTarefas.adicionarTarefa("Javando com Map", "Abrir a DIO e Estudar Map com Collections");
        listaDeTarefas.adicionarTarefa("Mexer no PC", "Zerar RDP 2");
        listaDeTarefas.adicionarTarefa("Estudar Ingles ", "Estudar com Videos em Ingles");


        System.out.println("Primeira Exibiçao! ");
        System.out.println();
        listaDeTarefas.exibirTarefas();
        System.out.println("A lista conta com " + listaDeTarefas.contarTarefas() + " tarefas");
        System.out.println("---------------------------------------------------------------------------");

//        Facilitando Testes
        String tituloRemovido = "esTUDAR";
        String descRemovido = "Abrir a DIO e ESTUDAR SET com CollectIOns";
        listaDeTarefas.removerTarefa(tituloRemovido, descRemovido);

        System.out.println("Segunda Exibiçao! ");
        System.out.println();
        listaDeTarefas.exibirTarefas();
        listaDeTarefas.contarTarefas();
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Marcando Tarefas Como Concluidas...");
        System.out.println();
        String tituloConcluido = "Estudar Ingles ";
        String descConcluido = "Estudar com Videos em Ingles";
        listaDeTarefas.marcarTarefaConcluida(tituloConcluido,descConcluido);
        tituloConcluido ="Mexer no PC";
        descConcluido = "Zerar RDP 2";
        listaDeTarefas.marcarTarefaConcluida(tituloConcluido,descConcluido);
        System.out.println("Tarefas Concluidas: ");
        listaDeTarefas.obterTarefasConcluidas().forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Obtendo Tarefas Pendentes...");
        System.out.println();
        listaDeTarefas.obterTarefasPendentes().forEach(System.out::println);
        System.out.println();
        System.out.println("Alterando uma Tarefa Concluida para Pendente");
        System.out.println();
        listaDeTarefas.marcarTarePendente(tituloConcluido,descConcluido);
        System.out.println();
        System.out.println("Nova Lista de Pendentes: ");
        listaDeTarefas.obterTarefasPendentes().forEach(System.out::println);

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Limpando Set de Tarefas");
        listaDeTarefas.limparListaTarefas();
        listaDeTarefas.exibirTarefas();
    }
}
