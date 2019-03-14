package com.telesens.academy.lesson06.hierarchy;

public class Checkbox extends Button {
    public void draw() {
        String str = super.toString();
        System.out.println("Checkbox "+str);//this.toString());
    }
}