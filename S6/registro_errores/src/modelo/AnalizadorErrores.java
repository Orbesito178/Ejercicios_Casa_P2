package modelo;

public class AnalizadorErrores {
    //Atributos
    private ErrorSoftware[] errores;

    public AnalizadorErrores(ErrorSoftware[] errores) {
        this.errores = errores;
    }

    //Setters y getters
    public ErrorSoftware[] getErrores() {
        return errores;
    }
    public void setErrores(ErrorSoftware[] errores) {
        this.errores = errores;
    }

    //Metodos
    public String listarErrores() {
        String resultado = "";
        for (int i = 0; i < errores.length; i++) {
            if (errores[i] != null) {
                resultado = resultado + errores[i].mostrarInformacion() + "\n";
            }
        }
        return resultado;
    }

    public int contarPendientes() {
        int contador = 0;
        for (int i = 0; i < errores.length; i++) {
            if (errores[i] != null && errores[i].isResuelto() == false) {
                contador++;
            }
        }
        return contador;
    }

    public ErrorSoftware buscarPorCodigo(String codigo) {
        for (int i = 0; i < errores.length; i++) {
            if (errores[i] != null && errores[i].getCodigo().equals(codigo)) {
                return errores[i];
            }
        }
        return null;
    }

    public String listarPorSeveridad(String severidad) {
        String resultado = "";
        for (int i = 0; i < errores.length; i++) {
            if (errores[i] != null && errores[i].getSeveridad().equals(severidad)) {
                resultado = resultado + errores[i].mostrarInformacion() + "\n";
            }
        }
        return resultado;
    }

    public int contarPorSeveridad(String severidad) {
        int contador = 0;
        for (int i = 0; i < errores.length; i++) {
            if (errores[i] != null && errores[i].getSeveridad().equals(severidad)) {
                contador++;
            }
        }
        return contador;
    }

    public ErrorSoftware obtenerPrimerPendienteAlta() {
        for (int i = 0; i < errores.length; i++) {
            if (errores[i] != null && errores[i].isResuelto() == false && errores[i].getSeveridad().equals("ALTA")) {
                return errores[i];
            }
        }
        return null;
    }
}
