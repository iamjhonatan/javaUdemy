import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

    public static void main(String[] args) {
        // Interface que não recebe parâmetro e retorna algo

        Supplier<List<String>> umLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println(umLista.get());
    }
}
