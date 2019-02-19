package hangman;

/*************************************************
 * Homework #2
 * Due date: 2/11/19
 * Names: Jalen Tacsiat, Caroline Sonnen
 * 
 * ***********************************************
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Hangman {
	public static void main(String[] args) {

		int strikes = 0;
		String word = null;
		char letterCheck = 'a';
		char[] scoreUpdate = new char[20];
		
		greeting();
		//calls greeting function to welcome them to the game
		displayMenu(word, scoreUpdate, letterCheck, strikes);
		//calls a function to display a menu for the user to enter input

	}

	public static void displayMenu(String word, char[] scoreUpdate, char letterCheck, int strikes) {
		String userInput;
		int finalInput;
		Scanner scnr = new Scanner(System.in);
		userInput = JOptionPane.showInputDialog("Would you like to : \n" + " 1. Play game form a randomly chosen word in a list. \n"
				+ " 2. Play game from a word entered by another user \n" + " 3. Exit Game\n");
		//takes in user input for how they want to play hangman
		
		if (userInput != "3") {
			switch (userInput) {
			case "1":
				word = selectWord(word, scoreUpdate, strikes, scoreUpdate);
				checkGuess(word, strikes, letterCheck, scoreUpdate);
				//called when user wants to play with a word randomly chosen from a list
				break;
			case "2":
				word = getWord(word, scoreUpdate, letterCheck, strikes);
				checkGuess(word, strikes, letterCheck, scoreUpdate);
				//called when user wants to play game from a word entered by another user
				break;
			default:
				JOptionPane.showMessageDialog(null, "Not valid input, please enter a number (1, 2, 3)");
				displayMenu(word, scoreUpdate, letterCheck, strikes);
				//default case statement to get proper user input
				break;
			//switch statement that calls different functions based on the user's input
			}
		} else {
			JOptionPane.showMessageDialog(null, "Game Over!");
			//if user enters 3 the game is over
		}
	}
	
	public static String getWord(String userWord, char scoreUpdate[], char letterCheck, int strikes) {
		userWord = JOptionPane.showInputDialog("Enter the word you want to play with");
		userWord = userWord.toLowerCase();
		//gets user input for the word they want to play with
		for(int i = 0; i < userWord.length(); i++) {
				while(userWord.charAt(i) < 97 || userWord.charAt(i) > 122 ) {
					JOptionPane.showMessageDialog(null, "Word Not valid. Cannot contain numbers. Returning to menu.");
					displayMenu(userWord, scoreUpdate, letterCheck, strikes);
			}
		}
		//function to make sure there are no numbers in the players word
		for (int i = 0; i < userWord.length(); i++) {
			scoreUpdate[i] = '_';
		}
		return userWord;
	}
	//initializes array scoreUpdate to '_' which will eventually keep track of the users letter input

	public static char guessWord() {
		char guessLetter;
		String letter = null;
		Scanner scnr = new Scanner(System.in);
		letter = JOptionPane.showInputDialog("Enter a letter");
		letter = letter.toLowerCase();
		guessLetter = letter.charAt(0);
		int checkAscii = (int)guessLetter;
		
		while(checkAscii < 97 || checkAscii > 122) {
			System.out.println(checkAscii);
			Scanner scnrNew = new Scanner(System.in);
			letter = JOptionPane.showInputDialog("Input not valid. Please enter a letter:");
			letter = letter.toLowerCase();
			guessLetter = letter.charAt(0);
			checkAscii = (int)guessLetter;
		}
		//while loop to ensure the user does not enter a number as input
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
			//temp is used to keep track of the amount of strikes for a single iteration
			
			if (temp > word.length()-1) {
				strikes++;
				displayMan(strikes);
			}
			//if temp is greater than the length of the word minus 1, it means that the user input is incorrect, a strike is added and the hangman displayed

			for (int i = 0; i < word.length(); i++) {
				toPrint += scoreUpdate[i] + " ";
			}
			//updates the scoreUpdate to show the users input
			
			displayOptionPane(toPrint);
			//displays hangman layout
			
			System.out.println(" ");

			if(wordCheck == word.length()) {
				JOptionPane.showMessageDialog(null, "You win.");
				strikes = 0;
				System.exit(0);
			}
			//checks if the user guessed the entire word correctly, if so the user wins
		}
		
		if(strikes == 6) {
				JOptionPane.showMessageDialog(null, "You lose. \nWord: " + word );
				System.exit(0);
			}
		//if number of strikes reaches 6, the user loses and the correct word is outputed
	}

	public static String selectWord(String word, char userWord[], int strikes, char[] scoreUpdate) {
		Scanner scnr = new Scanner(System.in);
		String userChoice;

		userChoice = JOptionPane.showInputDialog("Enter your selection from the list of words (1, 2, 3)");
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
		default:
			JOptionPane.showMessageDialog(null, "Not valid input, please try again.");
			word = selectWord(word, scoreUpdate, strikes, scoreUpdate);
			break;
		}
		//when the user prompts for the computer to choose the word, this function is called and the word is selected from this switch statement using user input

		for (int i = 0; i < word.length(); i++) {
			scoreUpdate[i] = '_';
		}
		//scoreUpdate array is initialized to '_'
		return word;
	}

	public static void displayMan(int strikes) {
		switch (strikes) {
		case 1:
			JOptionPane.showMessageDialog(null, "Strikes: " + strikes + "\nYour hangman: \n" + "\nO");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Strikes: " + strikes + "\nYour hangman: \n" + "\nO\n |\n |");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Strikes: " + strikes + "\nYour hangman: \n" + "\n O\n \\|\n  |\n");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Strikes: " + strikes + "\nYour hangman: \n" + "\n O\n \\|/\n  |\n");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Strikes: " + strikes + "\nYour hangman: \n" + "\n O\n \\|/\n  |\n /\n");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Strikes: " + strikes + "\nYour hangman: \n" + "\n O\n \\|/\n  |\n / \\");
			break;
		default:
			break;
		}
		//displays number of strikes and hangman
	}

	public static void displayOptionPane(String toPrint) {
		JOptionPane.showMessageDialog(null, "**HANGMAN**\n******************\n----------------------\n" + toPrint + "\n----------------------\n******************");
		//displays layout and word
	}
	
	public static void greeting() {
		JOptionPane.showMessageDialog(null, "Welcome to hangman.");
		//welcome greeting
	}
}

