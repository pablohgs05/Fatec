public class App {
    public static void main(String[] args) throws Exception {
        
        Carro c1 = new Carro();
        c1.Carro("Honda", 78, "preto", true);
        c1.Acelerar();
        c1.Drift();
        c1.TrocarMarcha();
        c1.status();
    }
}
