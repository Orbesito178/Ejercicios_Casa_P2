package modelo;

public class Tester extends Empleado {
    //Atributos
    private int cantidadPruebas;

    public Tester(String identificacion, String nombre, double salarioBase, int cantidadPruebas) {
        super(identificacion, nombre, salarioBase);
        this.cantidadPruebas = cantidadPruebas;
    }

    //Setters y getters
    public int getCantidadPruebas() {
        return cantidadPruebas;
    }
    public void setCantidadPruebas(int cantidadPruebas) {
        this.cantidadPruebas = cantidadPruebas;
    }

    //Metodos
    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.05 + cantidadPruebas * 2;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Pruebas: " + cantidadPruebas;
    }
}
