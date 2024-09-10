package com.example;

public class Exercise07 {
    public static void main(String[] args) {
        //part a: all perfect numbers until 100'000
        for (int i =1; i <100000; i++){
            int sum = 0;
            for (int j=1; j <= i/2; j++){
                if ( i % j == 0 )
                sum += j ;
            }
            if ( sum == i )
                System.out.println( i + " is the perfect number .");
        }
        System.out.println("Test to check if version control works");
    }

}
 