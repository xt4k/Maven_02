package com.telesens.academy.lesson06.Enum;
public class TestClass {

    public static void main(String[] args) {
        for (EnumWeekDay currentDay  :EnumWeekDay.values()) {
            System.out.println("- Week Day -");
            String b4B4 = currentDay.getDayBeforeYesterday(currentDay.ordinal()).getDayName();
            String nextNext = currentDay.getDayAfterTomorrow(currentDay.ordinal()).getDayName();
            System.out.println(String.format("Eсли сегодня %s то послезавтра будет %s, а позавчера было %s", currentDay.getDayName(),nextNext,b4B4));
            EnumWeekDay testday =currentDay.getDayBeforeYesterday(currentDay.ordinal());
            String stringTestDay = testday.getDayAfterTomorrow(testday.ordinal()).getDayName();
            assert stringTestDay.equals(currentDay.getDayName());
        }
        System.out.println("--------");
        System.out.println("- Season -");
        for (Season currentSeason : Season.values()) {
            String nextSeasonName = currentSeason.getNextSeason(currentSeason.ordinal()).name();
            String preSeasonName = currentSeason.getPrevSeason(currentSeason.ordinal()).name();
            Season testSeason = currentSeason.getNextSeason(currentSeason.ordinal());
            String testSeasonName = testSeason.getPrevSeason(testSeason.ordinal()).name();
            System.out.println(String.format("If current Season is: %s, then next season will be: %s and season before was: %s", currentSeason.name(), nextSeasonName, preSeasonName));
            assert testSeasonName.equals(currentSeason.name());
        }
        System.out.println("----------");
        System.out.println("- Months -");
        for (Months currentMonth: Months.values()) {
            System.out.println(String.format(currentMonth.toString()));
        }

        System.out.println("----------");
        System.out.println("- Rus_Months -");
        for (Months currentRusMonth: Months.values()) {
            System.out.println(String.format(currentRusMonth.rusToString()));
        }
        System.out.println("----------");
        System.out.println("- Next&Pre_Months -");
        for (Months currentMonth: Months.values()) {
            String currentMonthName = currentMonth.getMonthsRus(currentMonth);
            String nextMonthRusName = currentMonth.getNextMonthsRus(currentMonth).getMonthsRus(currentMonth.getNextMonthsRus(currentMonth));
            String preMonthRusName = currentMonth.getPreMonthsRus(currentMonth).getMonthsRus(currentMonth.getPreMonthsRus(currentMonth));
            System.out.println(String.format("The month %s has pre-month: %s and post-month %s",currentMonthName,preMonthRusName,nextMonthRusName));
        }
        System.out.println();
    }



}
