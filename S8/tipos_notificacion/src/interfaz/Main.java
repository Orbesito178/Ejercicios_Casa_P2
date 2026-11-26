package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Notificacion n1 = new NotificacionEmail("ana@demo.com", "Tu pedido fue enviado", "Pedido 1001");
        Notificacion n2 = new NotificacionSMS("Luis", "Codigo de verificacion: 4821", "0991234567");
        Notificacion n3 = new NotificacionPush("Marta", "Tienes un nuevo mensaje", "Celular de Marta");
        Notificacion n4 = new NotificacionSlack("Equipo", "Despliegue finalizado", "#desarrollo");
        Notificacion n5 = new Notificacion("Pedro", "Mensaje general");
        GestorNotificaciones gestor = new GestorNotificaciones();
        gestor.agregarNotificacion(n1);
        gestor.agregarNotificacion(n2);
        gestor.agregarNotificacion(n3);
        gestor.agregarNotificacion(n4);
        gestor.agregarNotificacion(n5);
        System.out.println("Notificaciones: " + gestor.obtenerCantidadNotificaciones());
        System.out.println(gestor.mostrarNotificaciones());
        System.out.println(n1.generarMensaje());
        System.out.println(n2.generarMensaje());
        System.out.println(n3.generarMensaje());
    }
}
