package com.telesens.academy.lesson05;

import com.telesens.academy.lesson08.exc.IllegalDateException;

public class DemoMain {
    public static void main(String[] args) throws IllegalDateException {
        System.out.println("lesson 05");

        DemoMain demoMain = new DemoMain();
        System.out.println("demoMain hw");
        System.out.println(demoMain.toString());

        System.out.println("------------");
        Date date = new Date();
        System.out.println("default Date is: " + date.getDate());

        CheckDayTime checkDayTime= new CheckDayTime(date);
    }
}
