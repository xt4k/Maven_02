package com.telesens.academy.lesson13.Model;

public class SubscriberMySQL {
    private long subscriberId;        // уникальный идентификатор
    private String firstName;    // имя
    private String lastName;    // фамилия
    private int age;                // возраст
    private Enum gender;

    public long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Enum getGender() {
        return gender;
    }

    public void setGender(Enum gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format( "SubscriberMySQL \n subscriberId: %d \n firstName: %s\n lastName=: %s\n age: %d\n gender: %s.",
                subscriberId, firstName, lastName, age, gender );
    }
}
