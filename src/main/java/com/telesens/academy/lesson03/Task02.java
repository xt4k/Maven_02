package com.telesens.academy.lesson03;

import java.util.Scanner;

public class Task02 {

        public static void main(String[] args) {
            String[] stringArray = {"zero","one","two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
            System.out.print("input number(int): ");
            Scanner scanner = new Scanner(System.in);
            int number= scanner.nextInt();
            if (number>=0 && number <=stringArray.length)
                System.out.println("item in array - "+stringArray[number]);
            else System.out.println("wrong number");
        }
    }
