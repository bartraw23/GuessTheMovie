package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Linefiller {
    //Method that prepares array of strings for titles
    public static String[] linesFiller(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        int counter = 0;
        //counting the lines
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            counter+=1;
        }
        //array for titles
        String[] titles = new String[counter];

        //new scanner, now it will read and fill the array
        Scanner scanner1 = new Scanner(file);

        for(int i=0; i<counter;i++){
            String line1 = scanner1.nextLine();
            titles[i]=line1;
        }
        return titles;
    }

}
