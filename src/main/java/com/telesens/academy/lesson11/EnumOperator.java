package com.telesens.academy.lesson11;

public enum EnumOperator {
    Life( "063", "093", "073"),
    Kievstar( "097", "067", "098"),
    Vodafone( "050", "066", "095"),
    Utel( "091" ),
    PEOPLEnet( "092" ),
    InterTelecom( "094" );

    private String operator;

    EnumOperator(String s) {
        this.operator = s;
    }
    EnumOperator(String s, String s1, String s2) {

    }

    public String getOperator() {
        return operator;
    }



    private String gender() {
        this.operator = operator;
        return null;
    }

    public void setOperator(String string) {
        this.operator = string;
    }
}

