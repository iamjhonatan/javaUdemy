import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        /*
        Criar um programa que enquanto estiver recebendo números positivos, imprima no console
        a soma dos números inseriros. Caso receba um número negativo, encerre o programa.
        Utilize a estrutura WHILE.
         */

        Scanner s = new Scanner(System.in);

        int soma = 0;
        int num = 0;

        while (num >= 0){
            System.out.print("Digite qualquer número: ");
            num = s.nextInt();

            if (num >= 0) {
                soma += num;
                System.out.println("A soma dos números digitados é: " + soma + ".");
            }
        }
        System.out.println("Fim do programa.");

        s.close();
    }
}
