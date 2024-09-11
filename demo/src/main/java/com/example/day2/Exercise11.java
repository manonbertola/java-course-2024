package com.example.day2;

import java.util.Scanner;

public class Exercise11 {
    public static void intToHex(int character) {
        String hexCharacter =  Integer.toHexString(character);
        System.out.println(character + " is written as ' " + hexCharacter +" '");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input a character (int)");
        int character = input.nextInt();
        intToHex(character);
        input.close();
    }

}
