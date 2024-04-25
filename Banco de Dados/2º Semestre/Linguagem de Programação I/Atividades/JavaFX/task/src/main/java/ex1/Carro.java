package ex1;

public class Carro {
    private String cor;
    private int ano;
    private String marca;

    public Carro(String cor, int ano, String marca) {
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }
}
