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
        System.out.println("title itself is "+title);

        int length = title.length();
        char[] hiddenCharTitle = title.toCharArray();
        char[] displayedCharTitle = new char[length];
        int spaceCount = 0;
        int spaceCount1 = 0;

        // loop preparing "_" char array for display
        for (int i=0; i<length;i++){
            boolean spaceSpotter =(hiddenCharTitle[i]==' ');
            if(!spaceSpotter)
                displayedCharTitle[i]='_';
            else {
                displayedCharTitle[i] = ' ';
                spaceCount+=1;
            }
        }

        // space spots array
        int[] spaceSpots=new int [spaceCount];

        // filling space array with coordinates od spaces
        for (int i=0; i<length;i++){
            boolean spaceSpotter =(hiddenCharTitle[i]==' ');
            if(spaceSpotter){
                spaceSpots[spaceCount1] = i;
                //System.out.println(spaceSpots[spaceCount1]);
                spaceCount1+=1;
                }
            }

        //Cleaning out spaces


        System.out.println(displayedCharTitle);
        //System.out.println(hiddenCharTitle);
        Game Gra = new Game();
        Gra.Game(hiddenCharTitle, displayedCharTitle, title);

    }
}
