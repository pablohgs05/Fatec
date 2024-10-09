package edu.fatec.lp2.exercicio1;

public abstract class Mensagem {
    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    public Mensagem(Contatinho destinatario, String horaEnvio, String conteudo) {
        this.destinatario = destinatario;
        this.horaEnvio = horaEnvio;
        this.conteudo = conteudo;
    }

    public Contatinho getDestinatario() {
        return destinatario;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public String getConteudo() {
        return conteudo;
    }

    public abstract Mensagem sendMessage(String mensagem);

    @Override
    public String toString() {
        return "Mensagem para " + destinatario.getNome() + " às " + horaEnvio + ": " + conteudo;
    }
}
