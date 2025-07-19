public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("David", 11945);
        agenda.adicionarContato("Ronaldo", 11945);
        agenda.adicionarContato("David Caetano", 11945);
        agenda.adicionarContato("David Ribeiro ", 11945);
        agenda.adicionarContato("David USTJ", 11945);
        agenda.adicionarContato("Gustavo", 11945);

        System.out.println("Contatos da Agenda: ");
        agenda.exibirContatos();

        System.out.println();
        String pesquisa = "Davi";
        System.out.println("Filtrando por: " + pesquisa);
        System.out.println(agenda.pesquisarPorNome(pesquisa));
        System.out.println();

        System.out.println("Atualizando contato");
        agenda.atualizarNumeroContato("David", 4575);
        System.out.println();

        System.out.println("Contatos da agenda");
        agenda.exibirContatos();
    }
}
