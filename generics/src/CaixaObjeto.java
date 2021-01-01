public class CaixaObjeto {

    // Exemplo básico SEM generics

    private Object coisa;

    public void guardar(Object coisa){
        this.coisa = coisa;
    }

    public Object abrir(){
        return coisa;
    }
}
