package com.tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.tap.Interfaces.Importante;
import com.tap.Interfaces.ItemVenda;

public class Main {
    public static void main(String[] args) {
        List<ItemVenda> catalogo = new ArrayList<>();

        Produto p1 = new Produto("Notebook", 3000.00);
        Produto p2 = new Produto("Livro Java", 120.00);
        Produto p3 = new Produto("Smartphone", 2500.00);

        p1.aplicarDesconto(10);

        Servico s1 = new Servico("Instalação de Software", 100.00, 2);
        Servico s2 = new Servico("Consultoria Técnica", 200.00, 3);

        catalogo.add(p1);
        catalogo.add(p2);
        catalogo.add(p3);
        catalogo.add(s1);
        catalogo.add(s2);

        System.out.println("### Catálogo Completo:");
        for (ItemVenda item : catalogo) {
            System.out.println(item.toString());
        }

        System.out.println("\n### Apenas Produtos (ordenados por preço):");
        List<Produto> produtos = new ArrayList<>();
        for (ItemVenda item : catalogo) {
            if (item instanceof Produto) {
                produtos.add((Produto) item);
            }
        }

        Collections.sort(produtos);
        for (Produto p : produtos) {
            System.out.println(p);
        }

        System.out.println("\n### Itens Marcados como Importantes:");
        for (ItemVenda item : catalogo) {
            if (item instanceof Importante) {
                System.out.println(item.toString());
            }
        }
    }
}
