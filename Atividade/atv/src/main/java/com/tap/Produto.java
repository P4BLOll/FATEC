package com.tap;

import com.tap.Interfaces.Importante;
import com.tap.Interfaces.Promocional;

public class Produto implements Promocional, Comparable<Produto>, Importante {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Produto: " + nome;
    }

    @Override
    public double aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);
        return preco;
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.getPreco());
    }

    @Override
    public String toString() {
        return getDescricao() + " - R$" + String.format("%.2f", preco);
    }
}
