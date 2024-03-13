public class Mochila{

    private String tipo;
    private float volume;
    private String material;
    private boolean full;

    public void Mochila(String tipo, float volume, String 
     material, boolean full){
        this.tipo = tipo;
        this.volume = volume;
        this.material = material;
        this.full = full;
     }
     
     public void ColocarObjeto(){
        if (full) {

            System.out.println("A mochila já está cheia.");
            
        }else{
            System.out.println("Objeto colocado com sucesso.");
        }
        
     }
     public void Usar(){
        System.out.println("Usando mochila");
     }
     public void AbrirZiper(){
        System.out.println("Ziper aberto.");
     }

     public String gettipo() {
         return tipo;
     }
     public void settipo(String tipo) {
         this.tipo = tipo;
     }
     public float getvolume() {
         return volume;
     }
     public void setvolume(float volume) {
         this.volume = volume;
     }
     public String getmaterial() {
         return material;
     }
     public void setmaterial(String material) {
         this.material = material;
     }
     public boolean isfull() {
         return full;
     }
     public void setfull(boolean full) {
         this.full = full;
     }

     public void status(){
        System.out.println("O tipo da mochila é: " + gettipo());
        System.out.println("A mochila tem " + getvolume() + " L");
        System.out.println("A material da mochila é: " + getmaterial());
        System.out.println("A mochila está cheia: " + isfull());
     }


}