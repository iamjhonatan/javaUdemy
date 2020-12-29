package personalizadaA;

import java.util.Objects;

public class Aluno {

    public String nome;
    public double nota;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(aluno.nota, nota) == 0 && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome = '" + nome + '\'' +
                ", nota = " + nota +
                '}';
    }
}
