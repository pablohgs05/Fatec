public class App {
    public static void main(String[] args) throws Exception {
        
        Teclado t1 = new Teclado();

        t1.Teclado("mecânico", true, "Redragon");
        t1.Digitar();
        t1.Limpar();
        t1.LigarRGB();
        t1.status();
    }
}
