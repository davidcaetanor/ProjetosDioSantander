import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ExemploBinaryOperator {
    public static void main(String[] args) {
        // TODO:  Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
        //  É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.

        List<Integer> numeros = Arrays.asList(7, 8, 9, 10, 7, 23, 450, 1);

//      Binary como expressao lambda para transformar dois numeros inteiros
//        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

//        Com metodo referencia fica assim
        BinaryOperator<Integer> somar = Integer::sum;

//      Usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream().reduce(0, somar);

        System.out.println("Resultado: " + resultado);
    }
}
