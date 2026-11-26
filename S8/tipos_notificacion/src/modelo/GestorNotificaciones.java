package modelo;

import java.util.ArrayList;

public class GestorNotificaciones {
    //Atributos
    private ArrayList<Notificacion> notificaciones;

    public GestorNotificaciones() {
        notificaciones = new ArrayList<>();
    }

    //Metodos
    public void agregarNotificacion(Notificacion notificacion) {
        notificaciones.add(notificacion);
    }

    public int obtenerCantidadNotificaciones() {
        return notificaciones.size();
    }

    public String mostrarNotificaciones() {
        String lista = "";
        for (Notificacion n : notificaciones) {
            lista = lista + n.generarMensaje() + "\n";
        }
        return lista;
    }
}
