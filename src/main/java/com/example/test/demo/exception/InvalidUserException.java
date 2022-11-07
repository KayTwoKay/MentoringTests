package com.example.test.demo.exception;

public class InvalidUserException extends RuntimeException {
    public InvalidUserException(String msg){
        super(msg);
    }
}
