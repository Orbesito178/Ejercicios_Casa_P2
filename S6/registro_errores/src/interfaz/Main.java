package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        ErrorSoftware[] errores = new ErrorSoftware[7];
        errores[0] = new ErrorSoftware("E01", "Falla al iniciar sesion", "ALTA", false);
        errores[1] = new ErrorSoftware("E02", "Boton desalineado", "BAJA", true);
        errores[2] = new ErrorSoftware("E03", "Reporte con datos duplicados", "MEDIA", false);
        errores[3] = new ErrorSoftware("E04", "Caida al guardar archivo", "ALTA", true);
        errores[4] = new ErrorSoftware("E05", "Texto mal escrito", "BAJA", false);
        errores[5] = new ErrorSoftware("E06", "Lentitud en la busqueda", "MEDIA", false);
        errores[6] = new ErrorSoftware("E07", "Perdida de datos al cerrar", "ALTA", false);
        AnalizadorErrores analizador = new AnalizadorErrores(errores);
        System.out.println("Errores:");
        System.out.println(analizador.listarErrores());
        System.out.println("Pendientes: " + analizador.contarPendientes());
        System.out.println("Errores ALTA: " + analizador.contarPorSeveridad("ALTA"));
        System.out.println("Errores MEDIA: " + analizador.contarPorSeveridad("MEDIA"));
        System.out.println("Errores BAJA: " + analizador.contarPorSeveridad("BAJA"));
        System.out.println("Listado de severidad ALTA:");
        System.out.println(analizador.listarPorSeveridad("ALTA"));
        System.out.println("Listado de severidad CRITICA:");
        System.out.println(analizador.listarPorSeveridad("CRITICA"));
        ErrorSoftware existente = analizador.buscarPorCodigo("E03");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + existente);
        }
        ErrorSoftware inexistente = analizador.buscarPorCodigo("E99");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
        ErrorSoftware primerAlta = analizador.obtenerPrimerPendienteAlta();
        if (primerAlta != null) {
            System.out.println("Primer pendiente ALTA: " + primerAlta.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + primerAlta);
        }
    }
}
