import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        //Entradas
        System.out.print("\nDigite o número de carros vendidos: ");
        int vendidos = abc.nextInt();
        System.out.print("Digite o valor total das vendas:  ");
        double vendas = abc.nextDouble();
        System.out.print("Digite o salário fixo: ");
        double salarioFixo = abc.nextDouble();
        System.out.print("Digite o valor por carro vendido: ");
        double valorPorCarro = abc.nextDouble();

        //Calculo final
        double comissao = 0.05 * vendas;
        double salariofinal = salarioFixo + (vendidos * valorPorCarro) + comissao;

        //Saída
        System.out.println("Salário final: R$"+salariofinal);
        abc.close();
    }

}
