import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pede os anos
        System.out.println("\nQuantos anos? ");
        int anos = scanner.nextInt();
        //Pede os meses
        System.out.println("Quantos meses? ");
        int meses = scanner.nextInt();
        //Pede os dias
        System.out.println("Quantos dias? ");
        int dias = scanner.nextInt();

        //Idade em dias
        int TotalEmDias = (anos * 365) + (meses * 30) + dias;

        //Mostra o resultado
        System.out.println("Sua idade em dias é: "+TotalEmDias);

        scanner.close();
    }

}