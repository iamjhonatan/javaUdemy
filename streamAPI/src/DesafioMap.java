import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {

        Consumer<String> print = System.out::println;
        Consumer<Integer> println = System.out::println;

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
        1- Número para string binária... 6 => "110" (MAP)
        2- Inverter a string... "110" => "011" (MAP)
        3- Converter de volta para inteiro => "011" => 3 (MAP)
        Integer.
         */

        UnaryOperator<String> inverterNumero = s -> new StringBuilder(s).reverse().toString(); // classe manipulação de string
        Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2); // 2 para dizer que a conversão é para int, caso contrário seria convertido para binário

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverterNumero)
                .map(binarioParaInt)
                .forEach(System.out::println);
    }
}
