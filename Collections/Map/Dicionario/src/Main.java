public class Main {
    public static void main(String[] args) {
        DicionarioClass dicionario = new DicionarioClass();

        dicionario.adicionarPalavra("Java", "Linguagem de Programaçao");
        dicionario.adicionarPalavra("Revogar", "Anular, invalidar o efeito de algo;");
        dicionario.adicionarPalavra("escarlatinoso", "Doente de escarlatina.");
        dicionario.adicionarPalavra("Paradoxo", "Contradição ou oposição aparente: falo melhor quando emudeço");
        dicionario.adicionarPalavra("Significado", "Sentido de uma palavra, termo, frase; sentido, conceito.");

        System.out.println("Primeira exibiçao");
        dicionario.exibirPalavras();
        System.out.println();

        System.out.println("Segunda exibiçao");
        String palavraBusca = "Paradoxo";
        System.out.println("Pesquisando a palavra " + palavraBusca);
        System.out.println("Definiçao: " + dicionario.pesquisarPorPalavra(palavraBusca));
        System.out.println();

        String palavraRemovida = "Java";
        System.out.println("Terceira exibicao, palavra removida " + palavraRemovida);
        dicionario.removerPalavra(palavraRemovida);
        System.out.println();

        System.out.println("Exibindo todos as chaves e valores ate o momento");
        dicionario.exibirPalavras();
        System.out.println();

        System.out.println("Procurando pela palavra removida " + palavraRemovida);
        System.out.println(dicionario.pesquisarPorPalavra(palavraRemovida));

    }
}
