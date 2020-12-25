package composicao.desafio;


public class Item {

    final Produto produto; // Um item tem um único produto
    final int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
