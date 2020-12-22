package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdAlunos = s.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qtdNotas = s.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for(int a = 0; a < notasDaTurma.length; a++){ // aluno
            for(int n = 0; n < notasDaTurma[a].length; n++){ // nota
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = s.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("A média da turma é " + media + ".");

        for(double[] notasDoAluno: notasDaTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }

        s.close();
    }
}
