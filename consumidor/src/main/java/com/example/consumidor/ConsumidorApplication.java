package com.example.consumidor;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class ConsumidorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumidorApplication.class, args);
	}

}
