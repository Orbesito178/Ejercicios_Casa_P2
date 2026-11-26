package modelo;

public class VersionSoftware {
    //Atributos
    private String numero;
    private String fecha;
    private boolean estable;
    private int cantidadCambios;

    public VersionSoftware(String numero, String fecha, boolean estable, int cantidadCambios) {
        this.numero = numero;
        this.fecha = fecha;
        this.estable = estable;
        this.cantidadCambios = cantidadCambios;
    }

    //Setters y getters
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public boolean isEstable() {
        return estable;
    }
    public void setEstable(boolean estable) {
        this.estable = estable;
    }
    public int getCantidadCambios() {
        return cantidadCambios;
    }
    public void setCantidadCambios(int cantidadCambios) {
        this.cantidadCambios = cantidadCambios;
    }

    //Metodos
    public String mostrarInformacion() {
        String estado = "Inestable";
        if (estable) {
            estado = "Estable";
        }
        return "v" + numero + " - " + fecha + " - " + estado + " - " + cantidadCambios + " cambios";
    }
}
