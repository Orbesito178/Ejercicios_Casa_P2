package modelo;

public class NotificacionSlack extends Notificacion {
    //Atributos
    private String canal;

    public NotificacionSlack(String destinatario, String mensaje, String canal) {
        super(destinatario, mensaje);
        this.canal = canal;
    }

    //Setters y getters
    public String getCanal() {
        return canal;
    }
    public void setCanal(String canal) {
        this.canal = canal;
    }

    //Metodos
    @Override
    public String generarMensaje() {
        return "Slack en " + canal + " para " + getDestinatario() + ": " + getMensaje();
    }
}
