public class Carro{

    private String marca;
    private int cv;
    private String cor;
    private boolean ligarCar;

    public void Carro(String marca, int cv, String 
     cor, boolean ligarCar){
        this.marca = marca;
        this.cv = cv;
        this.cor = cor;
        this.ligarCar = ligarCar;
     }
     
     public void TrocarMarcha(){
        if (ligarCar) {

            System.out.println("Marcha trocada");
            
        }else{
            System.out.println("não é possível , pois o carro está desligado");
        }
        
     }
     public void Acelerar(){
        if(ligarCar){
            System.out.println("Carro acelerando");
        }else{
            System.out.println("Impossível, pois o carro está desligado");
        }
     }
     public void Drift(){
        if (ligarCar) {
            System.out.println("Drift feito");
        }else{
            System.out.println("o carro está desligado");
        }
     }

     public String getMarca() {
         return marca;
     }
     public void setMarca(String marca) {
         this.marca = marca;
     }
     public int getCv() {
         return cv;
     }
     public void setCv(int cv) {
         this.cv = cv;
     }
     public String getCor() {
         return cor;
     }
     public void setCor(String cor) {
         this.cor = cor;
     }
     public boolean isLigarCar() {
         return ligarCar;
     }
     public void setLigarCar(boolean ligarCar) {
         this.ligarCar = ligarCar;
     }

     public void status(){
        System.out.println("A marca do carro é: " + getMarca());
        System.out.println("O carro tem " + getCv() + " Cavalos");
        System.out.println("A cor do carro é: " + getCor());
        System.out.println("O carro está ligado: " + isLigarCar());
     }


}