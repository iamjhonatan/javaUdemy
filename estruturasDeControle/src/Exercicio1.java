import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        // Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número entre 0 e 10: ");
        int num = s.nextInt();

        if (num >= 0 && num <= 10){
            System.out.println("Está no range de 0 a 10! =)");
            if (num % 2 == 0){
                System.out.println("Esse numero é PAR!");
            } else {
                System.out.println("Esse número é ÍMPAR!");
            }
        } else {
            System.out.println("Está fora do range!");
        }

        s.close();
    }
}
