import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual operação você deseja realizar?");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        System.out.println("\nResposta: ");
        int opcao = scanner.nextInt();

        System.out.println("Digite o numerador da primeira fração:");
        int numerador1 = scanner.nextInt();
        System.out.println("Digite o denominador da primeira fração:");
        int denominador1 = scanner.nextInt();

        System.out.println("Digite o numerador da segunda fração:");
        int numerador2 = scanner.nextInt();
        System.out.println("Digite o denominador da segunda fração:");
        int denominador2 = scanner.nextInt();

        Fracao f1 = new Fracao(numerador1, denominador1);
        Fracao f2 = new Fracao(numerador2, denominador2);

        Fracao resultado;

        switch (opcao) {
            case 1:
                resultado = f1.somar(f2);
                System.out.print("Soma: ");
                resultado.imprimir();
                break;
            case 2:
                resultado = f1.subtrair(f2);
                System.out.print("Subtração: ");
                resultado.imprimir();
                break;
            case 3:
                resultado = f1.multiplicar(f2);
                System.out.print("Multiplicação: ");
                resultado.imprimir();
                break;
            case 4:
                resultado = f1.dividir(f2);
                System.out.print("Divisão: ");
                resultado.imprimir();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}