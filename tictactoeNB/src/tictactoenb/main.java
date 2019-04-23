import java.awt.*;
import javax.swing.*; // Needed for Swing classes
import java.awt.event.*; // Needed for event listener interface
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		boolean gameOver = false;
		new TicTacToe();
		TicTacToe.checksBoard(TicTacToe.board, gameOver);

	}
}
