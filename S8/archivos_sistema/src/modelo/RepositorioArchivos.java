package modelo;

import java.util.ArrayList;

public class RepositorioArchivos {
    //Atributos
    private ArrayList<Archivo> archivos;

    public RepositorioArchivos() {
        archivos = new ArrayList<>();
    }

    //Metodos
    public void agregarArchivo(Archivo archivo) {
        archivos.add(archivo);
    }

    public Archivo buscarArchivo(String nombre) {
        for (Archivo a : archivos) {
            if (a.getNombre().equals(nombre)) {
                return a;
            }
        }
        return null;
    }

    public int obtenerCantidadArchivos() {
        return archivos.size();
    }

    public double calcularEspacioTotalProcesado() {
        double total = 0;
        for (Archivo a : archivos) {
            total = total + a.calcularEspacioProcesado();
        }
        return total;
    }

    public String mostrarArchivos() {
        String lista = "";
        for (Archivo a : archivos) {
            lista = lista + a.mostrarInformacion() + " - Procesado: " + a.calcularEspacioProcesado() + " MB\n";
        }
        return lista;
    }
}
