package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Programador("E01", "Ana", 1500.0, "Java");
        Empleado e2 = new Programador("E02", "Luis", 1600.0, "Python");
        Empleado e3 = new Tester("E03", "Marta", 1200.0, 40);
        Empleado e4 = new Disenador("E04", "Pedro", 1300.0, "Figma");
        Empleado e5 = new ArquitectoSoftware("E05", "Sofia", 2500.0, 6);
        EmpresaSoftware empresa = new EmpresaSoftware();
        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);
        empresa.agregarEmpleado(e3);
        empresa.agregarEmpleado(e4);
        empresa.agregarEmpleado(e5);
        System.out.println("Empleados: " + empresa.obtenerCantidadEmpleados());
        System.out.println(empresa.mostrarEmpleados());
        System.out.println("Bono programador: " + e1.calcularBono());
        System.out.println("Bono tester: " + e3.calcularBono());
        System.out.println("Bono disenador: " + e4.calcularBono());
        System.out.println("Bono arquitecto: " + e5.calcularBono());
        System.out.println("Total de bonos: " + empresa.calcularTotalBonos());
        Empleado existente = empresa.buscarEmpleado("E03");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + existente);
        }
        Empleado inexistente = empresa.buscarEmpleado("E99");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
    }
}
