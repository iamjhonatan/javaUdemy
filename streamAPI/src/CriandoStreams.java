import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n"); // 'of' é um método estático / passando os valores literais
        langs.forEach(print);

        String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };

        Stream.of(maisLangs).forEach(print); // criando stream a partir de um array, encadeando um foreach, passando o print como parâmetro, que foi definido como uma função
        Arrays.stream(maisLangs).forEach(print); // criando stream a partir da classe Arrays, passando um array.
        Arrays.stream(maisLangs, 1, 4).forEach(print); // filtrando a stream, passando o range dos índices que serão printados


        // Gerando Streams a partir de Collections

        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print); // abrindo um Stream paralelo / dados são processados sem ordem

        // Criando uma stream com um método Generate: é criado uma stream, potencialmente infinita, que não possui ordem
        // Passando uma função Suplier como parâmetro, onde ela não recebe parâmetros e retorna algo
        // Stream.generate(() -> "a").forEach(print);
        Stream.iterate(0, n -> n + 1).forEach(println); // gerando valores potencialmente infinitos, ordenados
    }
}
