package encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos(){
        //System.out.println(esposa.segredo); // privado só é visível dentro da classe
        System.out.println(esposa.facoDentroDeCasa); // default visivel no pacote
        System.out.println(esposa.formaDeFalar); // protected é visivel no pacote
        System.out.println(esposa.todosSabem); // public é visivel para todos
    }
}
