package com.telesens.academy.lesson04;
import java.util.Objects;

public class Subscriber { //String abonentRawString = " helen iVanova 35 f 0501234567";
    private String fName;
    private String lName;
    private int age;
    private char gender;
    private String pNumber;

    public Subscriber() {
    }

    public Subscriber(String fName, String lName, int age, char gender, String pNumber) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
        this.pNumber = pNumber;
    }

    public Subscriber(String parsedPerson) {

    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfName() {
        return fName;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Subscriber{" + "fName='" + fName + '\'' + ", pNumber='" + pNumber + '\'' + ", lName='" + lName + '\'' + ", age=" + age + ", gender=" + gender + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return Objects.equals(lName, that.lName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(lName);
    }

    public Subscriber(String fName, String pNumber, String lName, int age, char gender) {
        this.fName = fName;
        this.pNumber = pNumber;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    }
}
