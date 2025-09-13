package com.example.notification_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}

	// Simple startup test
	@Bean
	CommandLineRunner demo(NotificationManager manager) {
		return args -> manager.sendNotification("Hello, this is a test message!");
	}
}
