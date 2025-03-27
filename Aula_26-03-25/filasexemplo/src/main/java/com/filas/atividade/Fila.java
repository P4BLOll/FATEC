package com.filas.atividade;

public class Fila {

    private Object[] objetos = new Object[10];
    public int totalDeObjetos = 0;
    private int primeiro = 0;
    private int ultimo = 0;

    public void enfileira(Object objeto) {
        if (totalDeObjetos == objetos.length) {

            for (int i = 0; i < totalDeObjetos - 1; i++) {
                objetos[i] = objetos[i + 1];
            }

            ultimo = totalDeObjetos - 1;
            objetos[ultimo] = objeto;

        } else {

            objetos[ultimo] = objeto;
            ultimo = (ultimo + 1) % objetos.length;  

         }

        totalDeObjetos++;

    }

    public void desenfileira() {

        if (totalDeObjetos > 0) {
            System.out.println("Item removido: "  + objetos[primeiro]);
            primeiro = (primeiro + 1) % objetos.length; 
            totalDeObjetos--;

        } else {
            System.out.println("A fila está vazia.");
        }
    }

    public Object primeiro() {
        if (totalDeObjetos == 0) {
            System.out.println("A fila está vazia.");
            return null;
        }
        return objetos[primeiro];
    }

    public Object ultimo() {
        if (totalDeObjetos > 0) {
            return objetos[((ultimo - 1) + objetos.length) % objetos.length];
        } else {
            System.out.println("A fila está vazia.");
            return null;
        }
    }

    public int tamanho() {
        return totalDeObjetos;
    }

    public boolean vazia() {
        return totalDeObjetos == 0;
    }

    public static void main(String[] args) {
        Fila fila = new Fila();

        System.out.println("Fila vazia: " + fila.vazia());
        System.out.println("Tamanho da fila: " + fila.tamanho());

        fila.enfileira("Pablo");
        fila.enfileira("Sousa");
        fila.enfileira("Santos");
        fila.enfileira("Pedro");
        fila.enfileira("Henrique");

        System.out.println("Primeiro elemento da fila: " + fila.primeiro());
        System.out.println("Último elemento da fila: " + fila.ultimo());

        fila.desenfileira();
        fila.desenfileira();

        System.out.println("Primeiro elemento da fila: " + fila.primeiro());
        System.out.println("Último elemento da fila: " + fila.ultimo());

        System.out.println("Tamanho da fila: " + fila.tamanho());

        fila.enfileira("João");
        fila.enfileira("Juca");

        System.out.println("Primeiro elemento da fila: " + fila.primeiro());
        System.out.println("Último elemento da fila: " + fila.ultimo());

        System.out.println("Tamanho da fila: " + fila.tamanho());



    }

}