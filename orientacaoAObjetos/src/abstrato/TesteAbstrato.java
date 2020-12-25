package abstrato;

public class TesteAbstrato {
    // unica classe que pode ser instanciada é a de Cachorro, por ser uma classe concreta.
    // as outras classes são abstratas e possuem métodos abstratos, logo, por cachorro herdar dessas classes
    // é a classe que deve implementar os métodos abstratos e a única que pode ser instanciada.

    public static void main(String[] args) {
        Mamifero a = new Cachorro();
        System.out.println(a.mover());
        System.out.println(a.mamar());
        System.out.println(a.respirar());
    }
}
