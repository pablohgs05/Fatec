public class App {
    public static void main(String[] args) throws Exception {
        Monitor m1 = new Monitor();
        
        m1.Monitor(75, 21.5, "AMOLED", true);

        m1.AumentarVol(10,true);
        m1.DarZoom();
        m1.AumentarBrilho(true);

    }
}
