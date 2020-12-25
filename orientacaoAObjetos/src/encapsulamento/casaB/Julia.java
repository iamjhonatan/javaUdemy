package encapsulamento.casaB;

import encapsulamento.casaA.Ana;

public class Julia {

    void testeAcessos(){
        Ana sogra = new Ana();

        //System.out.println(sogra.segredo); // privado só é visível dentro da classe
        //System.out.println(sogra.facoDentroDeCasa); // default visivel no pacote
        //System.out.println(sogra.formaDeFalar); // protected é visivel no pacote
        System.out.println(sogra.todosSabem); // public é visivel para todos
    }
}
