package com.telesens.academy.lesson05;

import com.telesens.academy.lesson08.exc.IllegalDateException;

public class CheckDayTime {
    public CheckDayTime(Date date) throws IllegalDateException {

        System.out.println("----ПРОВЕРКА-------");
        date = new Date();
        System.out.println("-24_feb-2019----реализация конструктора: по умолчанию -------");
        System.out.println("default date is: " + date.getDate());
        System.out.println("default day is: " + date.getDay());
        System.out.println("default month is: " + date.getMonth());
        System.out.println(("default year is: " + date.getYear()));

        System.out.println("-----------");
        System.out.println("-24_feb-2019----реализация конструктора: все поля  -------");
        Date date2 = new Date(24, 2, 2019);
        System.out.println("constructed date is: " + date2.getDate());
        System.out.println("-----------");

        System.out.println("-24_feb-2019----реализация конструктора: копирования  -------");
        Date date3 = new Date();
        System.out.println("again default date is: " + date3.getDate());
        date3.setDate(date2.getDay(), date2.getMonth(), date2.getYear());
        System.out.println("Copied Date is: " + date3.getDate());
        System.out.println("-----------");

        System.out.println("-24_feb-2019----реализация методов: getDay(); getMonth(); getYear();  -------");
        System.out.println("Current Date is: " + date3.getDate());
        date3.setDay(date3.getDay() - 1);
        System.out.println("previous Day is: " + date3.getDay());
        date3.setMonth(date3.getMonth() - 1);
        System.out.println("previous Month is: " + date3.getMonth());
        date3.setYear(date3.getYear() - 1);
        System.out.println("previous Year is: " + date3.getYear());
        System.out.println("-----------");

        System.out.println("-24_feb-2019----реализация методов: nextDay(); nextMonth(); nextYear();  -------");
        System.out.println("Current Date is: " + date3.getDate());
        System.out.print(String.format("nextDay is: %s ", date3.nextDay()));
        System.out.print(String.format("nextMonth is: %s ", date3.nextMonth()));
        System.out.println(String.format("nextYear is: %s ", date3.nextYear()));
        System.out.println("-----------");

        System.out.println("-24_feb-2019----реализация метод addDays(int days) который добавляет кол-во дней ''days (3) к текущей дате -------");
        System.out.println(String.format("OldDays is: %s", date3.getDay()));
        date3.addDays(3);
        System.out.println(String.format("NewDays is: %s", date3.getDay()));


        System.out.println("-----------");
        System.out.println("Current Date is: " + date3.getDate());
        System.out.println("----реализация метод checkData(int day, int month, int year), который проверяет существование введенной даты----");
        System.out.println("positive scenario");
        System.out.println("check Date(11,12,2011)" + date3.checkData(new Date(11, 12, 2011)));

        System.out.println("negative scenario");
        System.out.println("-");
        System.out.println("check Date(0,12,2011) " + date3.checkData(new Date(0, 12, 2011)));
        //System.out.println("check Date(-1,12,2011) " + date3.checkData(new Date(-1,12,2011)));
        System.out.println("check Date(32,12,2011) " + date3.checkData(new Date(32, 12, 2011)));
        System.out.println("-");
        System.out.println("check Date(21,0,2011) " + date3.checkData(new Date(21, 0, 2011)));
        System.out.println("check Date(21,13,2011) " + date3.checkData(new Date(21, 13, 2011)));
        System.out.println("-");
        System.out.println("check Date(31,1,1011) " + date3.checkData(new Date(31, 1, 1011)));
        System.out.println("check Date(31,12,3011) " + date3.checkData(new Date(23, 12, 3011)));

        System.out.println("-----------");
        System.out.println("Current Date is: " + date3.getDate());
        System.out.println("----переопределение метод toString()который возвратит строковое представление даты: (25.01.2017)");
        System.out.println(String.format("toString date: %s", date3.toString()));

        System.out.println("-----------");
        System.out.println("Current Date is: " + date3.getDate());
        System.out.println("----реализация методa printData() который выводит дату в форматированном виде, (напр. 25.01.2017)");
        date3.printDate();

        System.out.println("-----------");
        System.out.println("Datetime part");
        DateTime dateTime = new DateTime(0, 0, 0);
        System.out.print("default Date (DateTime(0, 0, 0)) is: " + date);
        System.out.println(". default DateTime is: " + dateTime.getDateTime()); // 01/01/1970 00:00:00
        System.out.println("-new daytime-----------");
        DateTime dateTime2 = new DateTime(10, 2, 2019);
        System.out.println(dateTime2.getDateTime());

        System.out.println("------------");
        DateTime dateTimeCurent = new DateTime(11, 02, 2019, 20, 50, 15);        //11/02/2019 20:50:15
        System.out.println("Current DateTime is: " + dateTimeCurent);

        System.out.println("Реализaция метода printTime(), который отображает на консоле полное время в формате: 15:05:35");
        dateTimeCurent.printTime();

        System.out.println("реализaция перегруженного метода printTime(boolean isTimeFormat12)");
        dateTimeCurent.printTime(true);
        //assert dateTimeCurent.toString().equals("11/02/2019 20:50:15");
        // System.out.println(dateTime); // 11/02/2019 20:50:15

        System.out.println("реализaция методa printDateTime() который отображает время и дату:");
        dateTimeCurent.printDateTime();
        System.out.println("--------------");

        System.out.println("реализaция перегруженного метода printDateTime(boolean isTimeFormat12):");
        dateTimeCurent.printDateTime(true);
        System.out.println("-  -");
        dateTimeCurent.printDateTime(false);
        System.out.println("--------------");


        System.out.println("Реализaция  класса ExtendedTime - наследника класса Time с дополнительным private полем  миллисекунды:");

        ExtendedTime extendedTime = new ExtendedTime(16, 2, 2019, 16, 42, 4, 231);
        System.out.println("ExtendedTime.print: ");
        extendedTime.print();
        System.out.println("ExtendedTime.toString: "+ extendedTime.toString());

        System.out.println("=========");
        extendedTime.setExtHour(14);
        System.out.println("1. Updated ExtendedTime (14 hours): " + extendedTime.toString());

        System.out.println("=========");
        extendedTime.setExtDateTime(22, 33, 44,555);
        System.out.println("2. Updated ExtendedTime (22:33:44.555): " + extendedTime.toString());

        System.out.println("=========");
        extendedTime.setFullDateTime(7, 5, 1990, 21, 34, 54, 77);
        System.out.println("3. Updated ExtendedTime (07/05/1990 21:34:54.077): " + extendedTime.toString());
        System.out.println("=========");


    }
}


