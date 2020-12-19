package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // + - * / %

        Scanner s = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double num1 = s.nextDouble();

        System.out.print("Informe o segundo número: ");
        double num2 = s.nextDouble();

        System.out.print("Informe a operação: ");
        String op = s.next();

        // Lógica com operadores Ternários
        // Se os casos não forem satisfeitos, o retorno será 0
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        // PrintF (formatado)
        System.out.printf("%.2f %s %.2f = %.2f",
                num1, op, num2, resultado);

        s.close();
    }
}
