package com.example.demo.cliente;

import com.example.demo.programmaFedelta.ProgrammaFedelta;

import java.time.LocalDate;
import java.util.List;

public class Cliente {

    private Long clienteId;
    private String nome;
    private String cognome;
    private String email;
    private String numeroCellulare;
    private String indirizzo;
    private LocalDate dataDiNascita; // Dichiarazione della variabile dataDiNascita
    private String codiceFiscale;
    private List<ProgrammaFedelta> programmiFedeltaCliente;


    public Cliente(Long clienteId, String nome, String cognome, String numCellulare, String email, String indirizzo, LocalDate dataDiNascita, String codiceFiscale, List<ProgrammaFedelta> programmiFedeltaCliente) {
        this.clienteId = clienteId;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.numeroCellulare = numCellulare;
        this.indirizzo = indirizzo;
        this.dataDiNascita = dataDiNascita;
        this.codiceFiscale = codiceFiscale;
        this.programmiFedeltaCliente = programmiFedeltaCliente;
    }


    /**
     *    Metodo senza ID perchè generato
     * @param nome
     * @param cognome
     * @param email
     * @param numeroCellulare
     * @param indirizzo
     * @param dataDiNascita
     * @param codiceFiscale
     * @param //programmiFedeltaCliente
     */
    public Cliente(String nome, String cognome, String email, String numeroCellulare, String indirizzo, LocalDate dataDiNascita, String codiceFiscale /*List<ProgrammaFedelta> programmiFedeltaCliente**/) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.numeroCellulare = numeroCellulare;
        this.indirizzo = indirizzo;
        this.dataDiNascita = dataDiNascita;
        this.codiceFiscale = codiceFiscale;
        //this.programmiFedeltaCliente = programmiFedeltaCliente;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCellulare() {
        return numeroCellulare;
    }

    public void setNumeroCellulare(String numeroCellulare) {
        this.numeroCellulare = numeroCellulare;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public List<ProgrammaFedelta> getProgrammiFedeltaCliente() {
        return programmiFedeltaCliente;
    }

    public void setProgrammiFedeltaCliente(List<ProgrammaFedelta> programmiFedeltaCliente) {
        this.programmiFedeltaCliente = programmiFedeltaCliente;
    }
}
