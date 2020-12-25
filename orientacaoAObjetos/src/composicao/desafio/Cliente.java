package composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;
    final List<Compra> compras = new ArrayList<>(); // O cliente tem muitas compras

    Cliente(String nome){
        this.nome = nome;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }

    double obterValorTotal(){ // obtendo um valor total de todas as compras que o cliente fez
        double total = 0;

        for (Compra compra: compras){
            total += compra.obterValorTotal();
        }
        return total;
    }
}
