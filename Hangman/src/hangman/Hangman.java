package hangman;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Hangman {
	public static void main(String[] args) {

		int strikes = 0;
		String word = null;
		char letterCheck = 'a';
		char[] scoreUpdate = new char[20];
		
		greeting();
		displayMenu(word, scoreUpdate, letterCheck, strikes);

	}

	public static void displayMenu(String word, char[] scoreUpdate, char letterCheck, int strikes) {
		String userInput;
		int finalInput;
		Scanner scnr = new Scanner(System.in);
		userInput = JOptionPane.showInputDialog("Would you like to : \n" + " 1. Play game form a randomly chosen word in a list. \n"
				+ " 2. Play game from a word entered by another user \n" + " 3. Exit Game\n");

		if (userInput != "3") {
			switch (userInput) {
			case "1":
				word = selectWord(word, scoreUpdate, strikes, scoreUpdate);
				checkGuess(word, strikes, letterCheck, scoreUpdate);
				break;
			case "2":
				word = getWord(word, scoreUpdate);
				checkGuess(word, strikes, letterCheck, scoreUpdate);
				break;
			default:
				System.exit(0);
				break;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Game Over!");
		}
	}
	
	public static String getWord(String userWord, char scoreUpdate[]) {
		userWord = JOptionPane.showInputDialog("Enter the word you want to play with");
		for (int i = 0; i < userWord.length(); i++) {
			scoreUpdate[i] = '_';
		}
		return userWord;
	}

	public static char guessWord() {
		char guessLetter;
		String letter;
		Scanner scnr = new Scanner(System.in);
		letter = JOptionPane.showInputDialog("Enter a letter");
		guessLetter = letter.charAt(0);
		return guessLetter;
	}

	public static void checkGuess(String word, int strikes, char letterCheck, char scoreUpdate[]) {
		int temp = 0;
		boolean test = true; 
		int wordCheck = 0;
		
		while (strikes < 6) {
			String toPrint = "";
			letterCheck = guessWord();
			temp = 0;
			
			for (int i = 0; i <= word.length()-1; i++) {							
				if (letterCheck == word.charAt(i)) {
					scoreUpdate[i] = word.charAt(i);
					wordCheck++;
				} else {
					temp++;
				}
			}
			
			if (temp > word.length()-1) {
				strikes++;
				displayMan(strikes);
			}

			for (int i = 0; i < word.length(); i++) {
				toPrint += scoreUpdate[i];
			}
			
			displayOptionPane(toPrint);
			
			System.out.println(" ");

			if(wordCheck == word.length()) {
				JOptionPane.showMessageDialog(null, "You win.");
				strikes = 0;
				System.exit(0);
			}
		}
		
		if(strikes == 6) {
				JOptionPane.showMessageDialog(null, "You loose.");
				displayMenu(word, scoreUpdate, letterCheck, strikes);
				System.exit(0);
			}
	}

	public static String selectWord(String word, char userWord[], int strikes, char[] scoreUpdate) {
		Scanner scnr = new Scanner(System.in);
		String userChoice;

		userChoice = JOptionPane.showInputDialog("Enter your selection (1, 2, 3)");
		switch (userChoice) {
		case "1":
			word = "cat";
			break;
		case "2":
			word = "dog";
			break;
		case "3":
			word = "pig";
			break;
		}

		for (int i = 0; i < word.length(); i++) {
			scoreUpdate[i] = '_';
		}
		return word;
	}

	public static void displayMan(int strikes) {
		switch (strikes) {
		case 1:
			JOptionPane.showMessageDialog(null, "Strikes: " + strikes+ "\nO");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Strikes: " + strikes+ "\nO\n |\n |");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Strikes: " + strikes+ "\n O\n \\|\n  |\n");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Strikes: " + strikes+ "\n O\n \\|/\n  |\n");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Strikes: " + strikes+ "\n O\n \\|/\n  |\n /\n");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Strikes: " + strikes+ "\n O\n \\|/\n  |\n / \\");
			break;
		default:
			break;
		}
	}

	public static void displayOptionPane(String toPrint) {
		JOptionPane.showMessageDialog(null, "**HANGMAN**\n**************\n----------------------\n" + toPrint + "\n**************\n----------------------");
		
	}
	
	public static void greeting() {
		JOptionPane.showMessageDialog(null, "Welcome to hangman.");
	}
}