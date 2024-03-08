public class Mouse{

    private String marca;
    private int qtdBotoes;
    private boolean ergonomico;

    public void Mouse(String marca,int qtdBotoes, boolean ergonomico){
        
        this.marca = marca;
        this.qtdBotoes = qtdBotoes;
        this.ergonomico = ergonomico;

    }

    public void Clicar(String c){
        System.out.println("Clicado com o botão " + c + "do  mouse com sucesso");

    }
    public void Arrastar(String b){
        System.out.println("Arrastado para ao lado " + b + " com sucesso");
    }
    public void Scrollar(String a){

        System.out.println("Scrollado para " + a + " com sucesso");

    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getQtdBotoes() {
        return qtdBotoes;
    }
    public void setQtdBotoes(int qtdBotoes) {
        this.qtdBotoes = qtdBotoes;
    }
    public boolean isErgonomico() {
        return ergonomico;
    }
    public void setErgonomico(boolean ergonomico) {
        this.ergonomico = ergonomico;
    }

    public void status(){
    System.out.println("A marca do mouse é: " + getMarca());
    System.out.println("O mouse tem uma quantidade de botões de: " + getQtdBotoes());
    System.out.println("O mouse é ergonômico?: " + isErgonomico());
    }
}