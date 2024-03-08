import java.util.concurrent.CancellationException;

public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();

        c1.Caneta(false, "red", false);
        c1.status();
        c1.Escrever();
        c1.Rabiscar();
        c1.Desenhar();
    
        


        

    }
}
