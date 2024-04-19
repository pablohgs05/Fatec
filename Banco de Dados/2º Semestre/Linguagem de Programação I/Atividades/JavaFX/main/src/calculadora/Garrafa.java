public class Garrafa {
    private double volume;
    private String material;
    private String conteudo;

    public Garrafa(double volume, String material, String conteudo) {
        this.volume = volume;
        this.material = material;
        this.conteudo = conteudo;
    }

    //Getters e setters
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    //Método personalizado para calcular o volume em litros
    public double calcularVolumeEmLitros() {
        return volume / 1000; // Assumindo que o volume está em mililitros
    }
}