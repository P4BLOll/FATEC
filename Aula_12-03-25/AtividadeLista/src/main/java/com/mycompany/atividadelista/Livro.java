/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadelista;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Livro {
    private String nome;
    private int ano;
    private double preco;
    private Livro anterior;

    /**
     * @return the nome
     */
    
    public Livro(String nome, int ano, double preco){
        this.nome = nome;
        this.ano = ano;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the anterior
     */
    public Livro getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Livro anterior) {
        this.anterior = anterior;
    }
}


