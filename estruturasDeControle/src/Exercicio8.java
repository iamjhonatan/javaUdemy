import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        // Criar um programa que receba uma palavra e imprime no console letra por letra

        char[] letras = null;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = s.next();


        for(int i = 0; i < palavra.length(); i++){
            letras = palavra.toCharArray();
            System.out.println(letras[i]);
        }

        s.close();
    }
}
