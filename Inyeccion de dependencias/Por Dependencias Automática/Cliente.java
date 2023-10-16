package com.example.dependencyInyection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cliente {
    private final ServicioNotificacion servicioNotificacion;

    @Autowired
    public Cliente(ServicioNotificacion servicioNotificacion) {
        this.servicioNotificacion = servicioNotificacion;
    }

    public void enviarMensaje(String destinatario, String mensaje) {
        servicioNotificacion.enviarNotificacion(destinatario, mensaje);
    }
}
