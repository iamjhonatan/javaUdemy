import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

        //Operação de construção (Build operation) = STREAM
        //Operação intermediária = MAP
        //Operação terminais = ForEach
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        //UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        //UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + ""; // caractere concatenado com uma string vazia gera uma saída String
        //UnaryOperator<String> grito = n -> n + "!!!";

        System.out.println("\n\nUsando composição: ");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios::grito) // usando Method Reference (referência de método)
                .forEach(print);
    }
}
