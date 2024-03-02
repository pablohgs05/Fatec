import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        //Entradas do usuário
        System.out.println("\nEntre com a quantidade total de votos: ");
        double total = abc.nextDouble();
        System.out.println("Entre com os votos brancos: ");
        double brancos = abc.nextDouble();
        System.out.println("Entre com os votos nulos: ");
        double nulos = abc.nextDouble();
        System.out.println("Entre com os votos válidos: ");
        double validos = abc.nextDouble();

        //Percentual
        double brancop = (brancos * 100) / total;
        double nulop = (nulos * 100) / total;
        double validop = (validos * 100) / total;

        //Saída
        System.out.println("\nBrancos: "+ brancop + "%");
        System.out.println("Nulos: "+ nulop + "%");
        System.out.println("Válidos: "+ validop + "%");

        abc.close();
    }
}
