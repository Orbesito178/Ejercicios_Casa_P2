package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        VersionSoftware[] versiones = new VersionSoftware[5];
        versiones[0] = new VersionSoftware("1.0", "2026-01-15", true, 40);
        versiones[1] = new VersionSoftware("1.1", "2026-02-10", true, 15);
        versiones[2] = new VersionSoftware("2.0-beta", "2026-03-20", false, 85);
        versiones[3] = new VersionSoftware("2.0", "2026-04-30", true, 60);
        versiones[4] = new VersionSoftware("2.1-beta", "2026-05-25", false, 25);
        AnalizadorVersiones analizador = new AnalizadorVersiones(versiones);
        System.out.println("Versiones:");
        System.out.println(analizador.listarVersiones());
        System.out.println("Estables: " + analizador.contarEstables());
        System.out.println("Total de cambios: " + analizador.sumarCambios());
        VersionSoftware existente = analizador.buscarVersion("2.0");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + existente);
        }
        VersionSoftware inexistente = analizador.buscarVersion("9.9");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
        VersionSoftware mayor = analizador.obtenerVersionMasCambios();
        if (mayor != null) {
            System.out.println("Mayor cambios: " + mayor.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + mayor);
        }
        System.out.println("Promedio de cambios: " + analizador.calcularPromedioCambios());
    }
}
