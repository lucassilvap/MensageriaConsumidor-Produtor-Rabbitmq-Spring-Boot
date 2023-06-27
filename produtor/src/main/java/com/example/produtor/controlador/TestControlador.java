package com.example.produtor.controlador;

import com.example.produtor.produtor.Produtor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TestControlador {

    @Autowired
    private Produtor produtor;

    @GetMapping
    public String send(){
        produtor.send("test message");
        return "ok. done";
    }
}
