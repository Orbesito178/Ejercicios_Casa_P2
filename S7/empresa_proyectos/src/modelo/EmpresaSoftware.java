package modelo;

import java.util.ArrayList;

public class EmpresaSoftware {
    //Atributos
    private ArrayList<Proyecto> proyectos;

    public EmpresaSoftware() {
        proyectos = new ArrayList<>();
    }

    //Metodos
    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public Proyecto buscarProyecto(String codigo) {
        for (Proyecto p : proyectos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProyecto(String codigo) {
        Proyecto proyecto = buscarProyecto(codigo);
        if (proyecto != null) {
            proyectos.remove(proyecto);
            return true;
        }
        return false;
    }

    public int obtenerCantidadProyectos() {
        return proyectos.size();
    }

    public double calcularPresupuestoTotal() {
        double total = 0;
        for (Proyecto p : proyectos) {
            total = total + p.getPresupuesto();
        }
        return total;
    }

    public String mostrarProyectos() {
        String lista = "";
        for (Proyecto p : proyectos) {
            lista = lista + p.mostrarInformacion() + "\n";
        }
        return lista;
    }

    public Proyecto obtenerProyectoMayorPresupuesto() {
        Proyecto mayor = null;
        for (Proyecto p : proyectos) {
            if (mayor == null || p.getPresupuesto() > mayor.getPresupuesto()) {
                mayor = p;
            }
        }
        return mayor;
    }
}
