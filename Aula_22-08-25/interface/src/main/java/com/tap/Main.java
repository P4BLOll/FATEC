package com.tap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Point> pontos = new ArrayList<>();

        pontos.add(new Point(3, 4));
        pontos.add(new Point(1, 1));
        pontos.add(new Point(0, 5));

        Collections.sort(pontos);

        for(Point p : pontos) {
            System.out.println(p);
        }
    }
}