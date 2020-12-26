public class CalculoTeste2 {

    public static void main(String[] args) {
        // função lambda sem nome
        // Calculo é a interface
        // calc é o nome da variável
        // o retorno será atribuído à essa variável

        Calculo calc = (x ,y) -> {
          return x + y;
        };
        System.out.println(calc.executar(2, 3));

        calc = (x, y) -> x * y; // quando as chaves não são explícitas, o Java assume que haverá apenas uma expressão e será retornado
        System.out.println(calc.executar(2, 3));

        System.out.println(calc.legal());
        System.out.println(Calculo.muitoLegal());
    }
}
