public class Helice extends Setor {

    private static Helice helice = new Helice();

    private Helice() {};

    public static Helice getInstancia() {
        return helice;
    }
}
