package com.telesens.academy.lesson06.Enum;

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    String getCurrentSeason () {
        return this.name();
    }

    Season getPrevSeason(int seasonNum) {
        if (seasonNum>0)
            return values()[ordinal()-1];
        else return values()[3];
    }

    Season getNextSeason(int seasonNum) {
        if (seasonNum<3)
            return values()[ordinal()+1];
        else return values()[0];
    }

}
