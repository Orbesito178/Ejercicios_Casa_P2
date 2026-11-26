package modelo;

public class NotificacionSMS extends Notificacion {
    //Atributos
    private String telefono;

    public NotificacionSMS(String destinatario, String mensaje, String telefono) {
        super(destinatario, mensaje);
        this.telefono = telefono;
    }

    //Setters y getters
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //Metodos
    @Override
    public String generarMensaje() {
        return "SMS al " + telefono + " (" + getDestinatario() + "): " + getMensaje();
    }
}
