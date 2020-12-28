import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce03 {

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

        // Media = acumulador | Double = valor de cada um dos elementos | Media = resultado
        BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);

        // recebe duas médias (operador binario)
        BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);

        // Pipeline de execução
        Media media = alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(new Media(), calcularMedia, combinarMedia);

        System.out.println("A média da turma é " + media.getValor());
    }
}
