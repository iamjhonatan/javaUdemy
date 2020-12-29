import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        try {
            System.out.println(7 / s.nextInt());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally #01...");
        }

        try { // bloco sem o catch
            System.out.println(7 / s.nextInt());
        } finally {
            System.out.println("Finally #02...");
            s.close();
        }

        System.out.println("Fim!");
    }
}
