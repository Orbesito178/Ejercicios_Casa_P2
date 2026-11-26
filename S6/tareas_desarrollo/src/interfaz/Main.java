package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Tarea[] tareas = new Tarea[6];
        tareas[0] = new Tarea("T01", "Disenar base de datos", 8.0, true);
        tareas[1] = new Tarea("T02", "Crear pantalla de login", 5.5, true);
        tareas[2] = new Tarea("T03", "Implementar API de usuarios", 12.0, false);
        tareas[3] = new Tarea("T04", "Escribir pruebas unitarias", 6.0, false);
        tareas[4] = new Tarea("T05", "Configurar despliegue", 4.0, true);
        tareas[5] = new Tarea("T06", "Documentar el sprint", 3.5, false);
        AnalizadorTareas analizador = new AnalizadorTareas(tareas);
        System.out.println("Tareas:");
        System.out.println(analizador.listarTareas());
        System.out.println("Completadas: " + analizador.contarCompletadas());
        System.out.println("Horas totales: " + analizador.calcularHorasTotales());
        Tarea existente = analizador.buscarPorCodigo("T03");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + existente);
        }
        Tarea inexistente = analizador.buscarPorCodigo("T99");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
        Tarea mayor = analizador.obtenerTareaMayorDuracion();
        System.out.println("Mayor duracion: " + mayor.mostrarInformacion());
        System.out.println("Porcentaje completadas: " + analizador.calcularPorcentajeCompletadas() + "%");
        AnalizadorTareas vacio = new AnalizadorTareas(new Tarea[3]);
        System.out.println("Mayor duracion sin tareas: " + vacio.obtenerTareaMayorDuracion());
    }
}
