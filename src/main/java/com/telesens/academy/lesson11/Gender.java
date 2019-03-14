package com.telesens.academy.lesson11;

import java.util.Random;

public enum Gender {
    MALE( "MALE" ),
    FEMALE( "FEMALE" );
    private String gender;

    public String getGender() {
        return this.gender();
    }

    Gender(String gender) {
        this.gender = gender;
    }

    private String gender() {
        this.gender = gender;
        return null;
    }

    public void setGender(String string) {
        this.gender = string;
    }

    public static Gender getRandomGender() {
        Random random = new Random();
        int RandomNum = random.nextInt( 2000 );
        if (!((random.nextInt() % 2) == 0)) {
            return  MALE ;
        } else return FEMALE ;
    }


}
