import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Como o generics não está sendo usado, sempre há a necessidade de fazer as conversões
        String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs); // O retorno seria um Object. Fazendo um CAST para ser String
        System.out.println(ultimaLinguagem1);

        Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero1);


        // O retorno do método, com o tipo genérico 'T', será do mesmo tipo que foi definido nas variáveis.
        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLinguagem2);

        Integer ultimoNumero2 = ListaUtil.getUltimo2(nums);
        System.out.println(ultimoNumero2);
    }
}
