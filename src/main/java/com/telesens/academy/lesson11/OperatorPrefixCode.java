package com.telesens.academy.lesson11;

import java.util.Random;

public class OperatorPrefixCode {
    private String prefixCode;
    private String operName;

    public String getPrefixCode() {
        return prefixCode;
    }

    public String getOperName() {
        return operName;
    }

    public void setRandom() {
        int operCount = 13;
        Random random = new Random();
        int operatorNum = (int) Math.round( Math.abs( random.nextGaussian() * (operCount + 1) / 2 ) );
        while ((operatorNum > operCount) | (operatorNum <= 0))
            operatorNum = (int) Math.round( Math.abs( random.nextGaussian() * (operCount + 1) / 2 ) );

        switch (operatorNum) {
            case (1):
                this.prefixCode = "088";
                this.operName = "UkrTeleCom";
                break;
            case (2):
                this.prefixCode = "091";
                this.operName = "Utel";
                break;
            case (3):
                this.prefixCode = "073";
                this.operName = "Life";
                break;
            case (4):
                this.prefixCode = "063";
                this.operName = "Life";
                break;
            case (5):
                this.prefixCode = "095";
                this.operName = "Vodafone";
                break;
            case (6):
                this.prefixCode = "097";
                this.operName = "Kievstar";
                break;
            case (7):
                this.prefixCode = "066";
                this.operName = "Vodafone";
                break;
            case (8):
                this.prefixCode = "067";
                this.operName = "Kievstar";
                break;
            case (9):
                prefixCode = "050";
                this.operName = "Vodafone";
                break;
            case (10):
                this.prefixCode = "098";
                this.operName = "Kievstar";
                break;
            case (11):
                this.prefixCode = "093";
                this.operName = "Life";
                break;
            case (12):
                this.prefixCode = "092";
                this.operName = "PEOPLEnet";
                break;
            case (13):
                this.prefixCode = "094";
                this.operName = "InterTelecom";
                break;
            default:
                System.out.println("shit");
        }

        System.out.println("oer prefix+name" + this.prefixCode + " " + this.operName);
        return;
    }

}