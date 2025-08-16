package com.tap;

public class FreteTerrestre implements FreteStrategy{
    public double calcular(double pesoKg, double distanciaKm){
        double taxaFixa = 6.0;
        double porKm = 0.02 * distanciaKm;
        double porKg = 2.0 * pesoKg;
        return taxaFixa + porKm + porKg;
    }

    public String nome(){return "Terrestre";}
}