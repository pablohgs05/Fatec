import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        //Leitura do número de horas trabalhadas
        System.out.println("\nDigite o número de horas trabalhadas em um mês: ");
        int horasTrabalhadas = abc.nextInt();

        //Salário por hora
        System.out.print("Digite o salário por hora: R$");
        double salarioHora = abc.nextDouble();

        int horasSemana = 40;
        int semanasMes = 4;
        //Cálculo das horas extras
        int horasExtras = Math.max(horasTrabalhadas - (horasSemana * semanasMes), 0);

        //Cálculo do salário total
        double total = (horasSemana * semanasMes * salarioHora) + (horasExtras * 1.5 * salarioHora);
                              
        //Saída
        System.out.println("\nSalário total: R$"+total);

        abc.close();
    }
}
