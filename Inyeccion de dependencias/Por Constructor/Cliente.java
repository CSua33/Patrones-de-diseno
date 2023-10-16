package org.example;

public class Cliente {
    private final ServicioCorreo servicioCorreo;

    public Cliente(ServicioCorreo servicioCorreo) {
        this.servicioCorreo = servicioCorreo;
    }

    public void enviarMensaje(String destinatario, String mensaje) {
        servicioCorreo.enviarCorreo(destinatario, mensaje);
    }
}
