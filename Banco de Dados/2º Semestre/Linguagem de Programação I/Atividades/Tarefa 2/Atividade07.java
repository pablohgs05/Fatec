import java.util.Scanner;
public class Atividade07 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        //Entrada
        System.out.println("\nEntre com um valor: ");
        double valor = abc.nextDouble();
        
        //Verificar se o valor é maior ou menor que 10
        if (valor>10) {
            System.out.println("\nÉ MAIOR QUE 10!");
        } else {
            System.out.println("\nNÃO É MAIOR QUE 10!"); 
        }
        abc.close();
    }

}