package modelo;

public class ArchivoTexto extends Archivo {
    //Atributos
    private int cantidadPalabras;

    public ArchivoTexto(String nombre, double tamanoMB, int cantidadPalabras) {
        super(nombre, tamanoMB);
        this.cantidadPalabras = cantidadPalabras;
    }

    //Setters y getters
    public int getCantidadPalabras() {
        return cantidadPalabras;
    }
    public void setCantidadPalabras(int cantidadPalabras) {
        this.cantidadPalabras = cantidadPalabras;
    }

    //Metodos
    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 1.1;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Palabras: " + cantidadPalabras;
    }
}
