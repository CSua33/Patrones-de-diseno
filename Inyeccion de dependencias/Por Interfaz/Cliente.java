package org.example;

public class Cliente {
    private final ServicioNotificacion servicioNotificacion;

    public Cliente(ServicioNotificacion servicioNotificacion) {
        this.servicioNotificacion = servicioNotificacion;
    }

    public void enviarMensaje(String destinatario, String mensaje) {
        servicioNotificacion.enviarNotificacion(destinatario, mensaje);
    }
}
