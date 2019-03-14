package com.telesens.academy.lesson08.exc;

public class IllegalTimeException extends Exception {
    private String details;
    private int value;

    public IllegalTimeException (String string, int value) {
        this.details = string;
        this.value= value;
    }

    public String getDetails() {
        details = details + " (" + Integer.toString(value) + " ).";
        return details;
    }

}
