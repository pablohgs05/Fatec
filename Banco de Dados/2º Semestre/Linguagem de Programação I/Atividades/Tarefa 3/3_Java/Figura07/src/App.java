public class App {
    public static void main(String[] args) throws Exception {
        Mouse m1 = new Mouse();

        m1.Mouse("HyperX", 3, false);
        m1.Arrastar("direito");
        m1.Clicar("esquerdo");
        m1.Scrollar("baixo");
        m1.status();
    }
}
