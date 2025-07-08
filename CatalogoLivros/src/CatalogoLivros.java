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

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public void removerLivro(String titulo, String autor){
        Livro tituloASerRemovido = null;
        if (!livrosList.isEmpty()){
            for (Livro l: livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo) && l.getAutor().equalsIgnoreCase(autor)){
                    tituloASerRemovido = l;
                }
            }
        } else {
             System.out.println("A lista esta vazia");
        }
        livrosList.remove(tituloASerRemovido);
    }

    public void menu() {
        System.out.printf("""
                Menu de Catalogos
                1 - Adicionar Livro
                2 - Pesquisar Livro Por Autor
                3 - Pesquisar Livro Por Intervalo de Lançamento
                4 - Pesquisar Livro Por Titulo
                5 - Remover livro do Catalogo
                6 - Encerrar o Programa

                Digite a opçao:
                """);
    }
}
