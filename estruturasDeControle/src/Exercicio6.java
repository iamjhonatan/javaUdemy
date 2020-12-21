import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        /* Jogo da Adivinhação!

        Tentar adivinhar um número entre 0 e 100.
        Armazene um número aleatório em uma variável. O jogador tem 10 tentativas para adivinhar o número gerado.
        Ao final de cada tentativa, imprima a quantidade de tentativas restantes.
        Imprima se o número inserido é maior ou menor que o número armazenado.
         */

        Random random = new Random();

        int numRan = random.nextInt(100);
        //System.out.println(numRan);

        Scanner s = new Scanner(System.in);

        for (int i = 10; i >= 0; i--){
            System.out.print("Tente adivinhar o número que selecionamos: ");
            int numJogador = s.nextInt();

            if (numJogador != numRan){
                System.out.println("Número errado! =( \nVocê ainda tem " + i + " tentativas.\n");
                if (numJogador > numRan){
                    System.out.println("DICA: O número que você digitou é MAIOR que nosso número!");
                } else{
                    System.out.println("DICA: O número que você digitou é MENOR que nosso número!");
                }
            } else {
                System.out.println("ACERTOU!!!");
                break;
            }
        }

        s.close();
    }
}
