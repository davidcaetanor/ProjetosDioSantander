public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntinho = new ConjuntoPalavrasUnicas();

        conjuntinho.adicionarPalavra("CHIMPANZE");
        conjuntinho.adicionarPalavra("ALIANÇA");
        conjuntinho.adicionarPalavra("XISCRUTES");
        conjuntinho.adicionarPalavra("Roberto");
        conjuntinho.adicionarPalavra("David");
        conjuntinho.adicionarPalavra("Lele");

        System.out.println("Palavras unicas no conjunto: ");
        conjuntinho.exibirPalavrasUnicas();
        System.out.println();

        System.out.print("Quantidade de Palavras unicas no SET: ");
        conjuntinho.contarPalavras();
        System.out.println();

        System.out.println("Verificar palavra: ");
        conjuntinho.verificarPalavra("daVId");

        System.out.println();
        conjuntinho.removerPalavra("david");
        System.out.println();

        System.out.println("Verificar palavra: ");
        conjuntinho.verificarPalavra("daVId");
        System.out.println();

        System.out.println("Palavras unicas no conjunto: ");
        conjuntinho.exibirPalavrasUnicas();
        System.out.println();

        System.out.print("Quantidade de Palavras unicas no SET: ");
        conjuntinho.contarPalavras();
    }
}
