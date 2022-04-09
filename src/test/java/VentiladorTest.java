import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VentiladorTest {

    @Test
    public void deveRetornarPendenciaMotorMontagem() {
        Ventilador ventilador = new Ventilador();
        Motor.getInstancia().addVentiladorPendente(ventilador);

        assertEquals(false, ventilador.montar());
    }

    @Test
    public void deveRetornarPendenciaHeliceMontagem() {
        Ventilador ventilador = new Ventilador();
        Helice.getInstancia().addVentiladorPendente(ventilador);

        assertEquals(false, ventilador.montar());
    }

    @Test
    public void deveRetornarPendenciaBaseMontagem() {
        Ventilador ventilador = new Ventilador();
        Base.getInstancia().addVentiladorPendente(ventilador);

        assertEquals(false, ventilador.montar());
    }

    @Test
    public void deveRetornarventiladorSemPendenciaMontagem() {
        Ventilador ventilador = new Ventilador();

        assertEquals(true, ventilador.montar());
    }
}
