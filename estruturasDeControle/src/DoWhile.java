import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.print("Quer sair? ");
            texto = s.nextLine();
        } while(!texto.equalsIgnoreCase("por favor"));

        System.out.println("Fim do programa.");

        s.close();
    }
}
