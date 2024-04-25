package ex1;

public class Cadeira {
    private String marca;
    private String cor;
    private String material;

    public Cadeira(String marca, String cor, String material) {
        this.marca = marca;
        this.cor = cor;
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public String getMaterial() {
        return material;
    }
}
