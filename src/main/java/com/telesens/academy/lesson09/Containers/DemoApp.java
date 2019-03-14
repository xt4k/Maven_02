package com.telesens.academy.lesson09.Containers;

import java.util.Random;

public class DemoApp {
    public static void main(String[] args)  throws  Exception {
        int size = 10;
        Random random = new Random();
        String[] arrString = new String[size];
        Integer[] arrInt = new Integer[size];
        Object[] arrObj = new Object[size];
            for (int i = 0; i < arrString.length; i++) {
                int randomNum = random.nextInt(10);
                arrString[i] = Integer.toString(randomNum);
                arrInt[i] = Integer.valueOf(arrString[i]);
                arrObj[i] = arrInt[i];
               /* System.out.println(String.format("Array of String. item - %s = %s", i, arrString[i]));
                System.out.println(String.format("Array of Integer. item - %s = %s", i, arrInt[i]));
                System.out.println(String.format("Array of Object. item - %s = %s", i, arrObj[i]));
                System.out.println("--");*/
            }
            System.out.println("====");

   /*         for (int i = 0; i < arrInt.length; i++) {
                arrInt[i] = (Integer) arrObj[i];
                System.out.println(String.format("Array of Integer from object. item - %s = %s", i, arrInt[i]));
            }*/

        PairedContainer<Integer[],String[] > arrPairedContainers = new PairedContainer<>();
        arrPairedContainers.setFirstValue(arrInt);
        arrPairedContainers.setSecondValue(arrString);
            for (int i=0;i<arrInt.length;i++){
               //arrPairedContainers.setFirstValue(arrInt[i]);
                //arrPairedContainers[i].setSecondValue(arrString[i]);
                System.out.println(String.format("Paired Containers item - %s. First Value => Second value ",arrPairedContainers.toString()));

            }


    }

}
