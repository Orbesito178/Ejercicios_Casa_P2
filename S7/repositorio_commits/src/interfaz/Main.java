package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Repositorio repositorio = new Repositorio();
        System.out.println("Commits iniciales: " + repositorio.obtenerCantidadCommits());
        System.out.println("Registrar C01: " + repositorio.registrarCommit("C01", "Ana", "Crear estructura del proyecto"));
        System.out.println("Registrar C02: " + repositorio.registrarCommit("C02", "Luis", "Agregar pantalla de login"));
        System.out.println("Registrar C03: " + repositorio.registrarCommit("C03", "Ana", "Conectar base de datos"));
        System.out.println("Registrar C04: " + repositorio.registrarCommit("C04", "Marta", "Corregir error de validacion"));
        System.out.println("Registrar C05: " + repositorio.registrarCommit("C05", "Ana", "Agregar pruebas unitarias"));
        System.out.println("Registrar C06: " + repositorio.registrarCommit("C06", "Luis", "Actualizar documentacion"));
        System.out.println("Registrar C01 repetido: " + repositorio.registrarCommit("C01", "Luis", "Commit repetido"));
        System.out.println("Historial:");
        System.out.println(repositorio.mostrarHistorial());
        Commit existente = repositorio.buscarPorCodigo("C04");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + existente);
        }
        Commit inexistente = repositorio.buscarPorCodigo("C99");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
        System.out.println("Commits de Ana: " + repositorio.contarPorAutor("Ana"));
        System.out.println("Commits de Luis: " + repositorio.contarPorAutor("Luis"));
        System.out.println("Commits de Pedro: " + repositorio.contarPorAutor("Pedro"));
        System.out.println("Eliminar ultimo: " + repositorio.eliminarUltimoCommit());
        System.out.println("Commits: " + repositorio.obtenerCantidadCommits());
        System.out.println("Historial:");
        System.out.println(repositorio.mostrarHistorial());
    }
}
