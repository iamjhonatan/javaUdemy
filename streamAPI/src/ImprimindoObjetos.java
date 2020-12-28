import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {
        // Iterator é uma interface do java que possui 2 métodos

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        System.out.println("Usando o ForEach: ");
        for(String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("\nUsando o Iterator: ");
        Iterator<String> iterator = aprovados.iterator(); // retornará a implementação de um iterador capaz de percorrer a lista.
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Sequencia de dados: uma caracteristica é que o laço ocorre internamente
        System.out.println("\nUsando o Stream: ");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
}