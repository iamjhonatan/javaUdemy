package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {
        // SET
        // HOMOGÊNIO

        // Set<String> listaAprovados = new HashSet<>(); sem critério para inserção e print
        SortedSet<String> listaAprovados = new TreeSet<>(); // Ordenado pela entrada dos dados/ conjunto ordenado
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for(String candidato: listaAprovados){
            System.out.println(candidato);

        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for(int n: nums){
            System.out.println(n);
        }
    }
}
