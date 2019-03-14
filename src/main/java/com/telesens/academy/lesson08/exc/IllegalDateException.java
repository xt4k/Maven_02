package com.telesens.academy.lesson08.exc;

public class IllegalDateException extends Exception {
    private String details;
    private int value;

    public IllegalDateException(String details, int value) {
        this.details = details;
        this.value = value;
    }

    public String getDetails() {
        details = details + " (" + Integer.toString(value) + " ).";
        return details;
    }
}
