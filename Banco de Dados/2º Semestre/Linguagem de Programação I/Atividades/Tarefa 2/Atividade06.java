import java.util.Scanner;
public class Atividade06 {
    public static void main(String[] args) {
        //Entrada
        Scanner abc = new Scanner(System.in);
        System.out.println("\nEntre com a temperatura em graus Fahrenheit: ");
        double fahrenheit = abc.nextDouble();
        
        //Transformação
        double celsius = (fahrenheit - 32) * 5/9;

        //Saída
        System.out.println("\n A temperatura em Celsius é: "+celsius + "º");
        abc.close();
    }

}
