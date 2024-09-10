package com.example;

import java.util.Scanner;
 
public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input the weigth of the package in kg");
        double weigth = input.nextDouble();
        if (weigth > 0 && weigth <=3)
            System.out.println("The shipping cost is " + 1.5 + " CHF");
        else if (weigth > 3 && weigth <=5)
            System.out.println("The shipping cost is " + 2.5 + " CHF");
        else if (weigth > 5 && weigth <=10)
            System.out.println("The shipping cost is " + 3.5 + " CHF");
        else 
            System.out.println("The package weigth is out of range");
        


        input.close();
    }
}
