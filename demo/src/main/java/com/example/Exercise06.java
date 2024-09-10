package com.example;

import java.util.Scanner;
 
public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input the number of the Fibonacci number");
        int N = input.nextInt();
        if (N < 1)
            System.out.println("The entered value is invalid");
        else if (N == 1)
            System.out.println("The 1st fibonacci number is 1");
        else if (N == 2)
            System.out.println("The 2nd fibonacci number is 1");
        else {
            int fibonacciNumber = 1;
            int previousFionacciNumber = 1;
            for (int i = 3; i <= N; i++) {
                int sum = fibonacciNumber + previousFionacciNumber;
                previousFionacciNumber = fibonacciNumber;
                fibonacciNumber = sum;
                //System.out.println("The " + i +"th fibonacci number is " + fibonacciNumber);
            }
            System.out.println("The requested " + N +"th fibonacci number is " +fibonacciNumber);
        }
        input.close();
    }

}
