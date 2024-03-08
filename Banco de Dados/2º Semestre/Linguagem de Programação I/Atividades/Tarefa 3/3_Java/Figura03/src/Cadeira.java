public class Cadeira {

    private String material;
    private String tipo;
    private boolean ergonomico;

    public void AjustarCad(){
        System.out.println("Cadeira ajustada");
    }
    public void Sentar(){
        System.out.println("Sentado com sucesso");
    }
    public void GirarCadeira(){
        
        System.out.println("Girando a cadeira");
    }

    public void Cadeira(String material, String tipo, boolean ergonomico){

        this.material = material;
        this.tipo = tipo;
        this.ergonomico = ergonomico;

    }

    public void status(){
        System.out.println("O material da cadeira é: " + getMaterial());
        System.out.println("O tipo da cadeira é: " + getTipo());
        System.out.println("A cadeira é ergonômico? " + isErgonomico());

    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public boolean isErgonomico() {
        return ergonomico;
    }
    public void setErgonomico(boolean ergonomico) {
        this.ergonomico = ergonomico;
    }
    
}
