import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosInteirosList;

    public SomaNumeros() {
        this.numerosInteirosList = new ArrayList<>();
    }

    public void adicionarNumero(int numeroADD){
        numerosInteirosList.add(numeroADD);
    }

    public int calcularSoma(){
        int resultado = 0;
        if (!numerosInteirosList.isEmpty()){
            for (Integer n: numerosInteirosList){
                resultado += n;
            }
        }
        return resultado;
    }

    public int encontrarMaiorNumero(){
        return Collections.max(numerosInteirosList);
    }
    public int encontrarMenorNumero(){
        return Collections.min(numerosInteirosList);
    }

    public void exibirNumeros(){
       numerosInteirosList.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "numerosInteirosList=" + numerosInteirosList +
                '}';
    }

}
