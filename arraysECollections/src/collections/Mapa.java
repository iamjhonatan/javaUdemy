package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto"); // put adiciona, caso já exista, sobreescreve
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet()); // imprimindo as chaves
        System.out.println(usuarios.values()); // imprimindo os valores
        System.out.println(usuarios.entrySet()); // imprimindo a chave e o valor ao mesmo tempo

        System.out.println(usuarios.containsKey(20)); // verificando um elemento pela chave
        System.out.println(usuarios.containsValue("Rebeca")); // verificando um elemento pelo valor

        System.out.println(usuarios.get(4)); // retorna o elemento da chave passada como parâmetro


        for(int chave: usuarios.keySet()){ // percorrendo os elementos pela chave
            System.out.println(chave);
        }

        for(String valor: usuarios.values()){ // percorrendo os elementos pelo valor
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()){ // percorrendo os elementos pela chave e pelo valor
            System.out.print(registro.getKey() + " => ");
            System.out.println(registro.getValue());
        }
    }
}
