package com.telesens.academy.lesson06.hierarchy;

public class RoundButton extends Button {
        public void draw() {
            String str = super.toString();
            System.out.println("RoundButton "+str);//this.toString());
        }
    }
