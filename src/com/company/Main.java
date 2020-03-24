package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //random number defining index of a movie
        int movieIndex=100;
        while(movieIndex>24){
        movieIndex= (int) (Math.random()*100);}

        // getting title from title String array
        String title =Linefiller.linesFiller("titles.txt")[movieIndex];
        System.out.println(title);
    }
}
