package com.example.day2;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input the first city");
        String city1 = input.next();
        System.out.println("Input the second city");
        String city2 = input.next();
        System.out.println("Input the third city");
        String city3 = input.next();
        String[] citiesSorted = sortingCities(city1, city2, city3);
        System.out.println( "The sorted order of the cities is first " +citiesSorted[0]+ " second " +citiesSorted[1]+ " and last " +citiesSorted[2]);
        input.close();
    }
    public static String[] sortingCities(String city1, String city2, String city3) {
        String[] sortedCities = new String[3];
        String temporary;
        if (city1.compareTo(city2) > 0) {
            temporary = city1;
            city1 = city2;
            city2 = temporary;
        }

        if (city2.compareTo(city3) > 0) {
            temporary = city2;
            city2 = city3;
            city3 = temporary;
        }
        if (city1.compareTo(city2) > 0) {
            temporary = city1;
            city1 = city2;
            city2 = temporary;
        }
        sortedCities[0] = city1;
        sortedCities[1] = city2;
        sortedCities[2] = city3;

        return sortedCities;
    }

}
