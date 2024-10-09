package edu.fatec.lp2.exercicio1;

public class Main {
    public static void main(String[] args) {
        //criando instância do Whatsapp
        Whatsapp whatsapp = new Whatsapp();

        //criando alguns contatos
        Contatinho cont1 = new Contatinho("João", "1234-5678");
        Contatinho cont2 = new Contatinho("Maria", "8765-4321");


        whatsapp.adicionarContato(cont1);
        whatsapp.adicionarContato(cont2);


        System.out.println("Contatos:");
        whatsapp.listarContatos();


        MsgTexto msgTexto = new MsgTexto(cont1, "10:00", "Oi, tudo bem?", 10);
        MsgAudio msgAudio = new MsgAudio(cont2, "10:05", "Mensagem de áudio", 30);
        MsgFoto msgFoto = new MsgFoto(cont1, "10:10", "Foto de viagem", 2048);


        whatsapp.adicionarMensagem(msgTexto.sendMessage("Oi, tudo bem?"));
        whatsapp.adicionarMensagem(msgAudio.sendMessage("Mensagem de áudio"));
        whatsapp.adicionarMensagem(msgFoto.sendMessage("Foto de viagem"));

        System.out.println("\nMensagens:");
        whatsapp.listarMensagens();
    }
}
