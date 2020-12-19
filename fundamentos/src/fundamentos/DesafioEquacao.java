package fundamentos;

import java.util.Scanner;

public class DesafioEquacao {
    public static void main(String[] args) {
        /* Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0), utilizando a fórmula de Bhaskara.
         Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta.
         */

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double a = s.nextDouble();

        System.out.println("Digite o valor de B: ");
        double b = s.nextDouble();

        System.out.println("Digite o valor de C: ");
        double c = s.nextDouble();

        double quadrado = Math.pow(b, 2);
        double delta = quadrado - 4 * a * c;

        System.out.printf("O valor de Δ é %.2f.", delta);

        s.close();
    }
}
