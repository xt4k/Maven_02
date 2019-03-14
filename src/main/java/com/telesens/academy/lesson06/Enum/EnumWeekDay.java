package com.telesens.academy.lesson06.Enum;

enum EnumWeekDay {

    MONDAY("понедельник"),
    TUESDAY("вторник"),
    WEDNESDAY("среда"),
    THURSDAY("четверг"),
    FRIDAY("пятница"),
    SATURDAY("суббота"),
    SUNDAY("воскресенье");

    private String dayName;

    EnumWeekDay (String dayName ){
        this.dayName = dayName;
    }
    String getDayName() {//currentDay.getDayName()
     return name();
    }

    EnumWeekDay getDayAfterTomorrow (int currentDay){
        EnumWeekDay nextNextDay;
        if (currentDay<=4)
            nextNextDay = values()[ordinal()+2];
        else
            nextNextDay = values()[ordinal()-5];
        return nextNextDay;
    }

    EnumWeekDay getDayBeforeYesterday (int currentDay){
        EnumWeekDay b4b4Day;
        if (currentDay<=1)
            b4b4Day = values()[ordinal()+5];
        else
            b4b4Day = values()[ordinal()-2];
        return b4b4Day;
    }
}
