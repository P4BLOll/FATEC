package Atividade2Java;

public class Bebida {
    private String sabor;
    private double preco;

Bebida(String sabor, double preco){
    this.sabor = sabor;
    this.preco = preco;
}

public double getPreco(){
    return preco;
}

public String getSabor(){
    return sabor;
}

}
