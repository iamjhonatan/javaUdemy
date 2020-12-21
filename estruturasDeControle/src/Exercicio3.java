import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        /*
        Criar um programa que receba duas notas parciais, calcular a média final.
        Se a nota do aluno for >= 7.0, imprima no console "Aprovado".
        Se for < 7.0 && > 4.0, imprima "Recuperação".
        Do contrário imprima "Reprovado".
         */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = s.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = s.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10){
            System.out.println("Uma das notas é inválida!");
        } else {
            if (media >= 7){
                System.out.println("Aprovado, parabéns!");
            } else if (media < 7 && media > 4){
                System.out.println("Em recuperação!");
            } else {
                System.out.println("Reprovado!");
            }
        }

        s.close();
    }
}
