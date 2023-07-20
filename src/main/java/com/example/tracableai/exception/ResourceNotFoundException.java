package com.example.tracableai.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private static long seriralVersionID  = 1L;

    public ResourceNotFoundException(String message){
//        System.out.println();
        super(message);
    }
}
