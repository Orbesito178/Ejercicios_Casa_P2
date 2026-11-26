package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Sprint sprint = new Sprint();
        System.out.println("Tareas iniciales: " + sprint.obtenerCantidadTareas());
        System.out.println("Crear T01: " + sprint.crearTarea("T01", "Disenar pantalla de inicio", 6.0));
        System.out.println("Crear T02: " + sprint.crearTarea("T02", "Crear base de datos", 8.0));
        System.out.println("Crear T03: " + sprint.crearTarea("T03", "Implementar login", 5.0));
        System.out.println("Crear T04: " + sprint.crearTarea("T04", "Escribir pruebas", 4.5));
        System.out.println("Crear T05: " + sprint.crearTarea("T05", "Desplegar version", 3.0));
        System.out.println("Crear T01 repetida: " + sprint.crearTarea("T01", "Otra tarea", 2.0));
        System.out.println("Tareas: " + sprint.obtenerCantidadTareas());
        System.out.println(sprint.mostrarTareas());
        System.out.println("Completar T02: " + sprint.completarTarea("T02"));
        System.out.println("Completar T04: " + sprint.completarTarea("T04"));
        System.out.println("Completar T99: " + sprint.completarTarea("T99"));
        Tarea existente = sprint.buscarTarea("T03");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + existente);
        }
        Tarea inexistente = sprint.buscarTarea("T99");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
        System.out.println("Completadas: " + sprint.contarCompletadas());
        System.out.println("Horas pendientes: " + sprint.calcularHorasPendientes());
        System.out.println("Eliminar T05: " + sprint.eliminarTarea("T05"));
        System.out.println("Tareas: " + sprint.obtenerCantidadTareas());
        System.out.println(sprint.mostrarTareas());
    }
}
