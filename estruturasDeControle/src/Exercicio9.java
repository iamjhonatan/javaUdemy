import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        // Crie um programa que receba 10 números e ao final imprima o maior número.

        Scanner s = new Scanner(System.in);

        int maior = 0;
        int contador = 0;

        do {
            System.out.print("Digite 10 números: ");
            int num = s.nextInt();

            if (num > maior){
                maior = num;
            }
            contador++;
        } while (contador != 10);

        System.out.println("O maior número digitado foi " + maior + ".");

        s.close();
    }
}
