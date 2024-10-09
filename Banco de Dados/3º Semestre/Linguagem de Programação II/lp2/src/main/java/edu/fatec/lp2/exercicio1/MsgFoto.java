package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.Contatinho;

public class MsgFoto extends Mensagem {
    private int tamanho;

    public MsgFoto(Contatinho destinatario, String horaEnvio, String conteudo, int tamanho) {
        super(destinatario, horaEnvio, conteudo);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        return new MsgFoto(getDestinatario(), getHoraEnvio(), conteudo, this.tamanho);
    }
}
