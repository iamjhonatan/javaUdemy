package composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>(); // Uma compra tem uma lista de itens

    void adicionarItem(Produto p, int qtde){
        this.itens.add(new Item(p, qtde)); // Já criando um item, passando o produto e a qtde nos parâmetros
    }

    void adicionarItem(String nome, double preco, int qtde){
        var produto = new Produto(nome, preco); // instanciando um produto
        this.itens.add(new Item(produto, qtde)); // passando o produto como parâmetro para criar um item
    }

    double obterValorTotal(){
        double total = 0;

        for(Item item: itens){
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
