package com.example.demo.cliente;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class ClienteServizi {

    public List<Cliente> getCliente(){
        return List.of(new Cliente(
                "andrea",
                "carlini",
                "bombemalax67@gmail.com",
                "333",
                "viatuma",
                LocalDate.of(2000, Month.APRIL,3),
                "rbur")
        );
    }
}
