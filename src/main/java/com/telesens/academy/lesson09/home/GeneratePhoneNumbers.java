package com.telesens.academy.lesson09.home;

import java.math.BigInteger;
import java.util.Random;

public class GeneratePhoneNumbers {
    private BigInteger bIntRandom;

    public String getPhoneNumber(String operPrefix) {
        String countryCode ="38";
        Random random = new Random();
        int randomNum = random.nextInt(9999999);
        String strRandom = String.valueOf(randomNum);
        while (strRandom.length()<7) {
            strRandom="0"+strRandom;
            //System.out.println("strRandom "+strRandom);
        }

        bIntRandom = new BigInteger(countryCode+operPrefix+strRandom);
        String generatedPhoneNumber = String.valueOf( bIntRandom );
        return generatedPhoneNumber;
    }

    public BigInteger getBigIntRandom() {
        String initialStr ="999";
        String finalStr_zero="0";
        String finalStr_five="5";

        Random random = new Random();
        int randomNum = random.nextInt(9999999);
        String strRandom = String.valueOf(randomNum);
        while (strRandom.length()<7) {
            strRandom="0"+strRandom;
            System.out.println("strRandom "+strRandom);
        }

        if (randomNum%2==0)
        bIntRandom = new BigInteger(initialStr+strRandom+finalStr_zero);
        else bIntRandom = new BigInteger(initialStr+strRandom+finalStr_five);

        return bIntRandom;
    }
}
