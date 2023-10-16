package org.example;

public class Cliente {
    private ServicioNotificacion servicioNotificacion;

    public void setServicioNotificacion(ServicioNotificacion servicioNotificacion) {
        this.servicioNotificacion = servicioNotificacion;
    }

    public void enviarMensaje(String destinatario, String mensaje) {
        if (servicioNotificacion != null) {
            servicioNotificacion.enviarNotificacion(destinatario, mensaje);
        } else {
            // Manejar el caso en que el servicio de notificación no está configurado
        }
    }
}
