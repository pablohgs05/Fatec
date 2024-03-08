public class App {
    public static void main(String[] args) throws Exception {
        
        Celular c1 = new Celular();
        c1.Celular("Huawei", 512, "prata", true);
        c1.Carregar();
        c1.Video();
        c1.TirarFoto();
        c1.status();
    }
}
