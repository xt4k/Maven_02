package com.telesens.academy.lesson06.Enum;

public class EnumWeek {
    private String dayName;

    public EnumWeek(String dayName) {
        this.dayName = dayName;
    }

    public enum WeekDay {
        MONDAY("понедельник"),
        TUESDAY("вторник"),
        WEDNESDY("среда"),
        THURSDAY("четверг"),
        FRIDAY("пятница"),
        SATURDAY("суббота"),
        SUNDAY("воскресенье");

        WeekDay(Object воскресенье) {
        }
    }

}
