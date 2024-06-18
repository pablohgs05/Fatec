package ex1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Cadeira {
    private StringProperty marca;
    private StringProperty cor;
    private StringProperty material;

    public Cadeira(String marca, String cor, String material) {
        this.marca = new SimpleStringProperty(marca);
        this.cor = new SimpleStringProperty(cor);
        this.material = new SimpleStringProperty(material);
    }

    public String getMarca() {
        return marca.get();
    }

    public void setMarca(String marca) {
        this.marca.set(marca);
    }

    public StringProperty marcaProperty() {
        return marca;
    }

    public String getCor() {
        return cor.get();
    }

    public void setCor(String cor) {
        this.cor.set(cor);
    }

    public StringProperty corProperty() {
        return cor;
    }

    public String getMaterial() {
        return material.get();
    }

    public void setMaterial(String material) {
        this.material.set(material);
    }

    public StringProperty materialProperty() {
        return material;
    }
}
