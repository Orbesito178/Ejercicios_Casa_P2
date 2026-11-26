package modelo;

public class Disenador extends Empleado {
    //Atributos
    private String herramienta;

    public Disenador(String identificacion, String nombre, double salarioBase, String herramienta) {
        super(identificacion, nombre, salarioBase);
        this.herramienta = herramienta;
    }

    //Setters y getters
    public String getHerramienta() {
        return herramienta;
    }
    public void setHerramienta(String herramienta) {
        this.herramienta = herramienta;
    }

    //Metodos
    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.08;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Herramienta: " + herramienta;
    }
}
