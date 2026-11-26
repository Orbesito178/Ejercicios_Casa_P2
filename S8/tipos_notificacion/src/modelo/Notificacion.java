package modelo;

public class Notificacion {
    //Atributos
    private String destinatario;
    private String mensaje;

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    //Setters y getters
    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    //Metodos
    public String generarMensaje() {
        return "Notificacion para " + destinatario + ": " + mensaje;
    }
}
