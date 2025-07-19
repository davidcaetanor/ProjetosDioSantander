import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

   /* testando de outra forma!!
   public void pesquisarPorAutor(String autor){
        if(!livrosList.isEmpty()){
            List<String> livrosPorAutor = new ArrayList<>();
            for (Livro l : livrosList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l.getTitulo());
                }
            }
            livrosPorAutor.forEach(System.out::println);
        } else{
            System.out.println("Adicione algo a lista primeiro");
        }
    }*/

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public List<Livro> pesquisarPorTitulo(String titulo) {
        List <Livro> livroPorTitulo = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo.add(l);
                }
            }
        }
        return livroPorTitulo;
    }

    public void removerLivro(String titulo, String autor){
        Livro tituloASerRemovido = null;
        boolean livroExiste = false;
        if (!livrosList.isEmpty()){
            for (Livro l: livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo) && l.getAutor().equalsIgnoreCase(autor)){
                    tituloASerRemovido = l;
                    livroExiste = true;
                    break;
                }
            }
        } else {
             System.out.println("A lista esta vazia");
        }
        if (livroExiste){
            livrosList.remove(tituloASerRemovido);
            System.out.println(tituloASerRemovido);
            System.out.println("Removido com sucesso!");
        }else {
            System.out.println("O Livro nao existe no catalogo!");
        };
    }
}
