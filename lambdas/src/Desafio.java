import java.util.Locale;
import java.util.function.*;

public class Desafio {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        /*
        1- A partir do produto, calcular o preco real (com desconto)
        2- Imposto municipal: >= 2.500 (8,5%) / < 2.500 (Isento)
        3- Frete: >= 3000 (100) / < 3000 (50)
        4- Arredondar: Deixar duas casas decimais
        5- Formatar: R$1234,56
         */

        Function<Produto, Double> precoReal = produto -> produto.preco * (1 - produto.desconto); // 1
        UnaryOperator<Double> calcImposto = valor -> valor >= 2500 ? valor * 1.085 : valor;
        UnaryOperator<Double> calcFrete = valor -> valor >= 3000 ? valor + 100 : valor + 50;
        UnaryOperator<Double> arredondar = valor -> Double.parseDouble(String.format("%.2f", valor)); // formatando como string, convertendo para double e retornando
        Function<Double, String> formatar = valor -> ("R$" + valor).replace(".", ",");

        Produto p = new Produto("iPad", 3235.89, 0.13);

        String preco = precoReal
                .andThen(calcImposto)
                .andThen(calcFrete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preço final é " + preco + ".");
    }
}
