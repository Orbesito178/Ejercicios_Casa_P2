package modelo;

public class ArchivoImagen extends Archivo {
    //Atributos
    private String resolucion;

    public ArchivoImagen(String nombre, double tamanoMB, String resolucion) {
        super(nombre, tamanoMB);
        this.resolucion = resolucion;
    }

    //Setters y getters
    public String getResolucion() {
        return resolucion;
    }
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    //Metodos
    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 1.5;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Resolucion: " + resolucion;
    }
}
