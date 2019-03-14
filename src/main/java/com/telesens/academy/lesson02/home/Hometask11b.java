package com.telesens.academy.lesson02.home;

public class Hometask11b {
    public static void main(String[] args) {
        int array[] = {3, 4, 9, 10, 34, 239, 8, 0, -3, 19, 1};
        int i = 0;
        while (i<array.length) {
            System.out.println(String.format("item array[%s] =%s ",i,array[i]));
            i++;
        }

        System.out.println("task with WHILE oper");
    }
}
