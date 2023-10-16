package org.example;

public class Main {
    //Primero, tienes una interfaz ServicioNotificacion
    //Luego, tienes una implementación concreta de esta interfaz, por ejemplo, ServicioCorreo
    //Ahora, en la clase Cliente, en lugar de inyectar dependencias a través del constructor,
    //se proporcionan métodos "setter" para establecer las dependencias
    //Luego, en algún lugar de tu aplicación o contenedor de dependencias,
    //puedes crear una instancia de Cliente y establecer la dependencia a través del método "setter"
    public static void main(String[] args) {
        ServicioNotificacion servicioCorreo = new ServicioCorreo();
        Cliente cliente = new Cliente();
        cliente.setServicioNotificacion(servicioCorreo);
        cliente.enviarMensaje("destinatario@example.com", "Hola, ¿cómo estás?");
    }
}