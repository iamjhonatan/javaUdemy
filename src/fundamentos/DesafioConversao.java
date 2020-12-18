package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu último salário: ");
        String salario1 = s.next().replace(",", ".");

        System.out.print("Digite seu penúltimo salário: ");
        String salario2 = s.next().replace(",", ".");

        System.out.print("Digite seu antepenúltimo salário: ");
        String salario3 = s.next().replace(",", ".");

        double num1 = Double.parseDouble(salario1);
        double num2 = Double.parseDouble(salario2);
        double num3 = Double.parseDouble(salario3);

        double soma = num1 + num2 + num3;
        System.out.println("A média de salário é de " + soma / 3);

        s.close();
    }
}
