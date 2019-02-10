
package hangman;

import java.util.Scanner;


public class Hangman {


    public static void main(String[] args) {
        
        //if choice 1 enter this
        String word = getWord();
        //if choice 3 enter this
        //selectWord();
        //guessWord();
        checkGuess(word);
  
    }
    
    public static String getWord()
    {
        System.out.println("Enter the word you want to play with");
        Scanner scnr = new Scanner (System.in);
        String userWord = scnr.next();
        return userWord;
    }
    public static String selectWord()
    {
        Scanner scnr = new Scanner (System.in);
        int userChoice;
        String word = null;
        System.out.println("Enter the your selection");
        userChoice = scnr.nextInt();
        switch (userChoice)
        {
            case 1: 
                word = "word1";
                break;
            case 2:
                word = "word2";
                break;
            case 3: 
                word = "word3";
                break;
        }
        return word;
    }
    public static char guessWord()
    {
        char guessLetter;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a letter");
        guessLetter = scnr.next().charAt(0);
        return guessLetter;
    }
    public static void checkGuess(String word)
    {
        
        char letterCheck = guessWord();
        for (int i = 0; i < word.length(); i++)
        {
            if (letterCheck == word.charAt(i))
            {
                System.out.print(letterCheck);
            }
            else 
            {
                System.out.print(" _ ");
            }
        }
    }
}

