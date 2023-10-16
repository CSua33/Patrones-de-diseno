hecho en springboot
Definir las dependencias:

1- Comienza por definir las clases que actuarán como dependencias y aquellas que las utilizarán. 
Por ejemplo, supongamos que tienes una interfaz ServicioNotificacion y su implementación ServicioCorreo
*La anotación @Service se utiliza para que Spring Boot detecte esta clase como un componente administrado por el contenedor de Spring.
2- Clase que utiliza la dependencia:
A continuación, crea la clase que utilizará la dependencia. Por ejemplo, una clase Cliente
*La anotación @Autowired se utiliza en el constructor para indicar a Spring Boot que debe inyectar automáticamente una instancia de ServicioNotificacion en esta clase.
3- Aplicación de Spring Boot:
En tu clase principal (la que tiene el método main), 
anota la clase con @SpringBootApplication para indicar que es una aplicación de Spring Boot y 
escanea el paquete para detectar componentes y configuraciones.
Spring Boot automáticamente escaneará los componentes en el paquete base de tu aplicación.
4- Uso en la aplicación:
Puedes usar la Inyección de Dependencias Automática en la aplicación de la siguiente manera
Aquí, obtenemos una instancia de Cliente del contexto de Spring Boot utilizando el método getBean. 
Spring Boot se encargará de crear una instancia de ServicioCorreo automáticamente y proporcionarla a la clase Cliente