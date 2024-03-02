import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        //Entradas
        Scanner abc = new Scanner(System.in);
        System.out.println("\nDigite o salário mensal atual: ");
        double atual = abc.nextDouble();
        System.out.println("Digite o percentual de reajuste: ");
        double reajuste = abc.nextDouble();

        //Calculando o percentual e o novo valor
        double percentual = (reajuste / 100) * atual;
        double novo = percentual + atual;

        //Saída
        System.out.println("Seu novo salário é: "+ novo);
        abc.close();
    }
}
