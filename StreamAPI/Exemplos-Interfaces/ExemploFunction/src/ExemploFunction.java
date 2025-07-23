import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ExemploFunction {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 4, 6, 8, 10, 12, 15);

        // Function com expressao Lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        /*
        Crio uma lista que recebe a lista inicial de números, com o metodo stream,
        usando map e a funçao dobrar, retornando os valores para a lista com tolist
         */
        List<Integer> numerosDobrados = numeros.stream().map(dobrar).toList();

        System.out.println("Lista valores iniciais: ");
        numeros.forEach(System.out::println);

        System.out.println("Lista valores dobrados: ");
        numerosDobrados.forEach(System.out::println);

    }
}
