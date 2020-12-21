import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        // Criar um programa que receba um número e diga se ele é um número primo

        int contadorDeDivisores = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = s.nextInt();

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                contadorDeDivisores++;
            }
        }

        if (contadorDeDivisores == 0){
            System.out.println("O número " + num + " É primo.");
        } else {
            System.out.println("O número " + num + " NÃO é primo!");
        }

        s.close();
    }
}
