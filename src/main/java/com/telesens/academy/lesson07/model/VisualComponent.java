package com.telesens.academy.lesson07.model;

public interface VisualComponent {
    void draw();
    default void draw3D()
    {};
}
