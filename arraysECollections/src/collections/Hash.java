package collections;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {
        // caso o hashCode falhe, o retorno será false, mesmo com o equals implementado

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Guilherme"));

        boolean resultado = usuarios.contains(new Usuario("Guilherme"));
        System.out.println(resultado);

    }
}
