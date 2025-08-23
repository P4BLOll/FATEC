package com.tap;

import java.util.*;

public class InterfacesComoTipos {
    public static void main(String[] args) {
        // 1) Referência do TIPO INTERFACE apontando para um objeto concreto
        Comparable<Point> p1 = new Point(3, 4);
        int resultado = p1.compareTo(new Point(1, 1));
        System.out.println("Resultado da comparação p1 vs (1,1): " + resultado);

        // 2) Lista de Points e ordenação automática via contrato Comparable
        List<Point> pontos = new ArrayList<>();
        pontos.add(new Point(3, 4));
        pontos.add(new Point(1, 1));
        pontos.add(new Point(0, 5));

        Collections.sort(pontos); // usa compareTo definido em Point
        System.out.println("Ordenados:");
        for (Point p : pontos) System.out.println(p);

        // 3) Passando uma referência do tipo interface para um método
        int r2 = comparar(p1, new Point(0, 5));
        System.out.println("Comparar via método com tipo interface: " + r2);
    }

    // Método que recebe o CONTRATO (Comparable<Point>)
    static int comparar(Comparable<Point> a, Point b) {
        return a.compareTo(b);
    }
}

// Implementação concreta do contrato Comparable<Point>
class Point implements Comparable<Point> {
    private int x, y;

    public Point(int x, int y) { this.x = x; this.y = y; }

    @Override
    public String toString() { return "(" + x + ", " + y + ")"; }

    private double distanceToOrigin() { return Math.sqrt(x * x + y * y); }

    @Override
    public int compareTo(Point other) {
        // Ordena pela distância até a origem (0,0)
        return Double.compare(this.distanceToOrigin(), other.distanceToOrigin());
    }
}

