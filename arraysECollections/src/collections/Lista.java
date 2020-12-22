package collections;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        // LISTA
        // Pode ser heterogênio =/
        // Pode ser homogênio (ideal)
        // Aceita objs duplicados
        // É ordenado e indexado

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3)); // acessando o elemento pelo índice

        System.out.println(">>> " + lista.remove(1)); // recebe o índice dentro da lista e retorna o usuário
        System.out.println(lista.remove(new Usuario("Manu"))); // recebe um objeto e retorn True or False

        System.out.println("Tem? " + lista.contains(new Usuario("Lia"))); // false, pq a comparação é com tipo primitivo e o HashCode e Equals foram desabilitados
        System.out.println("Tem? " + lista.contains(u1)); // true, pq a comparação é de objetos e o objeto 'u1' tem um endereço de memória

        for(Usuario u: lista){
            System.out.println(u.nome);
        }
    }
}
