package com.example.coding.order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {

		boolean isPortSet = System.getProperty("server.port") != null || System.getenv("SERVER_PORT") != null;
        
        if (!isPortSet) {
            System.setProperty("server.port", "8081"); // Default port for the first instance
        }

		SpringApplication.run(OrderServiceApplication.class, args);
	}


}

@Component
class RandomPortCustomizer implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {

    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        // Assign a random port if not explicitly set
        if ("0".equals(System.getProperty("server.port"))) {
            factory.setPort(0);
        }
    }
}
