package com.telesens.academy.lesson09.home;

import java.util.Random;

public class GenArrayTests {

    public static void main(String[] args)  throws java.lang.ArrayIndexOutOfBoundsException {

        int size = 10;
        Random random = new Random();
        String[] arrString = new String[size];
        Integer[] arrInt = new Integer[size];
        Object[] arrObj = new Object[size];

        String[] arrStringSet = new String[size];
        Integer[] arrIntSet = new Integer[size];
        Object[] arrObjSet = new Object[size];
        for (int i = 0; i < arrString.length; i++) {
            int randomNum = random.nextInt(10);
            arrInt[i] = randomNum;
            arrString[i] = "s_" + Integer.toString(arrInt[i]);
            arrObj[i] = arrString[i].replace("s", "o");

            arrIntSet[i] = randomNum * randomNum;
            arrStringSet[i] = "s_" + Integer.toString(arrInt[i]) + "_s";
            arrObjSet[i] = arrString[i].replace("s", "oo");

        }
        System.out.println("----");

        GenArray<Integer> genArrayInt = new GenArray(arrInt);
        GenArray<String> genArrayStr = new GenArray(arrString);
        GenArray<Object> genArrayObj = new GenArray(arrObj);

        System.out.println(String.format("Array of Integer: %s", genArrayInt.toString()));
        System.out.println(String.format("Array of String. %s", genArrayStr.toString()));
        System.out.println(String.format("Array of Object. %s", genArrayObj.toString()));
        System.out.println("----");

  for (int i = 0; i < arrString.length; i++) {

            genArrayInt.set(i, arrIntSet[i]);
            genArrayStr.set(i,arrStringSet[i]);
            genArrayObj.setArray(arrObjSet);
        }
        System.out.println(String.format("Array2 of Integer: %s", genArrayInt.toString()));
        System.out.println(String.format("Array2 of String. %s", genArrayStr.toString()));
        System.out.println(String.format("Array2 of Object. %s", genArrayObj.toString()));
        System.out.println("----");


        for (int i = 0; i < arrString.length; i++) {
            System.out.println(String.format("Arrays of: String, Integer, Object: item №%s ~ %s, %s, %s.", i, genArrayStr.get(i), genArrayInt.get(i), genArrayObj.get(i)));

        }
        System.out.println("-=|=-");



            //genArrayInt.get(10);
            // genArrayInt.get(-1);
           // genArrayInt.set(2, arrIntSet[16]);




    }
}
