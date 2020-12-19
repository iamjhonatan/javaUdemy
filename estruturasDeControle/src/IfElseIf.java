import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10: ");
        double nota = s.nextDouble();

        if (nota < 0 || nota > 10){
            System.out.println("Nota inválida!");
        } else if (nota >= 8.1){
            System.out.println("Conceito A!");
        } else if (nota >= 6.1){
            System.out.println("Conceito B!");
        } else if (nota >= 4.1){
            System.out.println("Conceito C!");
        } else if(nota >= 2.1){
            System.out.println("Conceito D!");
        } else {
            System.out.println("Conceito E!");
        }

        s.close();
    }
}
