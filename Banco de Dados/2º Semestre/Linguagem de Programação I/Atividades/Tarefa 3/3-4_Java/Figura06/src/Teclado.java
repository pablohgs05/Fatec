public class Teclado{

    private String tipo;
    private boolean rgb;
    private String marca;

    public void Teclado(String tipo, boolean rgb, String marca){
        this.tipo = tipo;
        this.rgb = rgb;
        this.marca = marca;
    }

    public void Digitar(){
        System.out.println("Você está digitando");
    }
    public void Limpar(){
        System.out.println("Teclado limpo");
    }
    public void LigarRGB(){

        System.out.println("RGB ligado");

    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public boolean isRgb() {
        return rgb;
    }
    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    public void status(){
        System.out.println("O tipo do teclado é: " + getTipo());
        System.out.println("O RGB está ligado?: " + isRgb());
        System.out.println("A marca do teclado é: " + getMarca());
    }
}