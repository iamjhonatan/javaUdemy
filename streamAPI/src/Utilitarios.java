import java.util.function.UnaryOperator;

public class Utilitarios {

    private Utilitarios(){
        // criando um construtor privado para que a classe não seja instanciada, visto que os métodos são estáticos, logo não há necessidade
    }

    public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + ""; // caractere concatenado com uma string vazia gera uma saída String

    public final static String grito (String n) {
        return n + "!!";
    }
}
