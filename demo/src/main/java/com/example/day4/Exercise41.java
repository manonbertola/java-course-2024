package com.example.day4;

import java.util.LinkedList;
import java.util.Iterator;


public class Exercise41 {
    public static void main(String[] args) {

        //initialize list
        LinkedList<Integer> testList = new LinkedList<>();
        int numberOfElems = 50000;
        for (int i=1; i<numberOfElems; i++){ //just use numbers 1 to 5mil
            testList.add(i);
        }

        //Iterator
        long startTime1 = System.currentTimeMillis();
        long endTime1;

        Iterator<Integer> iterator = testList.iterator();

        while (iterator.hasNext()) {
            iterator.next();
        }

        endTime1 = System.currentTimeMillis();
        long iteratorTime1 = endTime1 - startTime1;
        System.out.println("the iterator method took " + iteratorTime1 + "miliseconds");

        //get(index) method
        long startTime2 = System.currentTimeMillis();
        long endTime2;

        for (int index = 0; index < numberOfElems-1; index++) {
            testList.get(index); // Access each element by index
        }

        endTime2 = System.currentTimeMillis();
        long iteratorTime2 = endTime2 - startTime2;
        System.out.println("the get(index) method took " + iteratorTime2 + "miliseconds");


    }

}
