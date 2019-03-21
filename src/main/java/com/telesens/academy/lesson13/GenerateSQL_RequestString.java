package com.telesens.academy.lesson13;

import com.telesens.academy.lesson11.SubscriberConstructor;

public class GenerateSQL_RequestString {
    private String requestSQL;

    public GenerateSQL_RequestString(SubscriberConstructor subsArrayList, int i) {

        Long subId = subsArrayList.getArrayListSubsExt().get( i ).getId();
        String fName = subsArrayList.getArrayListSubsExt().get( i ).getFirstName();
        String lName = subsArrayList.getArrayListSubsExt().get( i ).getLastName();
        String gender = (String.valueOf( subsArrayList.getArrayListSubsExt().get( i ).getGender() ).substring( 0, 1 ));
        int age = subsArrayList.getArrayListSubsExt().get( i ).getAge();
        this.requestSQL = "INSERT INTO abonent VALUES(" + subId + ", '" + fName + "', '" + lName + "', '" +
                gender + "'," + age + ")";

    }

    public String getRequestSQL() {
        return requestSQL;
    }

}
