import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        contatoSet.forEach(System.out::println);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> setNomesDaPesquisa = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){ // Adiciona todos os nomes que começam com o atributo ""NOME""
                setNomesDaPesquisa.add(c);
            }
        }
        return setNomesDaPesquisa;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

}
