import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {
        // Como Predicate é uma interface funcional, eu posso usar a funcao lambda

        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;  // Predicado recebe um único parâmetro e retorna True or False

        Produto produto = new Produto("Notebook", 3893.89, 0.15);
        System.out.println(isCaro.test(produto));
    }
}
