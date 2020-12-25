package composicao.desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Maria");

        Compra cp1 = new Compra();
        cp1.adicionarItem("Caneta", 9.67, 100);
        cp1.adicionarItem(new Produto("Notebook", 1897.88), 2);

        Compra cp2 = new Compra();
        cp2.adicionarItem("Caderno", 10, 10);
        cp2.adicionarItem(new Produto("Impressora", 998.90), 1);

        c1.adicionarCompra(cp1);
        c1.adicionarCompra(cp2);

        System.out.println(c1.obterValorTotal());
    }
}
