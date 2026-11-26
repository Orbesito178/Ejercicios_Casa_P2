package modelo;

public class Empleado {
    //Atributos
    private String identificacion;
    private String nombre;
    private double salarioBase;

    public Empleado(String identificacion, String nombre, double salarioBase) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    //Setters y getters
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //Metodos
    public double calcularBono() {
        return salarioBase * 0.05;
    }

    public String mostrarInformacion() {
        return identificacion + " - " + nombre + " - Salario: $" + salarioBase;
    }
}
