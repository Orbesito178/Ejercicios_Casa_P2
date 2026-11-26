package modelo;

public class ErrorSoftware {
    //Atributos
    private String codigo;
    private String descripcion;
    private String severidad;
    private boolean resuelto;

    public ErrorSoftware(String codigo, String descripcion, String severidad, boolean resuelto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.severidad = severidad;
        this.resuelto = resuelto;
    }

    //Setters y getters
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getSeveridad() {
        return severidad;
    }
    public void setSeveridad(String severidad) {
        this.severidad = severidad;
    }
    public boolean isResuelto() {
        return resuelto;
    }
    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

    //Metodos
    public String mostrarInformacion() {
        String estado = "Pendiente";
        if (resuelto) {
            estado = "Resuelto";
        }
        return codigo + " - " + descripcion + " - " + severidad + " - " + estado;
    }
}
