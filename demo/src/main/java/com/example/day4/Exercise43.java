package com.example.day4;

import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) {
        // URL:
        String URLString = "https://moodle-app2.let.ethz.ch/pluginfile.php/2115457/mod_resource/content/1/babynamesranking2001.txt";
        try{
            java.net.URL url = new java.net.URL(URLString);
            int count = 0 ;
            Scanner input = new Scanner(url.openStream());

            while(input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }
            
            System.out.println("the file size is (characters) " +count);
            input.close();

        }
        catch( java.net.MalformedURLException ex ){
                System.out.println("invalid URL");
            }

        catch (java.io.IOException ex){ 
        System.out.println("I/O error: no such file");
        }
    }
}
