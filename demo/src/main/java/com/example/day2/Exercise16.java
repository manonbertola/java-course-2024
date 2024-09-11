package com.example.day2;
import java.util.Scanner;

public class Exercise16 {
    public static boolean[] isValidPW(String PW){
        // first check more than 8 characters, second case min 1 digit, third case no "."
        boolean[] validity = new boolean[3];
        validity[2] = true;
        int PWlength = PW.length();
        if (PWlength>=8)
            validity[0] = true;
        if (PW.contains("."))
            validity[2] = false;
        for (int i=0 ; i < PWlength; i++) {

            if (Character.isDigit(PW.charAt(i))){
                validity[1] = true;
                break;
            }
        }
        return validity;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input the passwort");
        String Password = input.next();
        boolean[] passwordValidity = isValidPW(Password);
        System.out.println("password contains at least 8 characters: " + passwordValidity[0] +", has at least 1 digit: " +passwordValidity[1]+ ", and does not contain a period: " +passwordValidity[2]);
        boolean totValidity = false;
        if (passwordValidity[0] && passwordValidity[1] && passwordValidity[2]){
            totValidity=true;
            System.out.println("The password meets all requirements");
        }
        else {
            System.out.println("The password is invalid!");
        }
        input.close();
    }
}
