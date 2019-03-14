package com.telesens.academy.lesson08.exc;

public class ParseAbonentException extends Exception {
    String message;

    public ParseAbonentException(String empty_file) {
        this.message = empty_file;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
