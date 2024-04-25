import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQuantas frações você deseja usar?");
        int numFractions = scanner.nextInt();
        Fracao[] fracoes = new Fracao[numFractions];

        for (int i = 0; i < numFractions; i++) {
            System.out.println("\nDigite o numerador da fração " + (i + 1) + ":");
            int numerador = scanner.nextInt();
            System.out.println("Digite o denominador da fração " + (i + 1) + ":");
            int denominador = scanner.nextInt();
            fracoes[i] = new Fracao(numerador, denominador);
        }

        Fracao resultado = calcularOperacoesConsecutivas(fracoes);
        System.out.print("\nResultado: ");
        resultado.imprimir();
    }

    public static Fracao calcularOperacoesConsecutivas(Fracao[] fracoes) {
        Fracao resultado = fracoes[0]; // Inicializa o resultado com a primeira fração

        for (int i = 1; i < fracoes.length; i++) {
            System.out.println("\nEscolha a operação para a fração " + (i) + " com a fração " + (i + 1) + ":");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.print("\nResposta: ");
            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    resultado = resultado.somar(fracoes[i]);
                    break;
                case 2:
                    resultado = resultado.subtrair(fracoes[i]);
                    break;
                case 3:
                    resultado = resultado.multiplicar(fracoes[i]);
                    break;
                case 4:
                    resultado = resultado.dividir(fracoes[i]);
                    break;
                default:
                    System.out.println("Opção inválida. A operação padrão será soma.");
                    resultado = resultado.somar(fracoes[i]);
            }
        }
        return resultado;
    }
}