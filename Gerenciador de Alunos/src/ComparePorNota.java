import java.util.Comparator;

public class ComparePorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
//        return Double.compare(a1.getNota(),a2.getNota()); // Do menor para o maior
          return Double.compare(a2.getNota(),a1.getNota());
    }
}
