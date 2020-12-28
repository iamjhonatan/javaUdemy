import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce02 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        // usando o predicado como filtro, retorna True or False
        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        // fazendo o mapeamento
        Function<Aluno, Double> apenasNota = a -> a.nota;

        BinaryOperator<Double> somatorio = (a, b) -> a + b;

        alunos.parallelStream() // não terá nenhum valor inicial, logo não terá nenhum efeito colateral
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);
    }
}
