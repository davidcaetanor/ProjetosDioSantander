public class Main {
    public static void main(String[] args) {
        GerenciadorDeAlunos gerenciadorDeAlunos = new GerenciadorDeAlunos();

        gerenciadorDeAlunos.adicionarAluno("David",7578,10.0);
        gerenciadorDeAlunos.adicionarAluno("Ana",7578,7.5);
        gerenciadorDeAlunos.adicionarAluno("Ana",7518,7.5);
        gerenciadorDeAlunos.adicionarAluno("Cleber",7178,4.3);
        gerenciadorDeAlunos.adicionarAluno("Bento",9578,8.7);
        gerenciadorDeAlunos.adicionarAluno("Eleonor",8778,9.8);

        System.out.println("Verificando todos os alunos na lista e checando Matriculas");
        gerenciadorDeAlunos.exibirAlunos();
        System.out.println("-=-=-=--=-=-=--=-=-=--=-=-=--=-=-=--=-=-=--=-=-=--=-=-=--=-=-=--=-=-=-");
        System.out.println("Alunos Por Nome: ");
        System.out.println();
        gerenciadorDeAlunos.exibirAlunosPorNome().forEach(System.out::println);
        System.out.println("-=-=-=--=-=-=--=-=-=--=-=-=--=-=-=--=-=-=--=-=-=--=-=-=--=-=-=--=-=-=-");
        System.out.println("Removendo um Aluno ");
        System.out.println();
        gerenciadorDeAlunos.removerAluno(7178);
        System.out.println();
        gerenciadorDeAlunos.exibirAlunosPorNome().forEach(System.out::println);
        System.out.println("-=-=-=--=-=-=--=-=-=--=-=-=--=-=-=--=-=-=--=-=-=--=-=-=--=-=-=--=-=-=-");
        System.out.println("Alunos por nota: ");
        System.out.println();
        gerenciadorDeAlunos.exibirAlunosPorNota().forEach(System.out::println);
    }
}
