import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        // Criar um programa que informe se o ano atual é um ano bissexto

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = s.nextInt();

        int bissexto = ano % 4;

        if (bissexto == 0){
            System.out.println("O ano " + ano + " É um ano bissexto.");
        } else{
            System.out.println("O ano " + ano + " NÃO é um ano bissexto.");
        }

        s.close();
    }
}
