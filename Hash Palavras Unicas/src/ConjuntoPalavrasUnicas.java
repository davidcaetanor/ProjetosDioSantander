import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> conjuntoDePalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoDePalavrasUnicas = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ConjuntoPalavrasUnicas that = (ConjuntoPalavrasUnicas) o;
        return Objects.equals(conjuntoDePalavrasUnicas, that.conjuntoDePalavrasUnicas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(conjuntoDePalavrasUnicas);
    }

    public void adicionarPalavra(String palavra) {
        conjuntoDePalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!conjuntoDePalavrasUnicas.isEmpty()) {
            String palavraRemovida;
            for (String pl : conjuntoDePalavrasUnicas) {
                if (pl.equalsIgnoreCase(palavra)) {
                    palavraRemovida = pl;
                    conjuntoDePalavrasUnicas.remove(palavraRemovida);
                    System.out.printf("A palavra %s foi removida com Sucesso!\n", palavraRemovida);
                    break;
                }
            }
        } else {
            System.out.println("O SET esta vazio!");
        }
    }

    public void verificarPalavra(String palavra) {
        if (!conjuntoDePalavrasUnicas.isEmpty()) {
            boolean palavraExiste = false;
            for (String palavras : conjuntoDePalavrasUnicas) {
                if (palavras.equalsIgnoreCase(palavra)) {
                    palavraExiste = true;
                    break;
                }
            }
            if (palavraExiste){
                System.out.printf("A palavra %s esta no Conjunto \n", palavra);
            }else{
                System.out.printf("A palavra %s nao esta no conjunto\n", palavra);
            }
        } else {
            System.out.println("O Set esta vazio!");
        }
    }


    public void exibirPalavrasUnicas() {
        if (!conjuntoDePalavrasUnicas.isEmpty()) {
            conjuntoDePalavrasUnicas.forEach(System.out::println);
        } else {
            System.out.println("O Set esta vazio!");
        }
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" + "conjuntoDePalavrasUnicas=" + conjuntoDePalavrasUnicas + '}';
    }

    public void contarPalavras(){
        if (!conjuntoDePalavrasUnicas.isEmpty()){
            System.out.println(conjuntoDePalavrasUnicas.size());
        }else{
            System.out.println(0);
        }
    }

}
