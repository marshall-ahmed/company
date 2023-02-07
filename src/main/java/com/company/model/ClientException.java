package com.company.model;

import lombok.Getter;

@Getter
public class ClientException extends RuntimeException {
    private int status;

    public ClientException(String message, int status) {
        super(message);
        this.status = status;
    }
}
