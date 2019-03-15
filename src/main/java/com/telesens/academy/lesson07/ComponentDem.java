package com.telesens.academy.lesson07;

import com.telesens.academy.lesson07.model.Button;
import com.telesens.academy.lesson07.model.Component;
import com.telesens.academy.lesson07.model.Label;

public class ComponentDem {
    public static void main(String[] args) {
        Component[] components = new Component[]{
                new Component(),
                new Component(),
                new Button(),
                new Label(),
                new Button(),
                new Label()
        };
        Button btn = new Button();
        btn.draw();

        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof Component) {
                Component item = components[i];
            }
            components[i].draw();
        }
    }
}