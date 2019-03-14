package com.telesens.academy.lesson09.home;

public class ArrayIndexOutOfBoundsException extends ExceededArrayBoundException {
    private String details;

    public ArrayIndexOutOfBoundsException() {
        this.details = "no details";
    }

    public String getDetails() {
        return details;
    }

    public ArrayIndexOutOfBoundsException(String details, int i) {
        this.details = i +"-th is a "+ details;
        System.out.println(this.details);
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
