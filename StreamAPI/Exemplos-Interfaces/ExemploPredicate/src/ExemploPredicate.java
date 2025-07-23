import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExemploPredicate {
    public static void main(String[] args) {

        List<String> linguagens = Arrays.asList("Java", "Kotlin", "C", "Python", "Go", "JavaScript", "React", "MySQL");

        // O Predicate pega um T e o transforma em Boolean usando a lógica aplicada, aqui ele so retorna TRUE se tiver mais de 5 letras
        Predicate<String> peloMenosCincoLetras = palavra -> palavra.length() >= 5;

        // Nova lista utilizando Streams, se o filter indicar true adiciona, senao passa reto
        List<String> linguagensComPeloMenosCincoLetras = linguagens.stream().filter(peloMenosCincoLetras).toList();

        // Aqui passa por todas as palavras listadas em LINGUAGENS e

        // imprime somente se o filtro informar que são mais de 5 letras
        System.out.println("+5 Letras");
        linguagens.stream().filter(peloMenosCincoLetras).forEach(System.out::println);

        System.out.println();

        System.out.println("-= 4 Letras");
        linguagens.stream().filter(p -> p.length() <= 4).forEach(System.out::println);

        System.out.println();
        System.out.println("Lista criada somente com palavras com ao menos 5 letras: ");
        linguagensComPeloMenosCincoLetras.forEach(System.out::println);
        System.out.println();

        List<Integer> numeros = Arrays.asList(7,8,10,9,5,3,2,12,86,172,56,46);
        System.out.println("Colocando a lista de numeros em Ordem numerica e Imprindo apenas os PARES: ");
        numeros.stream().sorted().filter(n->n % 2 ==0).forEach(System.out::println);
    }
}
