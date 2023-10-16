package org.example;

public class ServicioCorreo implements ServicioNotificacion {
    @Override
    public void enviarNotificacion(String destinatario, String mensaje) {
        // Código para enviar una notificación por correo
        System.out.println("Destinatario: " + destinatario + " Mensaje: " + mensaje);
    }
}
