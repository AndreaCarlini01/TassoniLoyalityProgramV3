package com.example.demo.azienda;

import com.example.demo.exception.CustomResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class AziendaService {

    private final AziendaRepository aziendaRepository;
    @Autowired
    public AziendaService(AziendaRepository aziendaRepository) {
        this.aziendaRepository = aziendaRepository;
    }

    public void deleteAzienda(Long idAzienda) {
       boolean exist= aziendaRepository.existsById(idAzienda);
       if(!exist){
           throw new CustomResourceNotFoundException("L'azienda com id"+ idAzienda + "non è presente");

       }
       else{
           aziendaRepository.deleteById(idAzienda);
       }

    }

    public List<Azienda> getAziende() {
        return aziendaRepository.findAll();
    }
}
