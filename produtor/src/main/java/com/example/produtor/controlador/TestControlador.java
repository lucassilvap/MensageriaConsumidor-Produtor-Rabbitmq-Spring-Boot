package com.example.produtor.controlador;

import com.example.produtor.produtor.Produtor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TestControlador {

    private final AmqpTemplate amqpTemplate;
    TestControlador(AmqpTemplate amqpTemplate1){
        this.amqpTemplate = amqpTemplate1;
    }

    @GetMapping
    public String send(){
        amqpTemplate.convertAndSend("test", "routing-key-teste", "test message");
        return "ok. done";
    }
}
