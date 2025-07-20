import java.util.HashMap;
import java.util.Map;

public class LibaryOnline {
    Map<String, Livro> livrosMap;

    public LibaryOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void addBook(String link, String title, String author, double price){
        livrosMap.put(link, new Livro(title, author, price));
    }

    public void rem
}
