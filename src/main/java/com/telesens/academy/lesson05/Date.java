package com.telesens.academy.lesson05;

import com.telesens.academy.lesson08.exc.IllegalDateException;

public class Date  {//1a-1
    private int day;
    private int month;
    private  int year;
    private int dayMin=1;
    private int dayMax=31;
    private int monthMin=1;
    private int monthMax=12;
    private int yearMin=1600;
    private int yearMax =2100;

    public Date() {//1a-2
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }



    public void set(int day,int month,int year) throws IllegalDateException {//1a-4
        if (checkValue(day,31)&&checkValue(month,12)&&checkValue(year,1970)&&checkValue(2019,year)==true) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        else System.out.println("wrong date");
        throw new IllegalDateException("wrong date", 1);
    }

    public void set(Date setDate) {//1a-4
        if (checkValue(day,31)&&checkValue(month,12)&&checkValue(year,1970)&&checkValue(2019,year)==true) {
            this.day = setDate.day;
            this.month = setDate.month;
            this.year = setDate.year;
        }
        else System.out.println("wrong date");
    }

    public boolean checkData (Date checkedDate) throws IllegalDateException {
        if (!((checkedDate.day<=checkedDate.dayMax)))  throw new IllegalDateException("Day Date exceded",checkedDate.day);
        if (!(checkedDate.day>=checkedDate.dayMin)) throw new IllegalDateException("Day Date less than 1", checkedDate.day);
        if (!((checkedDate.month<=checkedDate.monthMax))) throw new IllegalDateException("Month Date exceded",checkedDate.month);
        if (!(checkedDate.month>=checkedDate.monthMin)) throw new IllegalDateException("Month Date less than 1",checkedDate.month);
        if (!(checkedDate.year<=checkedDate.yearMax)) throw new IllegalDateException("Year Date exceded",checkedDate.year);
        if (!(checkedDate.year>=checkedDate.yearMin)) throw new IllegalDateException("Year Date less than 1",checkedDate.year);
        return true;
    }


    public Date(Date date){//1a-5
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public boolean checkValue(int value, int boundaryValue) {//1a-6

        if (value > boundaryValue) return false;
        else return true;
    }

    public void setDay(int day) {
        if (day >31) {
            System.out.println("wrong day number");
            return;
        }
        this.day = day;
    }

    public void setMonth(int month) {
        if (month>12){
            System.out.println("wrong month number");
            return;
        }
        this.month = month;
    }

    public void setDate(int day, int month, int year) {
        this.day= day;
        this.month= month;
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public String getDate() {
        String string = "Date is: " + String.format("%02d/%02d/%d",day, month, year);
        return string;
    }

    public int getYear() {
        return year;
    }

 /*   public int getDate() {
        int date =4;
        return date;
    }*/

//1a-12-13-14
    public int nextYear() {
        this.year++;
        return this.year;
    }

    public int nextMonth() {
        this.month++;
        return this.month;
    }

    public int nextDay() {
        this.day++;
        return this.day;
    }

    public void addDays(int addDaysNum){
        this.day=this.day+addDaysNum;
    }

    @Override
    public String toString() {
        String date = String.format("Date is %02d/%02d/%d",day, month, year);
        return date;
    }
    public void printDate() {
        System.out.print(String.format("Formatted Date: %02d.%02d.%d",day, month, year));
    }
}
