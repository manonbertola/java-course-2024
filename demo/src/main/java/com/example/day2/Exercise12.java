package com.example.day2;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input the year");
        int year = input.nextInt();
        System.out.println("Input the first 3 letters of the month (starting upper case)");
        String month = input.next();
        int days = daysInMonth(year, month);
        System.out.println("in the year " + year + " and the month " +month +"has the following number of days:" + days);
        input.close();
    }

    public static int daysInMonth(int year, String month) {
        int days = 0;
        return days;
    }
}
