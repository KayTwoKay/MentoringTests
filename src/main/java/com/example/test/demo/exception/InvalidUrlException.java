package com.example.test.demo.exception;

public class InvalidUrlException extends RuntimeException {
    public InvalidUrlException(String msg){
        super(msg);
    }
}
