package modelo;

public class AnalizadorVersiones {
    //Atributos
    private VersionSoftware[] versiones;

    public AnalizadorVersiones(VersionSoftware[] versiones) {
        this.versiones = versiones;
    }

    //Setters y getters
    public VersionSoftware[] getVersiones() {
        return versiones;
    }
    public void setVersiones(VersionSoftware[] versiones) {
        this.versiones = versiones;
    }

    //Metodos
    public String listarVersiones() {
        String resultado = "";
        for (int i = 0; i < versiones.length; i++) {
            if (versiones[i] != null) {
                resultado = resultado + versiones[i].mostrarInformacion() + "\n";
            }
        }
        return resultado;
    }

    public int contarEstables() {
        int contador = 0;
        for (int i = 0; i < versiones.length; i++) {
            if (versiones[i] != null && versiones[i].isEstable()) {
                contador++;
            }
        }
        return contador;
    }

    public VersionSoftware buscarVersion(String numero) {
        for (int i = 0; i < versiones.length; i++) {
            if (versiones[i] != null && versiones[i].getNumero().equals(numero)) {
                return versiones[i];
            }
        }
        return null;
    }

    public VersionSoftware obtenerVersionMasCambios() {
        VersionSoftware resultado = null;
        for (int i = 0; i < versiones.length; i++) {
            if (versiones[i] != null) {
                if (resultado == null || versiones[i].getCantidadCambios() > resultado.getCantidadCambios()) {
                    resultado = versiones[i];
                }
            }
        }
        return resultado;
    }

    public int sumarCambios() {
        int suma = 0;
        for (int i = 0; i < versiones.length; i++) {
            if (versiones[i] != null) {
                suma = suma + versiones[i].getCantidadCambios();
            }
        }
        return suma;
    }

    public double calcularPromedioCambios() {
        int cantidad = 0;
        for (int i = 0; i < versiones.length; i++) {
            if (versiones[i] != null) {
                cantidad++;
            }
        }
        if (cantidad == 0) {
            return 0;
        }
        return (double) sumarCambios() / cantidad;
    }
}
