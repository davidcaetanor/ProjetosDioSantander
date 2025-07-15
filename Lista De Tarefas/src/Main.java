public class Main {
    public static void main(String[] args) {
        ListaTarefas listaDeTarefas = new ListaTarefas();

        listaDeTarefas.adicionarTarefa("Estudar", "Abrir a DIO e Estudar Set com Collections");
        listaDeTarefas.adicionarTarefa("Mexer no PC", "Abrir a DIO e Estudar Map com Collections");
        listaDeTarefas.adicionarTarefa("Mexer no PC", "Zerar RDP 2");
        listaDeTarefas.adicionarTarefa("Estudar Ingles ", "Estudar com Videos em Ingles");


        System.out.println("Primeira Exibiçao! ");
        System.out.println();
        listaDeTarefas.exibirTarefas();
        listaDeTarefas.contarTarefas();
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

    }
}
