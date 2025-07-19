import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoRemovido = null;
        for(Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoRemovido = c;
                break;
            }
        }
        if (convidadoRemovido != null){
            convidadoSet.remove(convidadoRemovido);
        } else {
            System.out.println("Nao foi localizado nenhum convidado com esse Codigo");
        }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        convidadoSet.forEach(System.out::println);
    }

}
