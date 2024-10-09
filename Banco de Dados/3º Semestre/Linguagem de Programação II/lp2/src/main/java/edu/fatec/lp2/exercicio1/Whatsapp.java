package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.Mensagem;

import java.util.ArrayList;

public class Whatsapp {
    private ArrayList<Contatinho> contatos;
    private ArrayList<Mensagem> mensagens;

    public Whatsapp() {
        this.contatos = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    public void adicionarContato(Contatinho contatinho) {
        contatos.add(contatinho);
    }

    public void adicionarMensagem(Mensagem mensagem) {
        mensagens.add(mensagem);
    }

    public void listarContatos() {
        for (Contatinho c : contatos) {
            System.out.println(c);
        }
    }

    public void listarMensagens() {
        for (Mensagem m : mensagens) {
            System.out.println(m);
        }
    }
}
