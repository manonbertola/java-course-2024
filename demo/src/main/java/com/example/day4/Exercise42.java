package com.example.day4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Exercise42 {
    public static void main(String[] args) {
        // file path: "C:\Users\manon\OneDrive\Desktop\Java Course\VowelsTest.txt"
        Scanner input = new Scanner (System.in);
        //get the file name
        System.out.println("Enter the textfile name");
        String filename = input.nextLine();

        //define vowels set
        Set <Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int vowelCount = 0;
        
        try {
            // open file
            File file = new File(filename);
            Scanner fileReader = new Scanner(file);

            //iterate through each line of the file
            while (fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                // iterate through each character of the line
                for (char ch : line.toCharArray()) {
                    if (vowels.contains(ch)) {
                        vowelCount++;
                    }
                }
            }

            //Close the file reader
            fileReader.close();
            // print result
            System.out.println("Number of vowels: " + vowelCount);


        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found. Please make sure the file name is correct.");
        }

        input.close();
    }

}
