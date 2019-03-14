package com.telesens.academy.lesson02.home;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("java program");
        Scanner scanner = new Scanner((System.in));
        System.out.println("введіть розмір: ");
        int size = scanner.nextInt();
        for (int i =1; i<=size; i++)
            //1
            //System.out.println(String.format("%." + i + "s", "*****************"));
            //2
            System.out.println(String.format("%0" + i + "d",0).replace("0","*"));

    }
}
