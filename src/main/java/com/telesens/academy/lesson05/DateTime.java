package com.telesens.academy.lesson05;

import com.telesens.academy.lesson08.exc.IllegalTimeException;

public class DateTime extends Date {
    private int hours;
    private int minutes;
    private int seconds;

    public DateTime(int day, int month, int year, int hours, int minutes, int seconds) {
        super(day, month, year);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public DateTime(int extHour, int extMin, int extSec) {
        super();
        this.hours = extHour;
        this.minutes= extMin;
        this.seconds = extSec;
    }

    public DateTime() {
        super();
        this.hours =0;
        this.minutes=0;
        this.seconds=0;
    }

    public String getDateTime() {
        String string = super.getDate();
        string = string +". DayTime is: " + this.toString();
                //Integer.parseInt(this.hours) + Integer.parseInt(this.minutes) + Integer.parseInt(this.seconds);
        return string;
    }

    public boolean setDateTime(int hours, int minutes, int seconds) {
        this.hours=hours;
        this.minutes =minutes;
        this.seconds= seconds;
        return true;
    }

    public boolean setFullDateTime(int day, int month, int year,int hours, int minutes, int seconds) {
        super.setDate(day,month, year);
        this.hours=hours;
        this.minutes =minutes;
        this.seconds= seconds;
        return true;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        // 01/01/1970 00:00:00
        String dateFormat = super.toString();
        String dateTimeFormat = String.format(", DateTime is %02d:%02d:%02d",this.hours,this.minutes,this.seconds);
        return dateFormat+ dateTimeFormat ;
    }

    public String checkTime (DateTime dayTime) throws IllegalTimeException {
        if (dayTime.getHours()<0)  throw new IllegalTimeException("Hours number lower than 0: ",dayTime.getHours());
        if (dayTime.getHours()>23)  throw new IllegalTimeException("Hours number exceeded 23: ",dayTime.getHours());
        if (dayTime.getMinutes()<0)  throw new IllegalTimeException("Minutes  number lower than 0: ",dayTime.getMinutes());
        if (dayTime.getMinutes()>59)  throw new IllegalTimeException("Minutes number exceeded 59: ",dayTime.getMinutes());
        if (dayTime.getSeconds()<0)  throw new IllegalTimeException("Minutes  number lower than 0: ",dayTime.getSeconds());
        if (dayTime.getSeconds()>59)  throw new IllegalTimeException("Minutes number exceeded 59: ",dayTime.getSeconds());

        return "Correct DayTime.";
    }

    public void nextHour(){
        this.hours++;
        if (this.hours==24) {
            super.nextDay();
            hours=0;
        }
    }
    public void nextMinutes(){
        this.minutes++;
        if (this.minutes==60) {
            this.nextHour();
            minutes=0;
        }
    }
    public void nextSeconds() {
        this.seconds++;
        if (this.seconds == 60) {
            this.nextMinutes();
            seconds = 0;
        }
    }

    public void addSeconds(int addedSec) {
        this.seconds = +addedSec;
    }

    public void printTime () {
        System.out.println(String.format(" %02d:%02d:%02d",this.hours,this.minutes,this.seconds));
    }

    public void printTime (boolean isTimeFormat12) {
        if (!isTimeFormat12) this.printTime();
        else {
            this.hours = this.hours%12;
            System.out.println(String.format(" %02d:%02d:%02d pm",this.hours,this.minutes,this.seconds));
        }
    }
    public void printDateTime () {
        super.printDate();
        this.printTime();
    }

    public void printDateTime (boolean is12hFormat) {
        super.printDate();
        if (is12hFormat)
        this.printTime(true);
        else  this.printTime(false);
    }




}