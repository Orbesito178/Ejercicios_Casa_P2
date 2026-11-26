package modelo;

public class Tarea {
    //Atributos
    private String codigo;
    private String titulo;
    private double horasEstimadas;
    private boolean completada;

    public Tarea(String codigo, String titulo, double horasEstimadas, boolean completada) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.completada = completada;
    }

    //Setters y getters
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getHorasEstimadas() {
        return horasEstimadas;
    }
    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
    public boolean isCompletada() {
        return completada;
    }
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    //Metodos
    public String mostrarInformacion() {
        String estado = "Pendiente";
        if (completada) {
            estado = "Completada";
        }
        return codigo + " - " + titulo + " - " + horasEstimadas + " horas - " + estado;
    }
}
