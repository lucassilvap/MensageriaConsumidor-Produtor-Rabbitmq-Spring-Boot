package com.example.produtor;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class ProdutorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutorApplication.class, args);
	}

}
