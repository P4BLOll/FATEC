package com.tap;

public class CalculadoraFrete {
    private FreteStrategy strategy;

    public CalculadoraFrete(FreteStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(FreteStrategy strategy){
        this.strategy = strategy;
    }

    public double calcular(double pesoKg, double distanciaKm){
        if(strategy == null){
            throw new IllegalStateException("Defina uma estratégia antes de calcular.");
        }

        return strategy.calcular(pesoKg, distanciaKm);
    }
}
