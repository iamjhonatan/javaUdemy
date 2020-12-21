import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        // Refatorar o exercício 04, utilizando a estrutura switch

        int contadorDeDivisores = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = s.nextInt();

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                contadorDeDivisores++;
            }
        }

        switch (contadorDeDivisores){
            case 0:
                System.out.println("O número " + num + " É um número primo!");
                break;
            default:
                System.out.println("O número " + num + " NÃO é um número primo!");
        }

        s.close();
    }
}
