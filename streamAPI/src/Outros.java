import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Pedro", 6.1);
        Aluno a7 = new Aluno("Gui", 8.1);
        Aluno a8 = new Aluno("Maria", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("Distinct: ");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit: "); // Paginação dentro do Stream
        alunos.stream()
                .distinct()
                .skip(2) // quantos elementos eu quero pular?
                .limit(2) // depois dos pulos, quantos elementos eu quero retornar?
                .forEach(System.out::println);

        // pegue elementos enquanto acontecer determinada condição
        // quando a condição não for satisfeita, mesmo que hajam elementos que seriam satisfariam a condição posteriormente, a função é parada
        // o resultado é uma Stream
        System.out.println("\ntakeWhile: ");
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 7) // condição para retorno
                .forEach(System.out::println);
    }
}
