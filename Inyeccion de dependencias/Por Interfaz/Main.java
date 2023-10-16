package org.example;

public class Main {
    //Supongamos que tienes una interfaz ServicioNotificacion:
    //Luego, tienes una implementación concreta de esta interfaz, por ejemplo, ServicioCorreo
    //Ahora, puedes usar la Inyección de Dependencias por Interfaz en una clase Cliente
    //Luego, en algún lugar de tu aplicación o contenedor de dependencias,en el main en este caso,
    // puedes proporcionar una implementación concreta de ServicioNotificacion.
    public static void main(String[] args) {
        ServicioNotificacion servicioCorreo = new ServicioCorreo();
        Cliente cliente = new Cliente(servicioCorreo);

        cliente.enviarMensaje("destinatario@example.com", "Hola, ¿cómo estás?");
    }
}