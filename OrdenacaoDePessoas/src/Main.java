public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa pessoasOrdenadas = new OrdenacaoPessoa();

        pessoasOrdenadas.adicionarPessoa("David",23,1.85);
        pessoasOrdenadas.adicionarPessoa("Leticia",23,1.58);
        pessoasOrdenadas.adicionarPessoa("Ana",24,1.59);
        pessoasOrdenadas.adicionarPessoa("Duda",20,1.70);

        System.out.println("Pessoas Por Altura");
        System.out.println();
        pessoasOrdenadas.ordenarPorAltura().forEach(System.out::println);
        System.out.println();
        System.out.println("Pessoas Por Idade");
        System.out.println();
        pessoasOrdenadas.ordenarPorIdade().forEach(System.out::println);
        System.out.println();
        System.out.println("Pessoas em Ordem Alfabetica");
        System.out.println();
        pessoasOrdenadas.ordenarPorNome().forEach(System.out::println);
    }
}
