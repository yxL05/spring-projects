package com.springtutorial.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		OrderService orderService = context.getBean(OrderService.class);
		orderService.placeOrder();

		// Required dependencies: inject via constructor
		// Optional dependencies: inject via setters
	}

}
