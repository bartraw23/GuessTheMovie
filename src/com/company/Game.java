package com.company;

import java.util.Scanner;

public class Game {
    public static boolean Game(char[] hiddenTitle, char[] displayedTitle, String title){

        char guessedLetter = ' ';
        boolean result = false;
        System.out.println("Welcome in the guessing game");
        //System.out.println("you are guessing: ");
        //System.out.println(displayedTitle);

        for (int i=10; i>=1;i--) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You have "+i+" chances left");
            System.out.println("you are guessing: ");
            System.out.println(displayedTitle);
            System.out.println("Guess a letter: ");
            String guessedIn = scanner.nextLine();
            guessedLetter=guessedIn.charAt(0);
            int loop = title.length();

            //guessed chars
            for(int j=0;j<loop;j++){
                boolean match =(guessedLetter==hiddenTitle[j]);
                if (match){
                    displayedTitle[j]=hiddenTitle[j];
                }
            }

            //checking whole title
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Want to check whole title? [Y/N]");
            String answer = scanner1.nextLine();
            if (answer.equals("Y")){
                System.out.println("Go on:");
                Scanner scanner2 = new Scanner(System.in);
                String titleGuessedString = scanner2.nextLine();
                if (titleGuessedString.equals(title)){
                    System.out.println("You have guessed!");
                    result=true;
                    break;
                }else{
                    System.out.println("Unluckily you are wrong!");
                }
            }


        }
        return result;
    }
}
