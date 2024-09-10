package com.example;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an interger number: ");
        int number = input.nextInt();
        int product = 1;

        // Convert the integer to a string
        String numStr = Integer.toString(number);

        // Iterate over each character of the string
        for (int i = 0; i < numStr.length(); i++) {
            // Convert the character back to a digit
            int digit = Character.getNumericValue(numStr.charAt(i));
            product *= digit;
        }
        System.out.println( "The product of the digits is : " + product ) ;
        input.close();
    }
 
}
