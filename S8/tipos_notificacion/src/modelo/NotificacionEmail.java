package modelo;

public class NotificacionEmail extends Notificacion {
    //Atributos
    private String asunto;

    public NotificacionEmail(String destinatario, String mensaje, String asunto) {
        super(destinatario, mensaje);
        this.asunto = asunto;
    }

    //Setters y getters
    public String getAsunto() {
        return asunto;
    }
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    //Metodos
    @Override
    public String generarMensaje() {
        return "Email a " + getDestinatario() + " | Asunto: " + asunto + " | " + getMensaje();
    }
}
