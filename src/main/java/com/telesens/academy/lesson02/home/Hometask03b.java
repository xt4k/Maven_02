package com.telesens.academy.lesson02.home;

import java.util.Scanner;

public class Hometask03b {
    public static void main(String[] args) {
        System.out.print("input first variable (int a): ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // чтение int числа
        System.out.println();
        System.out.print("input second variable (int b): ");
        int b = scanner.nextInt(); // чтение int числа
        System.out.println();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("variable a: " + a);
        System.out.println("variable b: " + b);
    }
}
