package com.telesens.academy.lesson02.home;

import java.util.Scanner;

public class Hometask07 {

    public static void main(String[] args) {
        System.out.print("input first variable (int q): ");
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); // чтение int числа
        System.out.println();
        System.out.print("input second variable (int w): ");
        int w = scanner.nextInt(); // чтение int числа
        System.out.println();
        System.out.println(String.format("q = %d, w = %d,  q/w = %d.", q, w, q/w));
        System.out.print(String.format("q = %d, w = %d,  q%%w = %d ", q, w, q%w));
        System.out.println();
    }




}
