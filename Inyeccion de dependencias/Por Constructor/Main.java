package org.example;
//Supongamos que tienes una clase Cliente que necesita una dependencia de un servicio de correo, y quieres utilizar la Inyección de Dependencias por Constructor
//Luego, en otro lugar del código o en tu contenedor de dependencias, puedes crear una instancia de ServicioCorreo y pasarla al constructor de Cliente
public class Main {
    public static void main(String[] args) {

        ServicioCorreo servicioCorreo = new ServicioCorreo();
        Cliente cliente = new Cliente(servicioCorreo);

        cliente.enviarMensaje("destinatario@example.com", "Hola, ¿cómo estás?");
    }
}