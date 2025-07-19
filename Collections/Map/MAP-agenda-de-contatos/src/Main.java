public class Main {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Leticia",7756);
        agendaContatos.adicionarContato("David",777);
        agendaContatos.adicionarContato("Sandra",222);
        agendaContatos.adicionarContato("Marcilio",1156);
        agendaContatos.adicionarContato("Maria",425446);
        agendaContatos.adicionarContato("Eduarda",534346);
        agendaContatos.adicionarContato("Ana",59784);
        agendaContatos.adicionarContato("Gabriel",898);
        // map faz upadate, diferente do set.
        System.out.println("First");
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Gabriel"));
        agendaContatos.removerContato("Gabriel");
        System.out.println("Second");
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Gabriel"));
    }
}
