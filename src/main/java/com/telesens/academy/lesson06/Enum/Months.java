package com.telesens.academy.lesson06.Enum;

public enum Months {
    JANUARY(31, "WINTER","зима","январь"),
    FEBRUARY(28, "WINTER", "зима", "февраль"),
    MARCH(31, "SPRING", "весна", "март"),
    APRIL(30, "SPRING", "весна", "апрель"),
    MAY(31, "SPRING", "весна", "май"),
    JUNE(30, "SUMMER", "лето", "июнь"),
    JULY(31, "SUMMER", "лето", "июль"),
    AUGUST(31, "SUMMER", "лето", "август"),
    SEPTEMBER(30, "AUTUMN", "осень", "сентябрь"),
    OCTOVBER(31, "AUTUMN", "осень", "октябрь"),
    NOVEMBER(30, "AUTUMN", "осень", "ноябрь"),
    DECEMBER(31, "WINTER", "зима", "декабрь");

    private int dayNumber;
    private String season;
    private String seasonRus;
    private  String monthsRus;
    Months(int dayNumber, String season, String seasonRus, String monthRus){
        this.dayNumber = dayNumber;
        this.season = season;
        this.seasonRus = seasonRus;
        this.monthsRus = monthRus;
    }

    public int getDayNumber(Months months) {
        return months.dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public String getSeason(Months months) {
        return months.season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSeasonRus(Months months) {
        return seasonRus;
    }

    public void setSeasonRus(String seasonRus) {
        this.seasonRus = seasonRus;
    }

    public String getMonthsRus(Months months) {
        return monthsRus;
    }

    public void setMonthsRus(String monthsRus) {
        this.monthsRus = monthsRus;
    }

    public Months getNextMonthsRus(Months months) {
        if (months.ordinal()==11)
        return values()[0];
        else
            return  values()[months.ordinal()+1];
    }
    public Months getPreMonthsRus(Months months) {
        if (months.ordinal()==0)
            return values()[11];
        else
            return  values()[months.ordinal()-1];
    }


    public  String rusToString() {
        return String.format("Сезон:  %s:  Месяц %s состоит из  %s дней",this.seasonRus, this.monthsRus , this.dayNumber);

    }
    @Override
    public String toString() {
        return String.format("Month:  %s (EN) ( %s (RUS)) has %s day, in %s season (EN) (or %s (RUS))", this.name(), this.monthsRus , this.dayNumber, this.season, this.seasonRus);
    }
}