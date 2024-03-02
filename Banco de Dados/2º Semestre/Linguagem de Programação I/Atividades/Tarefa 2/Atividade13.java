import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        //Entrada dos dois valores
        System.out.println("\nEntre com o primeiro valor: ");
        double primeiro = abc.nextDouble();
        System.out.println("\nEntre com o segundo valor: ");
        double segundo = abc.nextDouble();

        //Verificar qual é maior
        if (primeiro>segundo) {
            System.out.println("\nA ordem crescente é: "+segundo + ";" +primeiro);
        } else {
            System.out.println("\nA ordem crescente é: "+primeiro + ";" +segundo);
        }
        abc.close();
    }
}