public class Ventilador {

    public boolean montar() {
        return VentiladorFacade.verificarPendenciasMontagem(this);
    }
}
