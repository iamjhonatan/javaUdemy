package desafioTemperatura;

public class Temperatura {
    public static void main(String[] args) {
        // Fórmula: (ºF - 32) x 5/9 = ºC

        final int ajuste = 32;
        final double multiplicador = 5.0 / 9.0;

        double farenheit = 150;

        double resultado = (farenheit - ajuste) * multiplicador;

        System.out.println("O valor em Celsius convertido de Farenheit é de: " + resultado + " ºC.");

    }
}
