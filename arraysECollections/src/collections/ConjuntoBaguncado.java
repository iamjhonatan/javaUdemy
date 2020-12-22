package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {
        // SET
        // Heterogênio
        // não aceita repetição
        // tipo de coleção
        // Pode ser heterogênio ou homogênio(que é o ideal)
        // Não aceita obj duplicados
        // Pode ser ordenado
        // Não é indexado

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // converte automaticamente para a classe Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("Teste");
        conjunto.add('x');
        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("teste")); // removendo um determinado elemento do conjunto
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains('x')); // verificando se um determinado elemento está dentro do conjunto
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); // União dos 2 conjuntos
        conjunto.retainAll(nums); // Somente o que está nos 2 conjuntos será retido
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
