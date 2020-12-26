import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional:");
        for(String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("\nLambda #01...");
        aprovados.forEach(nome -> { // com apenas um parâmetro, não é necessário colocar os '()'
            System.out.println(nome + "!!");
        });

        System.out.println("\nMethod Reference #01:");
        aprovados.forEach(System.out::println); // passando uma referência para a função

        System.out.println("\nLambda #02...");
        aprovados.forEach(nome -> { // com apenas um parâmetro, não é necessário colocar os '()'
            meuImprimir(nome);
        });

        System.out.println("\nMethod Reference #02:");
        aprovados.forEach(ForEach::meuImprimir);
    }

    static void meuImprimir(String nome){
        System.out.println("Oi, meu nome é " + nome);
    }
}
