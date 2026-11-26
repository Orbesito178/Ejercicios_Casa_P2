package modelo;

public class Archivo {
    //Atributos
    private String nombre;
    private double tamanoMB;

    public Archivo(String nombre, double tamanoMB) {
        this.nombre = nombre;
        this.tamanoMB = tamanoMB;
    }

    //Setters y getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getTamanoMB() {
        return tamanoMB;
    }
    public void setTamanoMB(double tamanoMB) {
        this.tamanoMB = tamanoMB;
    }

    //Metodos
    public double calcularEspacioProcesado() {
        return tamanoMB;
    }

    public String mostrarInformacion() {
        return nombre + " - " + tamanoMB + " MB";
    }
}
