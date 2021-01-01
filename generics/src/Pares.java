import java.util.*;

public class Pares <C extends Number, V>{ // a Chave deve ser do tipo Number (Double, Float, Integer...)

    private final Set<Par<C, V>> itens = new LinkedHashSet<>(); // Ordenando conforme a entrada dos dados / 'Set' não aceita repetição

    public void adicionar(C chave, V valor){
        if(chave == null) return; // saindo do método

        Par <C, V> novoPar = new Par<C, V>(chave, valor);

        if(itens.contains(novoPar)){ // se o objeto com essa chave estiver contido na lista, ele remove e no final adiciona o novo par.
            itens.remove(novoPar);
        }
        itens.add(novoPar);
    }

    public V getValor(C chave){
        if (chave == null) return null;

        Optional<Par<C, V>> parOpcional = itens.stream()
                .filter(par -> chave.equals(par.getChave())) // esse predicato está comparando as chaves; filtrando apenas os pares com a mesma chave passada.
                .findFirst();

        return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
    }
}
