import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        /*
        Utilizando a interface funcional Consumer com expressão lambda.
         */

        // Array List de Numeros Inteiros
        List<Integer> numerosInteiros = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        // Forma Tradicional de Fazer isso
//        for (int i = 0; i < numerosInteiros.size(); i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        // Primeira Utilizacao de um Consumer
//        Consumer<Integer> imprimirNumeroPar = QualquerNomeDeVariavel -> {
//            if (QualquerNomeDeVariavel % 2 == 0) {
//                System.out.println(QualquerNomeDeVariavel);
//            }
// }; // Se rodar um breakpoint ate aqui, no console ainda nao imprimiu, interfaces sao abstratas.


        // Dessa forma utilizamos o Consumer para imprimir pares na Stream
//        numerosInteiros.stream().forEach(imprimirNumeroPar);


        // Usando o Consumer dentro do ForEach
//        numerosInteiros.stream().forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//                if (n % 2 == 0){
//                    System.out.println(n);
//                }
//            }
//        });

        // VERSAO lambda final
        numerosInteiros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}
