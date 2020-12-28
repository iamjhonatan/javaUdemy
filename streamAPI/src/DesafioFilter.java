import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {
        Produto p1 = new Produto("Tênis", 399.90);
        Produto p2 = new Produto("Camiseta", 59.90);
        Produto p3 = new Produto("Shorts", 159.00);
        Produto p4 = new Produto("Boné", 169.00);
        Produto p5 = new Produto("Blusa", 199.99);
        Produto p6 = new Produto("Calça", 259.00);
        Produto p7 = new Produto("Regata", 89.99);
        Produto p8 = new Produto("Óculos", 250.00);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);

        Predicate<Produto> freteGratis = p -> p.preco >= 200.00;
        Function<Produto, String> aviso = p -> "O valor da sua compra foi de " + p.preco + ". Parabéns, você ganhou frete grátis!";

        // Pipeline de execução:
        produtos.stream()
                .filter(freteGratis)
                .map(aviso)
                .forEach(System.out::println);
    }
}
