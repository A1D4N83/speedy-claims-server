package com.alstate.speedyclaimsserver.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ClaimNotFound extends RuntimeException {

    public ClaimNotFound(String message) {
        super(message);
    }

}