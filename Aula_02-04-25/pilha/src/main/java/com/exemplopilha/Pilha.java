package com.exemplopilha;


public class Pilha {
    int inicio;
    int topo = -1;
    int tamanho;
    int qtdElementos = 0;
    int p[];

    public Pilha(){
        inicio = topo = -1;
        tamanho = 10;
        p = new int[tamanho];
        qtdElementos = 0;

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

    public void push(int e){
        if(!estaCheia()){
            if(inicio == -1){
                inicio = 0;
            }
            topo++;
            p[topo] = e;
            qtdElementos++;
        }
    }

    public int pop(){
        int x = 0;
        if(!estaVazia()){
            x = p[topo];
            topo--;
            qtdElementos--;
        }
            return x;
    }

    public void mostrar(){
        String elementos = "";
        for(int i = topo; i >=0; i--){
            elementos += p[i] + " - ";
        }

        System.out.println(elementos);
    }

    public static void main(String[] args) {
        Pilha p = new Pilha();
    
        System.out.println("Fila vazia: " + p.estaVazia());
        System.out.println("Tamanho da fila: " + p.tamanho);
    
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(5);
    
        p.mostrar();
    
        System.out.println("Objeto removido: " + p.pop());
        System.out.println("Objeto removido: " + p.pop());

        p.mostrar();
    }
}