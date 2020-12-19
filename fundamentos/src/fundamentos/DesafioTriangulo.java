package fundamentos;

import java.util.Scanner;

public class DesafioTriangulo {
    public static void main(String[] args) {

        // Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
        // Fórmula: Área = Base * Altura / 2

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor da base do triângulo: ");
        double base = s.nextDouble();

        System.out.println("Digite a altura do triângulo: ");
        double altura = s.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("A área do triâgulo é de %.2f.", area);

        s.close();
    }
}
