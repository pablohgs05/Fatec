package ex1;

public class Cadeira {
    private int id;
    private String marca;
    private String cor;
    private String material;

    public Cadeira(int id, String marca, String cor, String material) {
        this.id = id;
        this.marca = marca;
        this.cor = cor;
        this.material = material;
    }

    public Cadeira(String marca, String cor, String material) {
        this(-1, marca, cor, material); // Id será definido pelo banco de dados
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
