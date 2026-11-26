package modelo;

import java.util.ArrayList;

public class EmpresaSoftware {
    //Atributos
    private ArrayList<Empleado> empleados;

    public EmpresaSoftware() {
        empleados = new ArrayList<>();
    }

    //Metodos
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public Empleado buscarEmpleado(String identificacion) {
        for (Empleado e : empleados) {
            if (e.getIdentificacion().equals(identificacion)) {
                return e;
            }
        }
        return null;
    }

    public int obtenerCantidadEmpleados() {
        return empleados.size();
    }

    public double calcularTotalBonos() {
        double total = 0;
        for (Empleado e : empleados) {
            total = total + e.calcularBono();
        }
        return total;
    }

    public String mostrarEmpleados() {
        String lista = "";
        for (Empleado e : empleados) {
            lista = lista + e.mostrarInformacion() + " - Bono: $" + e.calcularBono() + "\n";
        }
        return lista;
    }
}
