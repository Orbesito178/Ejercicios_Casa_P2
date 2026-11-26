package modelo;

public class NotificacionPush extends Notificacion {
    //Atributos
    private String dispositivo;

    public NotificacionPush(String destinatario, String mensaje, String dispositivo) {
        super(destinatario, mensaje);
        this.dispositivo = dispositivo;
    }

    //Setters y getters
    public String getDispositivo() {
        return dispositivo;
    }
    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    //Metodos
    @Override
    public String generarMensaje() {
        return "Push en " + dispositivo + " para " + getDestinatario() + ": " + getMensaje();
    }
}
