package com.telesens.academy.lesson06.hierarchy;

public class Label extends Component {
    public void draw() {
        String str = super.toString();
        System.out.println("Label "+str);//this.toString());
            }
}
