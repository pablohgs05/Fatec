public class Celular{

    private String marca;
    private int armazenamento;
    private String cor;
    private boolean ligarCel;

    public void Celular(String marca, int armazenamento, String 
     cor, boolean ligarCel){
        this.marca = marca;
        this.armazenamento = armazenamento;
        this.cor = cor;
        this.ligarCel = ligarCel;
     }
     
     public void TirarFoto(){
        if (ligarCel) {

            System.out.println("Foto tirada.");
            
        }else{
            System.out.println("Impossível tirar fotos com o celular desligado.");
        }
        
     }
     public void Carregar(){
        if(ligarCel){
            System.out.println("O celular precisa estar desligado para carregar.");
        }else{
            System.out.println("Celular carregando...");
        }
     }
     public void Video(){
        if (ligarCel) {
            System.out.println("Video gravado.");
        }else{
            System.out.println("Incapaz de gravar videos.");
        }
     }

     public String getMarca() {
         return marca;
     }
     public void setMarca(String marca) {
         this.marca = marca;
     }
     public int getarmazenamento() {
         return armazenamento;
     }
     public void setarmazenamento(int armazenamento) {
         this.armazenamento = armazenamento;
     }
     public String getCor() {
         return cor;
     }
     public void setCor(String cor) {
         this.cor = cor;
     }
     public boolean isligarCel() {
         return ligarCel;
     }
     public void setligarCel(boolean ligarCel) {
         this.ligarCel = ligarCel;
     }

     public void status(){
        System.out.println("A marca do celular é: " + getMarca());
        System.out.println("O celular tem " + getarmazenamento() + " GB");
        System.out.println("A cor do celular é: " + getCor());
        System.out.println("O celular está ligado: " + isligarCel());
     }


}