import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return  pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);

//        Collections.sort(pessoasPorAltura, new ComparePorAltura());       METODO ALTERNATIVO EMBAIXO

        pessoasPorAltura.sort(new ComparePorAltura());

        return pessoasPorAltura;
    }

    public List<Pessoa> ordenarPorNome(){
        List<Pessoa> pessoasPorNome = new ArrayList<>(pessoaList);
        pessoasPorNome.sort(new ComparePorNome());
        return pessoasPorNome;
    }

}
