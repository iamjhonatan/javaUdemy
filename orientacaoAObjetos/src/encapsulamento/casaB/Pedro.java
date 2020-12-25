package encapsulamento.casaB;

import encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos(){

        // Ana mae = new Ana(); acessando diante de uma instancia, ocorre o erro
        // não há necessidade de criar um objeto, logo pode ser acessado diretamente

        //System.out.println(mae.segredo); // privado só é visível dentro da classe
        //System.out.println(mae.facoDentroDeCasa); // default visivel no pacote
        System.out.println(formaDeFalar); // protected é visivel no pacote (transmitidos por heranca)
        System.out.println(todosSabem); // public é visivel para todos
    }
}
