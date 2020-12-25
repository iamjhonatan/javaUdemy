package abstrato;

public abstract class Mamifero extends Animal{

    public abstract String mamar();

    @Override
    public final String mover() { // definindo o método como constante (final), ele não pode ser sobreescrito por suas classes filhas
        return "Saindo do lugar";
    }
}
