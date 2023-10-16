package com.example.dependencyInyection;

import org.springframework.stereotype.Service;

@Service
public class ServicioCorreo implements ServicioNotificacion {
    @Override
    public void enviarNotificacion(String destinatario, String mensaje) {
        // Implementación para enviar una notificación por correo
        System.out.println("Destinatario: " + destinatario + " Mensaje: " + mensaje);
    }
}
