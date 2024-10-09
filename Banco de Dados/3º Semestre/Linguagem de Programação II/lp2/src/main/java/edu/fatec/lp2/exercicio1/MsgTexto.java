package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.Contatinho;

public class MsgTexto extends Mensagem {
    private int numChar;

    public MsgTexto(Contatinho destinatario, String horaEnvio, String conteudo, int numChar) {
        super(destinatario, horaEnvio, conteudo);
        this.numChar = numChar;
    }

    public int getNumChar() {
        return numChar;
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        this.numChar = conteudo.length();
        return new MsgTexto(getDestinatario(), getHoraEnvio(), conteudo, this.numChar);
    }
}
