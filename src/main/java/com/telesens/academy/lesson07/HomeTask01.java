package com.telesens.academy.lesson07;

import com.telesens.academy.lesson07.model.Button;
import com.telesens.academy.lesson07.model.Component;
import com.telesens.academy.lesson07.model.Label;
import com.telesens.academy.lesson07.model.VisualComponent;

public class HomeTask01 {
    public static void main(String[] args) {
        VisualComponent anonymous_lambdaVar = new VisualComponent() {
            @Override
            public void draw() {
                System.out.println("anonymous variable is here ");
            }
        };
        VisualComponent[] vComponents = new VisualComponent[]{
                new Button(),
                new Label(),
                new Component(),
                new VisualComponent() {
                    @Override
                    public void draw() {
                        System.out.println("Anonymous component");

                    }

                }, () -> System.out.println("Lambda component")};


        for (VisualComponent item : vComponents) {
            item.draw();
            item.draw3D();

        }
        System.out.println();

    }
}

