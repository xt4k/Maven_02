package com.telesens.academy.lesson04;

public class AbonentTests {
    private static final String REGEX_FOR_PHONENUMBER = "^\\d{10}$";

    public static void main(String[] args) {
        String someMessage = (String)readTestData("string");
        //if string
        assert someMessage.equals("Hello world");

        //if integer
        Integer number = (Integer) readTestData("number");
        assert someMessage.equals(10);

        //Subscriber abonent = readAbonent();// ?
        Subscriber abonent = (Subscriber)readTestData("abonent");
        assert someMessage.equals("Hello world");

        // Проверить 1 Имя и Фамилия в верхнем регистре
        String firstName = abonent.getfName();
        char firstLetter = firstName.charAt(0);
        assert Character.isUpperCase(firstLetter);

        String lastname = abonent.getlName();
        //System.out.println("Lastname :" + lastname);
        firstLetter = lastname.charAt(0);
// if (Character.isUpperCase(firstLetter))
// System.out.println("First letter in upper case");
// else
// System.out.println("First letter in lower case");

        if (!Character.isUpperCase(firstLetter)) {
            System.out.println(
                    String.format("First letter in the last name '%s' in lower case", lastname));
            assert false;
        }

        // Проверить возраст > 1 < 130
        int age = abonent.getAge();
        assert age > 1 && age < 130;

        // Пол 'f' либо 'm'
        assert (abonent.getGender()=='f') || (abonent.getGender()=='m');

        // Телефонный номер состоит только из цифр

        String phoneNumber = abonent.getpNumber();
        assert phoneNumber.matches(REGEX_FOR_PHONENUMBER);
    }

    private static Object readTestData(String type) {
        if (type.equals("string"))
            return "Hello World";
        else if (type.equals("abonent"))
            return new Subscriber("Helen", "ivanova", 28, 'f', "0501234567");
        else if (type.equals("number"))
            return 10;
        return null;
    }
}