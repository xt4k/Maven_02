package com.telesens.academy.lesson06.hierarchy;

import com.telesens.academy.lesson06.hierarchy.Button;
import com.telesens.academy.lesson06.hierarchy.Component;
import com.telesens.academy.lesson06.hierarchy.Label;
import com.telesens.academy.lesson06.hierarchy.RoundButton;
import com.telesens.academy.lesson06.hierarchy.Checkbox;

public class Polymorphizm {
    public static void main(String[] args) {
        Component[] components = new Component[] {
                new Component(),
                new Label(),
                new Button(),
                new RoundButton(),
                new Component(),
                new Button() ,
                new Label (),
                new Checkbox(),
                new RoundButton(),
                new Component(),
                new Checkbox()
        };

        System.out.println("==========");
        System.out.println("Array Component[]:");
        for (int i=0; i<components.length; i++) {
            components[i].draw();
        }
        System.out.println("-------------");
        System.out.println("items of Array Component[] which are Component (exactly):");
        for (int i=0; i<components.length; i++) {
            if ((Component)components[i] instanceof Component==true)
            components[i].draw();
        }

         System.out.println("-------------");
        System.out.println("items of Array Component[] which Button (or Button child):");
        for (int i=0; i<components.length; i++) {
            if (components[i] instanceof Button==true)
                components[i].draw();
        }
        System.out.println("The End.");
        System.out.println("==========");


    }
}
