package com.example.day2;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Double [] scores = new Double[100];
        System.out.println(scores);
        int numberOfScores = 100;
        Scanner input = new Scanner (System.in);
        for (int i=0; i<100; i++){

            System.out.println("Input a score (entering a negative number concludes the list of scores)");
            Double nextscore = input.nextDouble();


            if (nextscore <0){
                numberOfScores = i-1;
                break;
            }
            else {
                scores[i] = nextscore;
            }
        }
        input.close();
        for (int i=0; i <= numberOfScores; i++){
            System.out.println("Score " + (i+1) +" is " + scores[i]);
        }
    }
}
