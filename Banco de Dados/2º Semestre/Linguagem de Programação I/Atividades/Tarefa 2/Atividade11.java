import java.util.Scanner;
public class Atividade11 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        //Entrada dos anos
        System.out.println("\nDigite o ano de nascimento: ");
        int nascimento = abc.nextInt();
        System.out.println("\nDigite o ano atual: ");
        int atual = abc.nextInt();

        //Verificar se a pessoa tem ou terá 16 anos para votar
        int voto = atual - nascimento;
        if (voto<16) {
            System.out.println("\nNão pode votar esse ano.");
        }else {
            System.out.println("\nPode votar esse ano.");
        }
        abc.close();

    }

}
