import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {
        // NÃO É PERMITIDO: int -> Double
        // double -> Double

        BinaryOperator<Double> calc = (x , y) -> { // API do Java: é uma operação que recebe dois operandos do mesmo tipo e retorna um valor do mesmo tipo
            return x + y;
        };
        System.out.println(calc.apply(2.0, 3.0));

        calc = (x, y) -> x * y; // quando as chaves '{}' não são explícitas, o Java assume que haverá apenas uma expressão e será retornado
        System.out.println(calc.apply(2.0, 3.0));



        BinaryOperator<Integer> calc2 = (x , y) -> { // API do Java: é uma operação que recebe dois operandos do mesmo tipo e retorna um valor do mesmo tipo
            return x + y;
        };
        System.out.println(calc2.apply(2, 3));


        calc2 = (x, y) -> x * y; // quando as chaves '{}' não são explícitas, o Java assume que haverá apenas uma expressão e será retornado
        System.out.println(calc2.apply(2, 3));
    }
}
