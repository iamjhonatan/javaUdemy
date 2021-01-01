public class Caixa<T> {

    // Exemplo usando generics

    private T coisa;

    public void guardar(T coisa){
        this.coisa = coisa;
    }

    public T abrir(){
        return coisa;
    }
}
