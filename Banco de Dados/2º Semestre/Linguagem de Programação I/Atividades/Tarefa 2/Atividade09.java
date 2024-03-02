import java.util.Scanner;
public class Atividade09 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        //Entrada com o nº de maçãs
        System.out.println("\nEntre com o número de maçãs compradas: ");
        int numero = abc.nextInt();

        //Preço da maçãs
        double unidade;

        if (numero>12) {
            unidade = 1; 
        } else {
            unidade = 1.3;
        }

        //Total da compra
        double total = (unidade * numero);

        //Saída com o valor calculado
        System.out.println("\nO total da compra será: R$"+total);
        abc.close();
    }

}