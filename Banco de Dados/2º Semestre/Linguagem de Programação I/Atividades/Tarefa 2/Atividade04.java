import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        //Entrada
        System.out.println("\nEntre com o custo de fábrica: ");
        double fabrica = abc.nextDouble();

        //Cálculos
        double impostos = fabrica * 0.45;
        double distribuidor = fabrica * 0.28;
        double total = fabrica + impostos + distribuidor;

        //Saída
        System.out.println("Preço final: R$" +total);
        abc.close();
    }

}
