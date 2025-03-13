/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadelista;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Lista {
    private Livro cabeca;
    private Livro Anterior;

    /**
     * @return the cabeca
     */
    public Livro getCabeca() {
        return cabeca;
    }
    
    
    
    public void adiciona(Livro livro){
        if (cabeca == null) {
            cabeca = livro;
        } else {
            livro.setAnterior(cabeca);
        }

    }
    public void remove(){
        if (cabeca != null) {
            cabeca = cabeca.getAnterior();
            Anterior = cabeca;
        }
    
    }
    
    public void listarLivros(){
        Livro atual = cabeca;
        while (atual != null) {
            System.out.println("Livro: " + atual.getNome() + ", Ano: " + atual.getAno() + ", Preço: " + atual.getPreco());
            atual = atual.getAnterior();
        }
    }
    
}


