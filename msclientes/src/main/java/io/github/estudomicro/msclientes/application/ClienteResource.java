package io.github.estudomicro.msclientes.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("clientes")
public class ClienteResource {

    @GetMapping()
    public String Status() {
        return "ok";
    }
    
}
