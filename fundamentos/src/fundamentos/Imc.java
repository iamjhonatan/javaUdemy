package fundamentos;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        // Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = s.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = Double.parseDouble(s.next().replace(",", "."));

        double calculo = peso / (Math.pow(altura, 2));

        System.out.printf("O resultado é %.1f.", calculo);

        s.close();
    }
}
