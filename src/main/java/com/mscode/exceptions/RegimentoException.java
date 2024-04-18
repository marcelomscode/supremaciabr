package com.mscode.exceptions;

import java.util.List;

public class RegimentoException extends RuntimeException{

    public RegimentoException(String message) {
        super(message);
    }

    public RegimentoException(){

    }

    public RegimentoException(List<String> message) {
        super(message.toString());
    }
}
