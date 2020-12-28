import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        // Reduce é uma função terminal, a saída não é uma Stream
        // Retornando um Optional de integer
        // Stream serial
        int total1 = nums.stream().reduce(soma).get(); // usando o GET para pegar o resultado gerado
        System.out.println(total1);

        // Executando a chamada dos elementos de forma paralela
        // Ou seja, para cada elemento chamado, foi inicializado com o elemento 100, logo foi somado os dois valores. Cada número, foi somado com o 100
        Integer total2 = nums.parallelStream().reduce(100, soma); // como foi passado um valor inicial, Integer não tem problema
        System.out.println(total2);

        // Resultado foi um Opcional<Integer>
        nums.stream()
                .filter(n -> n > 5)
                .reduce(soma)
                .ifPresent(System.out::println);


    }
}
