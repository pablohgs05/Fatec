package edu.fatec.lp2.exercicio2;

public class ItemCompra implements Calculavel {
    private int quantidade;
    private Produto produto;
    private double desconto;

    public ItemCompra(Produto produto, double desconto) {
        this.produto = produto;
        this.desconto = desconto;
        this.quantidade = 1; // Quantidade padrão
    }

    @Override
    public double calcularPreco() {
        double precoFinal = produto.getPreco() * quantidade * (1 - desconto / 100);
        return precoFinal;
    }

}
