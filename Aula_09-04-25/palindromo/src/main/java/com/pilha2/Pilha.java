package com.pilha2;

import java.util.Scanner;

public class Pilha {
    int topo = -1;
    int tamanho;
    int qtdElementos = 0; 
    char[] pilha;

    public Pilha() {
        topo = -1;
        tamanho = 10;  
        pilha = new char[tamanho];
    }

    public boolean estaVazia(){
        if(qtdElementos == 0){
            return true;
        }

        return false;
    }

    public boolean estaCheia(){
        if(qtdElementos == tamanho){
            return true;
        }

        return false;
    }

    public void push(int e) {
            if (!estaCheia()) {
                pilha[++topo] = (char) e;
            qtdElementos++;
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    public int pop(){
        int x = 0;
        if(!estaVazia()){
            x = pilha[topo];
            topo--;
            qtdElementos--;
        }
            return x;
    }


    public boolean comparaPalindromo(String palavra) {
        Pilha p1 = new Pilha();
        Pilha pAux = new Pilha();
        Pilha p2 = new Pilha();

        for (int i = 0; i < palavra.length(); i++) {
            p1.push(palavra.charAt(i));

            pAux.push(palavra.charAt(i));
        }

        for (int i = 0; i < palavra.length(); i++) {
            p2.push(pAux.pop());  
        }

        for (int i = 0; i < qtdElementos; i++) {
            if (p1 != p2[i]) {
            }
        }
        return true;
    }

    public void mostrar(){
        String elementos = "";
        for(int i = topo; i >=0; i--){
            elementos += pilha[i] + " - ";
        }

        System.out.println(elementos);
    }

    public static void main(String[] args) {
        Pilha p = new Pilha();
        System.out.println("Digite a Palavra");
        Scanner sc1 = new Scanner(System.in);

        String palavra = sc1.nextLine();

        System.out.println("Palavra é palindromo: " + p.comparaPalindromo(palavra));
    }
}
