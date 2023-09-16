package com.example.demo.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path ="api/clienti" )
public class ClienteController {

    private final ClienteServizi clienteServizi;
    @Autowired
    public ClienteController(ClienteServizi clienteServizi) {
        this.clienteServizi = clienteServizi;
    }

    @GetMapping
    public List<Cliente> getCliente(){
         return clienteServizi.getCliente();
    }


}
