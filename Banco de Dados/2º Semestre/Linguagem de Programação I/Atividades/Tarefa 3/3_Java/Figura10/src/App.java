public class App {
    public static void main(String[] args) throws Exception {
        
        Mochila m1 = new Mochila();
        m1.Mochila("Viagem", 20, "couro", false);
        m1.ColocarObjeto();
        m1.Usar();
        m1.AbrirZiper();
        m1.status();
    }
}
