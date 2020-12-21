

public class Switch01 {

    public static void main(String[] args) {
        // Switch sem break

        String faixa = "branca";

        switch (faixa.toLowerCase()){
        case "preta":
            System.out.println("Sei o Bassai-Dai...");

        case "marrom":
            System.out.println("Sei o Tekki Shodan...");

        case "verde":
            System.out.println("Sei Heian Godan...");

        case "laranja":
            System.out.println("Sei Heian Sandan...");

        case "vermelha":
            System.out.println("Sei Heian Nidan...");

        case "amarela":
            System.out.println("Sei Heian Shodan...");

        default:
            System.out.println("Não sei nada! =(");
        }
    }
}
