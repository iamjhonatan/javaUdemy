package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
        // FILA (First int, first out

        Queue<String> fila = new LinkedList<>();

        // Offer e add -> adicionam elementos na fila
        // A diferença é o comportamento quando a fila ESTÁ CHEIA!
        fila.add("Ana"); // tamanho pré-definido, gerará um erro
        fila.offer("Bia"); // caso não consiga adicionar, retorna false
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        System.out.println(fila.peek()); // retorna o próximo elemento da fila (sem remover)
        System.out.println(fila.peek()); // caso a fila esteja vazia, retorna NULL
        System.out.println(fila.element()); // retorna o próximo elemento da fila / caso a fila esteja vazia, retorna um erro

        System.out.println(fila.poll()); // obtém o próximo elemento da fila e REMOVE. / fila vazia = NULL
        System.out.println(fila.remove()); // obtém o próximo elemento da fila e REMOVE. fila vazia, retorna um ERRO (exceção).

        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        //fila.contains(...);  pra saber se um determinado objeto está na fila
    }
}
