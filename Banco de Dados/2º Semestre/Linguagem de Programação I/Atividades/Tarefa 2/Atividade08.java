import java.util.Scanner;
public class Atividade08 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        //Entrada
        System.out.println("\nEntre com um valor: ");
        double valor = abc.nextDouble();
        
        //Verificar se o valor é positivo ou negativo
        if (valor>=0) {
            System.out.println("\nÉ positivo.");
        } else {
            System.out.println("\nÉ negativo."); 
        }
        abc.close();
    }

}