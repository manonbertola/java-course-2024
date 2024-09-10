package com.example;

import java.util.Scanner;
 
public class Exercise02 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input the radius of the circle: ");
            
            double radius = input.nextDouble();

            final double PI = 3.1415;

            double area = radius * radius * PI;

            double circumference = 2 * radius * PI;

            System.out.println("The circumference of the circle is: " + circumference + " m" ) ;
            System.out.println("The area is : " + area + " m2" ) ;
            input.close();
        }

}
