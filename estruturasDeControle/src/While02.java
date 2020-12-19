import java.util.Scanner;

public class While02 {

    public static void main(String[] args) {

        //While Indeterminado

        Scanner s = new Scanner(System.in);

        String str = "";

        while (!str.equalsIgnoreCase("Sair")){
            System.out.print("Digite qualquer coisa ou SAIR para sair do programa: ");
            str = s.next();
        }
        System.out.println("Fim do programa!");

        s.close();
    }
}
