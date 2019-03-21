package com.telesens.academy.lesson11;

import java.util.Random;

public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE");
    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public static Gender getRandomGender() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return MALE;
        } else return FEMALE;
    }

    public String getGender() {
        return this.gender();
    }

    public void setGender(String string) {
        this.gender = string;
    }

    private String gender() {
        this.gender = gender;
        return null;
    }


}
