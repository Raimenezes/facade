public class Base extends Setor {

    private static  Base base = new Base();

    private Base() {};

    public static Base getInstancia() {
        return base;
    }
}
