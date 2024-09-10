package com.example;
import java.util.Scanner;
import java.util.Random;
 
public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input the integer to be guessed between 0 and 1000:");
        int secretNumber = input.nextInt();
        if (secretNumber < 0 || secretNumber > 1000)
            System.out.println("The number is not in range!");
        else {
            int numberOfGuesses = 0;
            Random r = new Random ();
            boolean guessed = false;
            while (!guessed) {
                int newGuess = r.nextInt(1001);
                numberOfGuesses++;
                if (newGuess == secretNumber){
                    System.out.println("I have guessed the secret number");
                    System.out.println("The secret number was: " + newGuess);
                    System.out.println("It took me  " + numberOfGuesses +" number of guesses to find it");
                    guessed = true;
                }
            }
        }
        input.close();
    }
}
