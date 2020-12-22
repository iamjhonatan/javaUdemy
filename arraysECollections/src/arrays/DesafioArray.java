package arrays;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        System.out.print("Quantas notas você quer informar? ");
        int qtdNotas = s.nextInt();

        double[] notas = new double[qtdNotas]; // array criado a partir da quantidade informada pelo usuário

        for (int i = 0; i < notas.length; i++){ // laço de repetição para o usuário inserir a quantidade de notas informada e inserir no array.
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = s.nextDouble();
        }

        double soma = 0;
        for(double nota: notas){ // somando as notas do array
            soma += nota;
        }

        System.out.println("A média das notas é: " + soma / notas.length + ".");
        s.close();
    }
}
