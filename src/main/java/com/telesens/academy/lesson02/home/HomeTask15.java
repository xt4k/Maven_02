package com.telesens.academy.lesson02.home;

import java.util.Scanner;

public class HomeTask15 {
    public static void main(String[] args) {

        System.out.print("input square size (int): ");
        Scanner scanner = new Scanner(System.in);
        int squareSize= scanner.nextInt(); // чтение int числа

        for (int i=1; i<=squareSize;i++) {
            if (i==1) {
                for (int k = 1; k <= squareSize; k++)
                    System.out.print("*");
                System.out.println();
            }
            if (i==squareSize) {
                for (int k = 1; k <= squareSize; k++)
                    System.out.print("*");
                System.out.println();
            }
            if ((i!=1)&(i!=squareSize))            {
                for (int k=1; k<squareSize;k++) {
                    if (k == 1) System.out.print("*");
                    if (k == squareSize-1) System.out.print("*");
                      else System.out.print(" ");
                    }
                    System.out.println();

            }
         }
            System.out.println();

        }
    }
