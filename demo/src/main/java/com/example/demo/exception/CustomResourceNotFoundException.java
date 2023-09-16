package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.io.Serial;
@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * Crea una nuova eccezione per risorsa non trovata con un messaggio personalizzato.
     *
     * @param message Il messaggio di errore personalizzato.
     */
    public CustomResourceNotFoundException(String message) {
        super(message);
    }
}
