package com.telesens.academy.lesson08.exc;

import com.telesens.academy.lesson05.Date;

public class ExceptionDate {
    public static void main(String[] args) throws IllegalDateException {

        Date date3 = new Date(24, 2, 2019);
        System.out.println("constructed date is: " + date3.getDate());
        System.out.println("-----------");

        System.out.println("-----------");
        System.out.println("Current Date is: " + date3.getDate());
        System.out.println("Тест работы конструктора классa Date c выбрасываниeм исключения IllegalDateException");
         System.out.println("positive scenario (тест работы конструктора на позитивных кейсах)");

        System.out.println("check Date(11,12,2011)" + date3.checkData(new Date(11, 12, 2011)));
        System.out.println("check Date(17, 2, 2019)" + date3.checkData(new Date(17, 2, 2019)));
        System.out.println("check Date(29, 2, 2020)" + date3.checkData(new Date(29, 2, 2020)));
        System.out.println("check Date(31, 1, 1999)" + date3.checkData(new Date(31, 1, 1999)));
        System.out.println("check Date(13, 6, 1681)" + date3.checkData(new Date(13, 6, 1681)));

        System.out.println("negative scenario  (попытка создать некорректную (не существующую дату))");

        System.out.println("-");
        try {
            System.out.println(" check Date(0,12,2011) " + date3.checkData(new Date(0, 12, 2011)));
        } catch (IllegalDateException e) {
            System.out.println(e.getDetails());
        }
        try {
            System.out.println(" check Date(-1,12,2011) " + date3.checkData(new Date(-1, 12, 2011)));
        } catch (IllegalDateException e) {
            System.out.println(e.getDetails());
        }
        try {
            System.out.println(" check Date(32, 12, 2011) " + date3.checkData(new Date(32, 12, 2011)));
        } catch (IllegalDateException e) {
            System.out.println(e.getDetails());
        }

        try {
            System.out.println(" check Date(21, 0, 2011) " + date3.checkData(new Date(21, 0, 2011)));
        } catch (IllegalDateException e) {
            System.out.println(e.getDetails());
        }
        try {
            System.out.println(" check Date(31, 1, 1011) " + date3.checkData(new Date(31, 1, 1011)));
        } catch (IllegalDateException e) {
            System.out.println(e.getDetails());
        }
        try {
            System.out.println(" check Date(23, 12, 3011) " + date3.checkData(new Date(23, 12, 3011)));
        } catch (IllegalDateException e) {
            System.out.println(e.getDetails());
        }
        System.out.println("-");
        try {
            System.out.println(" check Date(0, 12, 2011) " + date3.checkData(new Date(0, 12, 2011)));
        } catch (IllegalDateException e) {
            System.out.println(e.getDetails());
        }
        try {
            System.out.println(" check Date(-1, 12, 2011) " + date3.checkData(new Date(-1, 12, 2011)));
        } catch (IllegalDateException e) {
            System.out.println(e.getDetails());
        }
        try {
            System.out.println(" check Date(0, 06, 1681) " + date3.checkData(new Date(0, 06, 1681)));
        } catch (IllegalDateException e) {
            System.out.println(e.getDetails());
        }
        try {
            System.out.println(" check Date(21, 0, 2011) " + date3.checkData(new Date(21, 0, 2011)));
        } catch (IllegalDateException e) {
            System.out.println(e.getDetails());
        }
        try {
            System.out.println(" check Date(21, 13, 2011) " + date3.checkData(new Date(21, 13, 2011)));
        } catch (IllegalDateException e) {
            System.out.println(e.getDetails());
        }
        System.out.println("========");
    }
}
