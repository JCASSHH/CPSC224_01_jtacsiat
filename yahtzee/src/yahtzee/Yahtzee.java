/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

import static java.lang.Math.random;
import java.util.Scanner;

public class Yahtzee {
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int diceInPlay = 5;
        int[] hand = new int[diceInPlay];
        random();
        char playAgain = 'y';
        
        while (playAgain == 'y') {
        String keep = "nnnnn"; //setup to roll all dice in the first roll
        int turn = 1;
        while (turn < 4 && keep != "yyyyy"){
                //roll dice not kept
            for (int dieNumber = 0; dieNumber < diceInPlay; dieNumber++)
            {
                if (keep.charAt(rollDie()) != 'y')
                    hand[dieNumber] = rollDie();
            }
            //output roll
            System.out.println("Your roll was: ");
            System.out.println("Your roll was: ");
            
            for (int dieNumber = 0; dieNumber < diceInPlay; dieNumber++){
                System.out.println(hand[dieNumber]);
            }
            //if not the last roll of the hand prompt the user for dice to keep
            if (turn < 3){
                System.out.println("enter dice to keep (y or n) ");
                keep = scnr.next();
            }
            turn++;
    }
    }
    }
