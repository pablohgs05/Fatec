package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.Contatinho;

public class MsgAudio extends Mensagem {
    private int duracao;

    public MsgAudio(Contatinho destinatario, String horaEnvio, String conteudo, int duracao) {
        super(destinatario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        return new MsgAudio(getDestinatario(), getHoraEnvio(), conteudo, this.duracao);
    }
}
