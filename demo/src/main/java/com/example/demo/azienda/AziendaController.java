package com.example.demo.azienda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/azienda")
public class AziendaController {

    private final AziendaService aziendaService;
    @Autowired
    public AziendaController(AziendaService aziendaService) {
        this.aziendaService = aziendaService;
    }
    public List<Azienda> getAziende(){
        return aziendaService.getAziende();
    }


}
