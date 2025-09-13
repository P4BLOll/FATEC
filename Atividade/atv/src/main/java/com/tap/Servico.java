package src.main.java.com.tap;

import com.tap.Interfaces.Importante;
import com.tap.Interfaces.ItemVenda;

public class Servico implements ItemVenda, Importante {
    private String descricao;
    private double valorHora;
    private int horas;

    public Servico(String descricao, double valorHora, int horas) {
        this.descricao = descricao;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    @Override
    public double getPreco() {
        return valorHora * horas;
    }

    @Override
    public String getDescricao() {
        return "Serviço: " + descricao;
    }

    @Override
    public String toString() {
        return getDescricao() + " - R$" + String.format("%.2f", getPreco());
    }
}

