public class Caneta {

    private boolean tampa;
    private String cor;
    private boolean tinta;

    
    public void Caneta(boolean tampa, String cor, boolean tinta){
        this.tampa = tampa;
        this.cor = cor;
        this.tinta = tinta;
    }
    
    
    
    public void Desenhar(){
        if(tampa){
            System.out.println("Desenhando");

        }
        else{
            System.out.println("Não é possível desenhar, pois está tampado");
        }
        
    }



    public void Rabiscar(){
        if(tampa){
            System.out.println("Rabiscando");
        }else{
            System.out.println("Não é possível rabiscar, pois a caneta está tampada");
        }
    }

    public void Escrever(){

        if(tampa){
            System.out.println("Escrevendo");
        }
        else{
            System.out.println("Não é possível escrever, pois está tampada");
        }



    }

    public boolean getTampa(){
        return tampa;
    }

    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTinta() {
        return tinta;
    }

    public void setTinta(boolean tinta) {
        this.tinta = tinta;
    }

    public void status(){
        System.out.println("A cor da caneta é: " + getCor());
        System.out.println("A caneta está ou não está tampada: " + getTampa());
        System.out.println("A caneta está ou não está com tinta: " + isTinta());
    }
}
