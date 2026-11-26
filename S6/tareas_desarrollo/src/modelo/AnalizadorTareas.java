package modelo;

public class AnalizadorTareas {
    //Atributos
    private Tarea[] tareas;

    public AnalizadorTareas(Tarea[] tareas) {
        this.tareas = tareas;
    }

    //Setters y getters
    public Tarea[] getTareas() {
        return tareas;
    }
    public void setTareas(Tarea[] tareas) {
        this.tareas = tareas;
    }

    //Metodos
    public String listarTareas() {
        String resultado = "";
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null) {
                resultado = resultado + tareas[i].mostrarInformacion() + "\n";
            }
        }
        return resultado;
    }

    public int contarCompletadas() {
        int contador = 0;
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null && tareas[i].isCompletada()) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularHorasTotales() {
        double suma = 0;
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null) {
                suma = suma + tareas[i].getHorasEstimadas();
            }
        }
        return suma;
    }

    public Tarea buscarPorCodigo(String codigo) {
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null && tareas[i].getCodigo().equals(codigo)) {
                return tareas[i];
            }
        }
        return null;
    }

    public Tarea obtenerTareaMayorDuracion() {
        Tarea resultado = null;
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null) {
                if (resultado == null || tareas[i].getHorasEstimadas() > resultado.getHorasEstimadas()) {
                    resultado = tareas[i];
                }
            }
        }
        return resultado;
    }

    public double calcularPorcentajeCompletadas() {
        int total = 0;
        int completadas = 0;
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null) {
                total++;
                if (tareas[i].isCompletada()) {
                    completadas++;
                }
            }
        }
        if (total == 0) {
            return 0;
        }
        return completadas * 100.0 / total;
    }
}
