package com.example.demo.azienda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AziendaService {

    private final AziendaRepository aziendaRepository;
    @Autowired
    public AziendaService(AziendaRepository aziendaRepository) {
        this.aziendaRepository = aziendaRepository;
    }

    public List<Azienda> getAziende() {
        return aziendaRepository.findAll();
    }
}
