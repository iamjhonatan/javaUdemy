import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = s.nextDouble();

        if(media <= 10 && media >= 7.0){
            System.out.println("Aprovado!");
        }


        s.close();
    }
}
