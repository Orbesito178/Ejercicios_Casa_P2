package modelo;

public class Tarea {
    //Atributos
    private String codigo;
    private String titulo;
    private double horas;
    private boolean completada;

    public Tarea(String codigo, String titulo, double horas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.horas = horas;
        completada = false;
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
    public double getHoras() {
        return horas;
    }
    public void setHoras(double horas) {
        this.horas = horas;
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
        return codigo + " - " + titulo + " - " + horas + " horas - " + estado;
    }
}
