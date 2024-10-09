package edu.fatec.lp2.exercicio2;

public class ListaCompra implements Calculavel {
    private ItemCompra[] itensCompra;
    private int qtdeMax;
    private int index = 0; // Controla quantos itens foram adicionados

    public ListaCompra(int qtdeMax) {
        this.qtdeMax = qtdeMax;
        this.itensCompra = new ItemCompra[qtdeMax];
    }

    public void incluir(ItemCompra item) {
        if (index < qtdeMax) {
            itensCompra[index] = item;
            index++;
        } else {
            System.out.println("Lista de compras cheia!");
        }
    }

    @Override
    public double calcularPreco() {
        double total = 0;
        for (int i = 0; i < index; i++) {
            total += itensCompra[i].calcularPreco();
        }
        return total;
    }

    // Getters e setters
    // Gerar via Lombok ou pela IDE
}
