import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(-1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

//        Todo: Desafio 1 - Mostre a lista na ordem numérica:
        System.out.println("Desafio 1 - Mostre a lista na ordem numérica:");
        List<Integer> numerosEmOrdem = numeros.stream().sorted().toList();
        System.out.println(numerosEmOrdem);
        System.out.println();

//        Todo: Desafio 2 - Imprima a soma dos números pares da lista:
        System.out.println("Desafio 2 - Imprima a soma dos números pares da lista:");
        Predicate<Integer> somaDeNumerosPares = numero -> numero % 2 == 0;
        int somaNumerosPares = numeros.stream().filter(somaDeNumerosPares).reduce(0, Integer::sum);
        System.out.println(somaNumerosPares);
        System.out.println();

//        Todo: Desafio 3 - Verifique se todos os números da lista são positivos:
        System.out.println("Desafio 3 - Verifique se todos os números da lista são positivos: ");
        numeros.stream().filter(n -> n > 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println();

//        TODO: Desafio 4 - Remova todos os valores ímpares:
        System.out.println("Desafio 4 - Remova todos os valores ímpares:");
        List<Integer> semNumerosImpares = numeros.stream().filter(n -> n % 2 == 0).toList();
        semNumerosImpares.forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println();

//        Todo: Desafio 5 - Calcule a média dos números maiores que 5
        System.out.println("Desafio 5 - Calcule a média dos números maiores que 5:");
        int mediaNumerosMCinco = (int) numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println(mediaNumerosMCinco);
        System.out.println();

//    Todo: Desafio 6 - Verificar se a lista contém algum número maior que 10
        System.out.println("Desafio 6 - Verificar se a lista contém algum número maior que 10:");
        System.out.println(numeros.stream().anyMatch(n -> n > 10) ? "Tem numero maior que 10, " : "Nao tem Numero maior que 10");
    }
}
