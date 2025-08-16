package com.tap;

public class FreteAereo implements FreteStrategy{
    public double calcular(double pesoKg, double distanciaKm){
        double taxaFixa = 10.0;
        double porKm = 0.05 * distanciaKm;
        double porKg = 5.0 * pesoKg;
        return taxaFixa + porKm + porKg;
    }
    
    public String nome(){return "Aéreo";}
}
