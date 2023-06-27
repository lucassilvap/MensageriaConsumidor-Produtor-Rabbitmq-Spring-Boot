package com.example.produtor.infra;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracao {

    @Value("${queue.name}")
    private String message;

    @Bean
    public Queue queue() {
        return new org.springframework.amqp.core.Queue(message, true);
    }

}
