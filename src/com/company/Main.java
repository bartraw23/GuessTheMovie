package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    //Method that prepares array of strings for titles
    public static String[] linesFiller(String fileName) throws FileNotFoundException{
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


    public static void main(String[] args) throws FileNotFoundException {
        //random number defining index of a movie
        int movieIndex=100;
        while(movieIndex>24){
        movieIndex= (int) (Math.random()*100);}

        // getting title from title String array
        String title =linesFiller("titles.txt")[movieIndex];
        String title2 =Linefiller.linesFiller("titles.txt")[movieIndex];
        System.out.println(title);
        System.out.println(title2);
    }
}
