package modelo;

public class Programador extends Empleado {
    //Atributos
    private String lenguaje;

    public Programador(String identificacion, String nombre, double salarioBase, String lenguaje) {
        super(identificacion, nombre, salarioBase);
        this.lenguaje = lenguaje;
    }

    //Setters y getters
    public String getLenguaje() {
        return lenguaje;
    }
    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    //Metodos
    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.10;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Lenguaje: " + lenguaje;
    }
}
