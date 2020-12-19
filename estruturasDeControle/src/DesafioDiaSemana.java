import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {
        // Domingo -> 1
        // Segunda -> 2
        // Terça -> 3
        // Quarta -> 4
        // Quinta -> 5
        // Sexta -> 6
        // Sábado -> 7

        Scanner s = new Scanner(System.in);

        System.out.print("Escreva um dia da semana: ");
        String dia = s.next();

        if (dia.equalsIgnoreCase("Domingo")){
            System.out.println(1);
        } else if(dia.equalsIgnoreCase("Segunda")){
            System.out.println(2);
        } else if (dia.equalsIgnoreCase("Terça") || dia.equalsIgnoreCase("terca")){
            System.out.println(3);
        } else if (dia.equalsIgnoreCase("Quarta")){
            System.out.println(4);
        } else if (dia.equalsIgnoreCase("Quinta")){
            System.out.println(5);
        } else if (dia.equalsIgnoreCase("Sexta")){
            System.out.println(6);
        } else if (dia.equalsIgnoreCase("Sábado") || dia.equalsIgnoreCase("sabado")){
            System.out.println(7);
        } else {
            System.out.println("Dia inválido!");
        }

        s.close();
    }
}
