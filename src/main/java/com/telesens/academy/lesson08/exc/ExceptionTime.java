package com.telesens.academy.lesson08.exc;

import com.telesens.academy.lesson05.DateTime;

public class ExceptionTime {
    public static void main(String[] args) throws IllegalTimeException {

        System.out.println("-----------");

        System.out.println("Тест работы конструктора классa DateTime c выбрасываниeм исключения IllegalTimeException");
        System.out.println("positive scenario (тест работы конструктора на позитивных кейсах)");

        DateTime dateTime = new DateTime(11,22,55);

        System.out.println("Current Date is: " + dateTime.getDate());
        System.out.println("----реализация метода checkTime(int day, int month, int year), который проверяет существование введенного времени----");
        System.out.println("positive scenario");
        System.out.println("check Date(11,12,2011)" + dateTime.checkTime(new DateTime(12, 12, 12)));
        System.out.println("check Date(11,12,2011)" + dateTime.checkTime(new DateTime(23, 1, 1)));
        System.out.println("check Date(11,12,2011)" + dateTime.checkTime(new DateTime(0, 0, 0)));
        System.out.println("check Date(11,12,2011)" + dateTime.checkTime(new DateTime(23, 59, 59)));



        System.out.println("negative scenario");
        System.out.println("-");
        try { System.out.println("check DateTime(-12, 12, 12) " + dateTime.checkTime(new DateTime(-12, 12, 12)));
        } catch (IllegalTimeException e) {
            System.out.println(e.getDetails());
            }
        try {System.out.println("check DateTime(23, 1, 60) " + dateTime.checkTime(new DateTime(23, 1, 60)));
        } catch (IllegalTimeException e) {
            System.out.println(e.getDetails());
            }
        try {System.out.println("check DateTime(24, 0, 0) " + dateTime.checkTime(new DateTime(24, 0, 0)));
        } catch (IllegalTimeException e) {
            System.out.println(e.getDetails());
            }
        try {System.out.println("check DateTime(23, 60, 0) " + dateTime.checkTime(new DateTime(23, 60, 0)));
        } catch (IllegalTimeException e) {
            System.out.println(e.getDetails());
            }
        System.out.println("-");
        try {System.out.println("check DateTime(1,0,-0) " + dateTime.checkTime(new DateTime(1,0,-00)));
        } catch (IllegalTimeException e) {
            System.out.println(e.getDetails());
            }
        try {System.out.println("check DateTime(2,-0,17) " + dateTime.checkTime(new DateTime(2,-0,17)));
        } catch (IllegalTimeException e) {
            System.out.println(e.getDetails());
            }
        System.out.println("-");

        System.out.println("--- THE END ---");


    }
}
