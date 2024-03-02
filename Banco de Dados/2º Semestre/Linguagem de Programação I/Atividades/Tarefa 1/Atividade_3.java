import java.util.Scanner;

public class Atividade_3 {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);

        float p1;
        float e1;
        float e2;
        float api;
        float sub;
        float x;
        float lp1;
        
        while (true) {
            System.out.print("\nNota da P1: ");
            p1 = nota.nextFloat();
            System.out.print("Nota da E1: ");
            e1 = nota.nextFloat();
            System.out.print("Nota da E2: ");
            e2 = nota.nextFloat();
            System.out.print("Nota do API: ");
            api = nota.nextFloat();
            System.out.print("Nota da SUB: ");
            sub = nota.nextFloat();
            System.out.println("Nota das atividades extras: ");
            x = nota.nextFloat();

            lp1 = (float) ((p1 * 0.6 + (((e1 + e2) / 2) * 0.4)) * 0.5
                    + (Math.max(((p1 * 0.6 + ((e1 + e2) / 2) * 0.4) - 5.9), 0) / ((p1 * 0.6 + ((e1 + e2) / 2) * 0.4) - 5.9))
                    * (api * 0.5) + x + (sub * 0.2));

            while (true) {
                if (lp1 > 10) {
                    System.out.println("\n\n\n\nDigite novamente as notas");
                    break;
                } else {
                    System.out.println("Sua média é " + lp1);
                    nota.close(); // Adicionando o scanner.close() para fechar o recurso Scanner
                    return;
                }
            }
        }
    }
}
