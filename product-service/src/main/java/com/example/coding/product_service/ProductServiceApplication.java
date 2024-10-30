package com.example.coding.product_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {

	
		SpringApplication.run(ProductServiceApplication.class, args);
	}
}


