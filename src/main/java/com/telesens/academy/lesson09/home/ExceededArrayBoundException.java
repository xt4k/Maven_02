package com.telesens.academy.lesson09.home;

public class ExceededArrayBoundException extends Exception {
    private String details;

    public ExceededArrayBoundException() {
        this.details = "no details";
    }

    public String getDetails() {
        return details;
    }

    public ExceededArrayBoundException(String details, int i) {
        this.details = i +"-th "+ details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
