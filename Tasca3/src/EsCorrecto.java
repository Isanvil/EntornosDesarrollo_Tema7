public class EsCorrecto {

    private boolean isCorrect;
    private String mensaje;

    public EsCorrecto(boolean isCorrect, String mensaje) {
        this.isCorrect = isCorrect;
        this.mensaje = mensaje;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public String getMensaje() {
        return mensaje;
    }
}
