public class Oculos{

    private String formaArmacao;
    private double grau;
    private boolean protecaoUV;

    public void Oculos(String formaArmacao, double grau, boolean protecaoUV){

        this.formaArmacao = formaArmacao;
        this.grau = grau;
        this.protecaoUV = protecaoUV;
    }

    public void ColocarOculos(){
    
        System.out.println("Óculos colocado com sucesso");
    
    }

    public void TirarOculos(){
        System.out.println("Óculos retirado com sucesso");
    }

    public void TrocarLente(){
    System.out.println("Lente trocado com sucesso");
    }

    public String getFormaArmacao() {
        return formaArmacao;
    }
    public void setFormaArmacao(String formaArmacao) {
        this.formaArmacao = formaArmacao;
    }
    public double getGrau() {
        return grau;
    }
    public void setGrau(double grau) {
        this.grau = grau;
    }
    public boolean isProtecaoUV() {
        return protecaoUV;
    }
    public void setProtecaoUV(boolean protecaoUV) {
        this.protecaoUV = protecaoUV;
    }
    public void status(){
        System.out.println("A forma da armação do cliente é: " + getFormaArmacao());
        System.out.println("O grau do óculos é de: " + getGrau());
        System.out.println("O óculos tem proteção UV?: " + isProtecaoUV() );
    }



}