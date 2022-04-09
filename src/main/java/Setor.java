import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Ventilador> ventiladoresComPendencia = new ArrayList<Ventilador>();

    public void addVentiladorPendente(Ventilador ventilador) {
        this.ventiladoresComPendencia.add(ventilador);
    }

    public boolean verificarVentiladorComPendencia(Ventilador ventilador) {
        return this.ventiladoresComPendencia.contains(ventilador);
    }
}
