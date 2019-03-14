package com.telesens.academy.lesson02.home;

import java.util.Scanner;

public class HomeTask12 {

    public static void main(String[] args) {

        System.out.print("input  rhombus size (int): ");
        Scanner scanner = new Scanner(System.in);
        int rhombusSize = scanner.nextInt(); // чтение int числа

        //rString = rString+ String.valueOf(3);
       // System.out.println("rString = " + rString);

        for (int i=1; i<= rhombusSize*2-1;i++) {
            String rString="";
            if (i < rhombusSize) {
                for (int j=1;j == rhombusSize;j++)
                           rString = rString + String.valueOf(j);
                if (i > rhombusSize)
                    for (int j=rhombusSize;j==1;j--) {
                        System.out.println("j= "+j+" i= "+i);
                        rString = rString + String.valueOf(i - (j - i));
                    }
            }
            System.out.println("rString = " + rString);

           // for (int i = rhombusSize; i <= 1; i--) System.out.print(i);

            System.out.println();
        }
        System.out.println("The End.");
        }


    }
