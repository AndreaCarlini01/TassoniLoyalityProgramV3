package com.example.demo.azienda;

import com.example.demo.programmaFedelta.ProgrammaFedelta;

import java.util.List;

public class Azienda {
    private long idAzienda;
    private String indirizzoAzienda;
    private String nomeAzienda;
    private int contattoAzienda;
    private List<ProgrammaFedelta> programmiFedeltàAzienda;

    public Azienda(Long idAzienda, String indirizzoAzienda, String nomeAzienda, int ContattoAzienda, List<ProgrammaFedelta> programmiFedeltàAzienda){
        this.idAzienda=idAzienda;
        this.indirizzoAzienda=indirizzoAzienda;
        this.nomeAzienda=nomeAzienda;
        this.contattoAzienda=ContattoAzienda;
        this.programmiFedeltàAzienda=programmiFedeltàAzienda;
    }

    public Azienda(String indirizzoAzienda, String nomeAzienda, int contattoAzienda, List<ProgrammaFedelta> programmiFedeltàAzienda) {
        this.indirizzoAzienda = indirizzoAzienda;
        this.nomeAzienda = nomeAzienda;
        this.contattoAzienda = contattoAzienda;
        this.programmiFedeltàAzienda = programmiFedeltàAzienda;
    }

    public void setIdAzienda(long idAzienda) {
        this.idAzienda = idAzienda;
    }

    public void setIndirizzoAzienda(String indirizzoAzienda) {
        this.indirizzoAzienda = indirizzoAzienda;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    public void setContattoAzienda(int contattoAzienda) {
        this.contattoAzienda = contattoAzienda;
    }

    public void setProgrammiFedeltàAzienda(List<ProgrammaFedelta> programmiFedeltàAzienda) {
        this.programmiFedeltàAzienda = programmiFedeltàAzienda;
    }

    public String getIndirizzoAzienda() {
        return indirizzoAzienda;
    }

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public int getContattoAzienda() {
        return contattoAzienda;
    }

    public List<ProgrammaFedelta> getProgrammiFedeltàAzienda() {
        return programmiFedeltàAzienda;
    }

    public long getIdAzienda() {
        return idAzienda;
    }
}
