package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Proyecto p1 = new Proyecto("P01", "Tienda en linea", 15000.0);
        Proyecto p2 = new Proyecto("P02", "App de delivery", 22000.5);
        Proyecto p3 = new Proyecto("P03", "Sistema de inventario", 9000.0);
        Proyecto p4 = new Proyecto("P04", "Portal de empleados", 12500.0);
        EmpresaSoftware empresa = new EmpresaSoftware();
        System.out.println("Proyectos iniciales: " + empresa.obtenerCantidadProyectos());
        empresa.agregarProyecto(p1);
        empresa.agregarProyecto(p2);
        empresa.agregarProyecto(p3);
        empresa.agregarProyecto(p4);
        System.out.println(empresa.mostrarProyectos());
        Proyecto existente = empresa.buscarProyecto("P02");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + existente);
        }
        Proyecto inexistente = empresa.buscarProyecto("P99");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
        System.out.println("Presupuesto total: " + empresa.calcularPresupuestoTotal());
        System.out.println("Eliminar P03: " + empresa.eliminarProyecto("P03"));
        System.out.println("Eliminar P99: " + empresa.eliminarProyecto("P99"));
        System.out.println("Proyectos: " + empresa.obtenerCantidadProyectos());
        System.out.println("Presupuesto total: " + empresa.calcularPresupuestoTotal());
        System.out.println("El proyecto p3 sigue existiendo: " + p3.mostrarInformacion());
        System.out.println("Mayor presupuesto: " + empresa.obtenerProyectoMayorPresupuesto().mostrarInformacion());
    }
}
