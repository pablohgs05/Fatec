import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        //Entradas de início e fim
        System.out.println("\nDigite a hora de início do jogo: ");
        int inicio = abc.nextInt();
        System.out.println("Digite a hora de fim do jogo: ");
        int fim = abc.nextInt();

        //Calculo
        int duracao;
        if (inicio < fim) {
            duracao = fim - inicio;
        } else {
            //Se o jogo iniciou em um dia e terminou no outro
            duracao = 24 - inicio + fim;
        }

        //Resultado
        System.out.println("Duração do jogo: "+duracao);
        abc.close();
    }
}
