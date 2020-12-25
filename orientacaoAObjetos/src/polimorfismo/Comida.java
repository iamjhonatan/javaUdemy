package polimorfismo;

public abstract class Comida {
    // Classe abstrata não pode ser instanciada
    // Classes abstratas são ideais para serem as Superclasses

    private double peso;

    public Comida(double peso){
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0){
            this.peso = peso;
        }
    }
}
