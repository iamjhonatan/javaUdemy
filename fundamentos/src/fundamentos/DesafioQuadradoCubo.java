package fundamentos;

import java.util.Scanner;

public class DesafioQuadradoCubo {

    public static void main(String[] args) {
        // Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

        Scanner s = new Scanner(System.in);

        System.out.print("Informe o número: ");
        double num = s.nextDouble();

        double quadrado = Math.pow(num, 2);
        double cubo = Math.pow(num, 3);

        System.out.println(num + "² = " + quadrado);
        System.out.println(num + "³ = " + cubo);

        s.close();
    }
}
