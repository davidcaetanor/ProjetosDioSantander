import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorDeAlunos {
   private Set<Aluno> alunoSet;

    public GerenciadorDeAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota){
        alunoSet.add(new Aluno(nome,matricula,nota));
    }

    public void removerAluno(long matricula){
        Aluno alunoRemovido = null;
        if (!alunoSet.isEmpty()){
            for (Aluno a: alunoSet){
                if (a.getMatricula() == matricula){
                    alunoRemovido = a;
                    break;
                }
            }
            alunoSet.remove(alunoRemovido);
        }else{
            System.out.println("A lista de Alunos esta vazia");
        }
        if (alunoRemovido != null){
            System.out.println(alunoRemovido.getNome() + " removido com Sucesso!");
        } else {
            System.out.println("Nao Localizamos a matricula nº " + matricula);
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosOrdenadosPorNome = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()){
            return alunosOrdenadosPorNome;
        } else {
            throw new RuntimeException("O Conjunto esta vazio!");
        }
}

    public void exibirAlunos(){
        if (!alunoSet.isEmpty()){
            alunoSet.forEach(System.out::println);
        }
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparePorNota());
        if (!alunoSet.isEmpty()){
            alunosPorNota.addAll(alunoSet);
            return alunosPorNota;
        }else {
            throw  new RuntimeException("O Conjunto esta vazio! ");
        }
    }
}
