package modelo;

public class Proyecto {
    //Atributos
    private String codigo;
    private String nombre;
    private double presupuesto;

    public Proyecto(String codigo, String nombre, double presupuesto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }

    //Setters y getters
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    //Metodos
    public String mostrarInformacion() {
        return codigo + " - " + nombre + " - Presupuesto: $" + String.format("%.2f", presupuesto);
    }
}
