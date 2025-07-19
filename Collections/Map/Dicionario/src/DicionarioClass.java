import java.util.HashMap;
import java.util.Map;

public class DicionarioClass {
    private Map<String, String> dicionarioMap;

    public DicionarioClass() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        boolean palavraRemovida = false;
        if (!dicionarioMap.isEmpty()) {
            if (dicionarioMap.containsKey(palavra)) { // confirma se a palavra existe no dicionario
                dicionarioMap.remove(palavra);
                palavraRemovida = true;
            }
        } else {
            System.out.println("Dicionario Vazio!");
        }
        if (palavraRemovida) {
            System.out.println("Palavra removida com Sucesso!");
        } else {
            System.out.println("Nao Localizamos essa Palavra...");
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        }else {
            System.out.println("Dicionario vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        boolean palavraEncontrada = false;
        if (!dicionarioMap.isEmpty()) {
            if (dicionarioMap.containsKey(palavra)) {
                palavraEncontrada = true;
            }
        } else {
            return "Dicionario Vazio!";
        }
        if (palavraEncontrada) {
            return dicionarioMap.get(palavra);
        } else {
            return "Palavra nao encontrada! ";
        }
    }

    @Override
    public String toString() {
        return "DicionarioClass{" + "dicionarioMap=" + dicionarioMap + '}';
    }
}
