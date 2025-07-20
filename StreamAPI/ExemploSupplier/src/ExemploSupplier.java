import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploSupplier {
    public static void main(String[] args) {
//        TODO: UTILIZAR SUPPLIER COM EXPRESSOES LAMBDAS, ESSE EXEMPLO IRA USAR SUPPLIER SEM ARGUMENTO RETORNANDO UM T

        // Supplier com expressao lambda, ele nao tem argumento por isso o () vazio
        Supplier<String> saudacao = () -> "Seja bem vindo";

        //Usando o Supplier para ter uma lista com 5 saudacoes
        // Gera uma lista com 5 saudações usando o Supplier: generate() chama o Supplier, limit() define a quantidade, toList() coleta os elementos
        List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
