package fundamentos;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabTerca = false;
        boolean trabQuinta = false;
        boolean tv50 = trabTerca && trabQuinta;
        boolean tv32 = trabTerca ^ trabQuinta;
        boolean sorvete = trabQuinta || trabTerca;

        System.out.println("Comprou TV 50\"? " + tv50);
        System.out.println("Comprou TV 32\"? " + tv32);
        System.out.println("Comprou sorvete? " + sorvete);
        System.out.println("Mais saudável? " + !sorvete);
    }
}
