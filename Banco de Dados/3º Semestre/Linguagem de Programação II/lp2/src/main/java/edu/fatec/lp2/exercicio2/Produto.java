package edu.fatec.lp2.exercicio2;

public class Produto {
    private String nome;
    private String unidade;
    private String descricao;
    private double preco;
    private double descontoMaximo;
    private Supermercado supermercado;

    public Produto(String nome, Supermercado supermercado) {
        this.nome = nome;
        this.supermercado = supermercado;
    }

    public String toString() {
        return nome;
    }

    // Getters e setters
    // Gerar via Lombok ou pela IDE
}
