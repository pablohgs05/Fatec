public class App {
    public static void main(String[] args) throws Exception {
        Cadeira c1 = new Cadeira();
        c1.Cadeira("Madeira", "Cadeira com rodinhas", false);
        c1.Sentar();
        c1.AjustarCad();
        c1.GirarCadeira();
        c1.status();
        
    }
}
