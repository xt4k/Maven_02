package com.telesens.academy.lesson05;

public class ExtendedTime extends DateTime {//1c-0
    private int extDay;
    private int extMonth;
    private int extYear;
    private int extHour;
    private int extMin;
    private int extSec;
    private int mS;

    ExtendedTime( int mS) {
        super(2,1,1970,0, 0, 0);
        this.mS = 1;
    }

    ExtendedTime(int extDay, int extMonth, int extYear, int extHour, int extMin, int extSec, int mS) {
        super(extDay, extMonth, extYear, extHour, extMin, extSec);
        this.mS = mS;
    }

    ExtendedTime( int extHour, int extMin, int extSec, int mS) {
        super(2,1,1970, extHour, extMin, extSec);
        this.mS = mS;
    }

    public void setmS(int mS) {
        this.mS = mS;
    }
    @Override
    public String toString() {
        String extTodayDateTime = String.format(super.toString()+ " ExtendedTime is: %03d", this.mS);
        return extTodayDateTime;
    }





    public int getExtDay() {
        return extDay;
    }

    public void setExtDay(int extDay) {
        this.extDay = extDay;
    }

    public int getExtMonth() {
        return extMonth;
    }

    public void setExtMonth(int extMonth) {
        this.extMonth = extMonth;
    }

    public int getExtYear() {
        return extYear;
    }

    public void setExtYear(int extYear) {
        this.extYear = extYear;
    }

    public int getExtHour() {
        return extHour;
    }

    public void setExtHour(int extHour) {
        super.setHours(extHour);
    }

    public int getExtMin() {
        return extMin;
    }

    public void setExtMin(int extMin) {
        this.extMin = extMin;
    }

    public int getExtSec() {
        return extSec;
    }

    public void setExtSec(int extSec) {
        this.extSec = extSec;
    }

    public void setExtDateTime(int hours,int minutes, int seconds, int mS) {
        super.setDateTime(hours,minutes,seconds);
        this.mS = mS;
    }

    public boolean setFullDateTime(int day, int month, int year, int hours, int minutes, int seconds, int mS) {
        super.setFullDateTime(day,month,year,hours,minutes,seconds);
        this.mS=mS;
        return true;
    }

    public void print() {
        super.printDateTime();
        System.out.println(this);
    }


}