package com.telesens.academy.lesson02.home;

import java.util.Scanner;

public class Hometask03a {
        public static void main(String[] args) {
            System.out.println("input first variable (a):");
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble(); // чтение вещественного числа
            System.out.println();
            System.out.println("input second variable (b):");
            double b = scanner.nextDouble(); // чтение вещественного числа
            double c =a;
            a=b;
            b=c;
            System.out.println("variable (a):" + a);
            System.out.println("variable (b):" + b);
        }
    }