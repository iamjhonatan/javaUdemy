import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {
        // Com break

        Scanner s = new Scanner(System.in);

        String conceito = "";
        System.out.print("Informe a nota: ");
        int nota = s.nextInt();

        switch (nota){
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "C";
                break;
            case 4: case 3:
                conceito = "D";
                break;
            case 2: case 1: case 0:
                conceito = "E";
                break;
            default:
                conceito = "Nota inválida!";
        }
        System.out.println("Conceito é: " + conceito);

        s.close();
    }
}
