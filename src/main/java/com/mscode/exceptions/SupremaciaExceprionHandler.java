package com.mscode.exceptions;


import com.mscode.entity.Regimento;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@ControllerAdvice
public class SupremaciaExceprionHandler {


    @ExceptionHandler(value = RegimentoException.class)
    public ResponseEntity<ErrorMessage> handleRegimentoException(RegimentoException e) {
        String usuario = "Erro ao processar a requisição";
        String desenvolvedor = e.getMessage();
        String status = HttpStatus.INTERNAL_SERVER_ERROR.toString();

        ErrorMessage errorMessage = new ErrorMessage(usuario, desenvolvedor, status);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
    }

}



class ErrorMessage {
    private String usuario;
    private String desenvolvedor;
    private String status;

    public ErrorMessage(String usuario, String desenvolvedor, String status) {
        super();
        this.usuario = usuario;
        this.desenvolvedor = desenvolvedor;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    public String getUsuario() {
        return usuario;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

}



