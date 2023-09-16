package com.example.demo.cliente;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ClienteService {

    @GetMapping
    public List<Cliente> getClienti() {
        return List.of(
                new Cliente(1L, "Claudio", "Cozzolino", "claudio@gmail.com", "888888888", "Via dei Pini Verdi 22", LocalDate.of(2000, Month.OCTOBER, 11), "CZZCLD")
        );
    }
}
