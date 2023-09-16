package com.example.demo.programmaFedelta;

import com.example.demo.azienda.Azienda;

import java.util.Objects;

public class ProgrammaFedelta {
    private Azienda azienda;
    private String nomeProgrammaFedelta;
    private Long AziendaId;

    /**
     * Costruttore senza id perchè autogenerato
     * @param azienda nome dell'azienda
     * @param nomeProgrammaFedelta nome del programma fedeltà offerta
     */
    public ProgrammaFedelta(Azienda azienda,String nomeProgrammaFedelta) {

        this.azienda=azienda;
        this.nomeProgrammaFedelta=nomeProgrammaFedelta;


    }

    /**
     * Costruttore contentente l'id
     * @param azienda nome dell'azienda
     * @param nomeProgrammaFedelta nome del programma fedeltà offera
     * @param idAzienda id dell'azienda
     */
    public ProgrammaFedelta(Azienda azienda,String nomeProgrammaFedelta,Long idAzienda) {

        this.azienda=azienda;
        this.nomeProgrammaFedelta=nomeProgrammaFedelta;
        this.AziendaId=idAzienda;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProgrammaFedelta that = (ProgrammaFedelta) o;

        // Verifica che i programmi abbiano lo stesso AziendaId
        return AziendaId != null ? AziendaId.equals(that.AziendaId) : that.AziendaId == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(AziendaId);

    }
}


