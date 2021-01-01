import java.util.List;

public class ListaUtil {

    public static Object getUltimo1(List<?> lista){ // '?' deixa explícito que a lista é de qualquer coisa
        return lista.get(lista.size() - 1);
    }

    // Recebendo uma lista do tipo T, o retorno será o que foi passado, não sendo necessário fazer o CAST
    public static <T> T getUltimo2(List<T> lista){
        return lista.get(lista.size() - 1);
    }
}
