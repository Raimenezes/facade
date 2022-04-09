public class VentiladorFacade {

    public static boolean verificarPendenciasMontagem(Ventilador ventilador) {
        if (Motor.getInstancia().verificarVentiladorComPendencia(ventilador)) {
            return false;
        }
        if (Helice.getInstancia().verificarVentiladorComPendencia(ventilador)) {
            return false;
        }
        if (Base.getInstancia().verificarVentiladorComPendencia(ventilador)) {
            return false;
        }
        return true;
    }
}
