import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);

        //Entrada das notas
        System.out.println("\nEntre com a primeira nota: ");
        double primeira = abc.nextDouble();
        System.out.println("\nEntre com a segunda nota: ");
        double segunda = abc.nextDouble();

        //Cálculo da média
        double media = (primeira + segunda) / 2;

        //Verificar se foi aprovado ou não
        if (media<6) {
            System.out.println("\n O aluno está reprovado.");
        }else {
            System.out.println("\nO aluno está aprovado.");
        }
        abc.close();

    }

}
