package fundamentos;

import java.util.Scanner;

public class CelsiusFarenheit {
    public static void main(String[] args) {

        // Criar um programa que leia a temperatura em Celsius e converta para Farenheit.
        // Fórmula: ( ºC * 9/5) + 32 = ºF

        final int ajuste = 32;
        final double divisor = 9.0 / 5.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = s.nextDouble();

        double resultado = celsius * divisor + ajuste;

        System.out.println(celsius + "°C para Fareheit é: " + resultado + "ºF.");


        s.close();
    }
}
