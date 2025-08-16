package com.tap;

import java.text.NumberFormat;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        double pesoKg = 12.5;
        double distancia = 850;

        NumberFormat moeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        CalculadoraFrete calc = new CalculadoraFrete(new FreteTerrestre());
        double custoTerrestre = calc.calcular(pesoKg, distancia);
        System.out.println("Estratégia: Terrestre | Custo = " + moeda.format(custoTerrestre));

        calc.setStrategy(new FreteAereo());
        double custoAereo = calc.calcular(pesoKg, distancia);
        System.out.println("Estratégia: Aéreo | Custo = " + moeda.format(custoAereo));

        calc.setStrategy(new FreteAereo());
        double custoMarítimo = calc.calcular(pesoKg, distancia);
        System.out.println("Estratégia: Marítimo | Custo = " + moeda.format(custoMarítimo));
    }
}
