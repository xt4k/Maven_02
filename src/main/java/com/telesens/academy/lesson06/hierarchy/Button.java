package com.telesens.academy.lesson06.hierarchy;

public class Button extends Component {
        public void draw() {
            String str = super.toString();
            System.out.println("Button "+str);//this.toString());
        }

    @Override
    public String toString() {
        return "Button item";
    }
}
