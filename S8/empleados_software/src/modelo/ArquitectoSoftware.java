package modelo;

public class ArquitectoSoftware extends Empleado {
    //Atributos
    private int cantidadSistemas;

    public ArquitectoSoftware(String identificacion, String nombre, double salarioBase, int cantidadSistemas) {
        super(identificacion, nombre, salarioBase);
        this.cantidadSistemas = cantidadSistemas;
    }

    //Setters y getters
    public int getCantidadSistemas() {
        return cantidadSistemas;
    }
    public void setCantidadSistemas(int cantidadSistemas) {
        this.cantidadSistemas = cantidadSistemas;
    }

    //Metodos
    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.15 + cantidadSistemas * 100;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Sistemas: " + cantidadSistemas;
    }
}
