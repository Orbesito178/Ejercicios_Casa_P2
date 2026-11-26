package modelo;

import java.util.ArrayList;

public class Sprint {
    //Atributos
    private ArrayList<Tarea> tareas;

    public Sprint() {
        tareas = new ArrayList<>();
    }

    //Metodos
    public boolean crearTarea(String codigo, String titulo, double horas) {
        if (buscarTarea(codigo) != null) {
            return false;
        }
        Tarea tarea = new Tarea(codigo, titulo, horas);
        tareas.add(tarea);
        return true;
    }

    public boolean completarTarea(String codigo) {
        Tarea tarea = buscarTarea(codigo);
        if (tarea != null) {
            tarea.setCompletada(true);
            return true;
        }
        return false;
    }

    public Tarea buscarTarea(String codigo) {
        for (Tarea t : tareas) {
            if (t.getCodigo().equals(codigo)) {
                return t;
            }
        }
        return null;
    }

    public boolean eliminarTarea(String codigo) {
        Tarea tarea = buscarTarea(codigo);
        if (tarea != null) {
            tareas.remove(tarea);
            return true;
        }
        return false;
    }

    public int obtenerCantidadTareas() {
        return tareas.size();
    }

    public int contarCompletadas() {
        int contador = 0;
        for (Tarea t : tareas) {
            if (t.isCompletada()) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularHorasPendientes() {
        double total = 0;
        for (Tarea t : tareas) {
            if (t.isCompletada() == false) {
                total = total + t.getHoras();
            }
        }
        return total;
    }

    public String mostrarTareas() {
        String lista = "";
        for (Tarea t : tareas) {
            lista = lista + t.mostrarInformacion() + "\n";
        }
        return lista;
    }
}
