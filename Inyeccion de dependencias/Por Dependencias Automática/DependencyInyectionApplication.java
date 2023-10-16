package com.example.dependencyInyection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInyectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contexto = SpringApplication.run(DependencyInyectionApplication.class, args);
		Cliente cliente = contexto.getBean(Cliente.class);
		cliente.enviarMensaje("destinatario@example.com", "Hola, ¿cómo estás?");
		contexto.close();
	}
}
