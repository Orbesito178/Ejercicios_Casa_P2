package modelo;

public class ArchivoVideo extends Archivo {
    //Atributos
    private int duracionMinutos;

    public ArchivoVideo(String nombre, double tamanoMB, int duracionMinutos) {
        super(nombre, tamanoMB);
        this.duracionMinutos = duracionMinutos;
    }

    //Setters y getters
    public int getDuracionMinutos() {
        return duracionMinutos;
    }
    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    //Metodos
    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 2.5;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Minutos: " + duracionMinutos;
    }
}
