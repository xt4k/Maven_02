package com.telesens.academy.lesson02.classTask;

public class ManualTask02 {
    public static void main(String[] args) {
        double x=1.1;
        double y=3;
        double z=5;
        double result = z-y-x;
        //System.out.println("x = "+ x +", y = "+ y +", z = " + z);
        //
        System.out.printf("x=%f, y=%f, z=%f",x,y,z);
        System.out.println(result);
        System.out.println(String.format("result = %f", result));
        //System.out.println("result = " + result);

      /*  long longNumber = 100000000000L;
        int intNumber = 10;
        int oct = 0144;

        intNumber = (int)longNumber;
        //longNumber = intNumber;
        System.out.println(String.format("longNUmber = %d, intNumber =%d",longNumber, intNumber));*/
    }
}
