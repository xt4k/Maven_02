package com.telesens.academy.lesson10.home;

import com.telesens.academy.lesson04.Subscriber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeCollection {
    public static void main(String[] args) {
        String[] arrayNames = new String[]{"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max"};
        List<Subscriber> listNames = new ArrayList(Arrays.asList(arrayNames));


        System.out.println(listNames);
    }
}
