package com.example.demo.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired //per fare l'iniezione (Dependency Injection)
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> getClienti() {
        return clienteService.getClienti();
    }
}
