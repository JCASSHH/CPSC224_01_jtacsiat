import java.awt.*;
import javax.swing.*; // Needed for Swing classes
import java.awt.event.*; // Needed for event listener interface
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class TicTacToe extends JFrame {

	private static JPanel namePanel;
	private JPanel bottomButtonPanel;
	private JPanel panel;
	JLabel nameLabel;
	private static JTextField nameTextField;
	private static JTextField nameTextField2;
	private JFrame grid, frame;
	private JLabel messageLabel, players, welcome;
	private GridLayout layout;
	private static JButton zero, one, two, three, four, five, six, seven, eight;
	private JButton newGame, reset, exit;
	public static String board[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	public boolean player1 = true;
	public static boolean gameOver = false;
	private final int WINDOW_WIDTH = 500;
	private final int WINDOW_HEIGHT = 500;
	static int player1Wins = 0;
	static int player2Wins = 0;
	static int player1Losses = 0;
	static int player2Losses = 0;
	JLabel player1Label = new JLabel("Player 1 (X):");
	JLabel player2Label = new JLabel("Player 2 (O):");
	
	JLabel player1Name = new JLabel("Name:");
	JLabel player2Name = new JLabel("Name:");
	static JLabel player1WinsLabel = new JLabel("\nWins: " + String.valueOf(player1Wins));
	static JLabel player2WinsLabel = new JLabel("\nWins: " + String.valueOf(player2Wins));
	
	static JLabel player1LossesLabel = new JLabel("\nLosses: " + String.valueOf(player1Losses));
	static JLabel player2LossesLabel = new JLabel("\nLosses: " + String.valueOf(player2Losses));

	public TicTacToe() {

		setTitle("TicTacToe");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		messageLabel = new JLabel("");

		zero = new JButton("Click");
		one = new JButton("Click");
		two = new JButton("Click");
		three = new JButton("Click");
		four = new JButton("Click");
		five = new JButton("Click");
		six = new JButton("Click");
		seven = new JButton("Click");
		eight = new JButton("Click");

		zero.addActionListener(new zero());
		one.addActionListener(new one());
		two.addActionListener(new two());
		three.addActionListener(new three());
		four.addActionListener(new four());
		five.addActionListener(new five());
		six.addActionListener(new six());
		seven.addActionListener(new seven());
		eight.addActionListener(new eight());

		buildNamePanel();
		buildBoard();
		buildBottomPanel();
		add(panel, BorderLayout.CENTER);
		add(namePanel, BorderLayout.NORTH);
		add(bottomButtonPanel, BorderLayout.SOUTH);

		setVisible(true);
	}

	public void buildBoard() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3));
		panel.add(zero);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(seven);
		panel.add(eight);

	}

	public void buildNamePanel() {
		namePanel = new JPanel();
		namePanel.setLayout(new GridLayout(5, 1));

		nameTextField = new JTextField(6);
		nameTextField2 = new JTextField(6);

		namePanel.add(player1Label, BorderLayout.WEST);
		namePanel.add(player2Label, BorderLayout.EAST);

		namePanel.add(player1Name, BorderLayout.WEST);
		namePanel.add(player2Name, BorderLayout.WEST);

		namePanel.add(nameTextField, BorderLayout.WEST);
		namePanel.add(nameTextField2, BorderLayout.EAST);

		namePanel.add(player1WinsLabel, BorderLayout.WEST);
		namePanel.add(player2WinsLabel, BorderLayout.EAST);

		namePanel.add(player1LossesLabel, BorderLayout.WEST);
		namePanel.add(player2LossesLabel, BorderLayout.EAST);

	}

	public void buildBottomPanel() {
		bottomButtonPanel = new JPanel();
		welcome = new JLabel("Welcome!");
		newGame = new JButton("New Game");
		reset = new JButton("Reset");
		exit = new JButton("Exit");

		reset.addActionListener(new reset());
		newGame.addActionListener(new newGame());
		exit.addActionListener(new exit());

		bottomButtonPanel.add(welcome);
		bottomButtonPanel.add(newGame);
		bottomButtonPanel.add(reset);
		bottomButtonPanel.add(exit);
	}

	private class exit implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	
	public static void newGameSetUp() {
		zero.setText("Click");
		one.setText("Click");
		two.setText("Click");
		three.setText("Click");
		four.setText("Click");
		five.setText("Click");
		six.setText("Click");
		seven.setText("Click");
		eight.setText("Click");
		gameOver = false;
		board = new String [] {"1", "2", "3", "4", "5", "6", "7", "8", "9"};	
		
		String player1WinScore = "" + player1Wins;		
		player1WinsLabel.setText("Win: " +  player1WinScore);
		
		String player2WinScore = "" + player2Wins;
		player2WinsLabel.setText("Win: " + player2WinScore);

		String player1LossesScore = "" + player1Losses;
		player1LossesLabel.setText("Losses: " + player1LossesScore);
		
		String player2LossesScore = "" + player2Losses;
		player2LossesLabel.setText("Losses: " + player2LossesScore);
		
	}
	
private class newGame implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(player1 == false) {
				newGameSetUp();
			}else if(player1 == true) {
				newGameSetUp();
			}
		}
	}

public static void resetGame() {
	zero.setText("Click");
	one.setText("Click");
	two.setText("Click");
	three.setText("Click");
	four.setText("Click");
	five.setText("Click");
	six.setText("Click");
	seven.setText("Click");
	eight.setText("Click");
	player1Wins = 0;
	player2Wins = 0;
	
	player1Losses = 0;
	player2Losses = 0;
	
	String player1WinScore = "" + player1Wins;		
	player1WinsLabel.setText("Win: " +  player1WinScore);
	
	String player2WinScore = "" + player2Wins;
	player2WinsLabel.setText("Win: " + player2WinScore);

	String player1LossesScore = "" + player1Losses;
	player1LossesLabel.setText("Losses: " + player1LossesScore);
	
	String player2LossesScore = "" + player2Losses;
	player2LossesLabel.setText("Losses: " + player2LossesScore);
	
	nameTextField.setText(null);
	nameTextField2.setText(null);

	board = new String [] {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
}

	private class reset implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		    String[] buttons = { "Yes", "No"};
		    int rc = JOptionPane.showOptionDialog(null, "This will end the game and set the win/loss stats to 0. Are you sure?", "Confirmation",
		    		JOptionPane.YES_NO_OPTION , 0, null, buttons, buttons[1]);

		    if(rc == 0) {
		    	resetGame();
		    }
		}
	}

	private class button1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// when the button is clicks the translation of the word appears
			System.out.println("test constructor call");
			TicTacToe newGame = new TicTacToe();
		}
	}

	private class zero implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (gameOver == false) {
				if (player1 == true && board[0] != "X" && board[0] != "O") {
					board[0] = "X";
					zero.setText("X");
					welcome.setText(nameTextField2.getText());
					bottomButtonPanel.add(welcome);

					player1 = false;
					checksBoard(board, gameOver);
				} else if (player1 == false && board[0] != "X" && board[0] != "O") {
					board[0] = "O";
					zero.setText("O");
					welcome.setText(nameTextField.getText());
					bottomButtonPanel.add(welcome);

					player1 = true;
					checksBoard(board, gameOver);
				}
				checkArray();
			}
		}
	}

	private class one implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (gameOver == false) {
				if (player1 == true) {
					board[1] = "X";
					one.setText("X");
					player1 = false;
					welcome.setText(nameTextField2.getText());
					bottomButtonPanel.add(welcome);
					checksBoard(board, gameOver);
				} else if (player1 == false && board[1] != "X" && board[1] != "O") {
					board[1] = "O";
					one.setText("O");
					player1 = true;
					welcome.setText(nameTextField.getText());
					bottomButtonPanel.add(welcome);
					checksBoard(board, gameOver);
				} else {
					// prompt new panel
				}
				checkArray();
			}
		}
	}

	private class two implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (gameOver == false) {
				if (player1 == true && board[2] != "X" && board[2] != "O") {
					board[2] = "X";
					two.setText("X");
					player1 = false;
					welcome.setText(nameTextField2.getText());
					bottomButtonPanel.add(welcome);
					checksBoard(board, gameOver);
				} else if (player1 == false && board[2] != "X" && board[2] != "O") {
					board[2] = "O";
					two.setText("O");
					welcome.setText(nameTextField.getText());
					bottomButtonPanel.add(welcome);
					player1 = true;
					checksBoard(board, gameOver);
				} else {
					// prompt new panel
				}
				checkArray();
			}
		}
	}

	private class three implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (gameOver == false) {
				if (player1 == true && board[3] != "X" && board[3] != "O") {
					board[3] = "X";
					three.setText("X");
					player1 = false;
					welcome.setText(nameTextField2.getText());
					bottomButtonPanel.add(welcome);
					checksBoard(board, gameOver);
				} else if (player1 == false && board[3] != "X" && board[3] != "O") {
					board[3] = "O";
					three.setText("O");
					player1 = true;
					welcome.setText(nameTextField.getText());
					bottomButtonPanel.add(welcome);
					checksBoard(board, gameOver);
				} else {
					// else
				}
				checkArray();
			}
		}
	}

	private class four implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (gameOver == false) {
				if (player1 == true && board[4] != "X" && board[4] != "O") {
					board[4] = "X";
					four.setText("X");
					player1 = false;
					welcome.setText(nameTextField2.getText());
					bottomButtonPanel.add(welcome);
					checksBoard(board, gameOver);
				} else if (player1 == false && board[4] != "X" && board[4] != "O") {
					board[4] = "O";
					four.setText("O");
					player1 = true;
					welcome.setText(nameTextField.getText());
					bottomButtonPanel.add(welcome);
					checksBoard(board, gameOver);
				} else {
					// prompt new panel
				}
				checkArray();
			}
		}
	}

	private class five implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (gameOver == false) {
				if (player1 == true && board[5] != "X" && board[5] != "O") {
					board[5] = "X";
					five.setText("X");
					player1 = false;
					welcome.setText(nameTextField2.getText());
					bottomButtonPanel.add(welcome);
					checksBoard(board, gameOver);

				} else if (player1 == false && board[5] != "O" && board[5] != "X") {
					board[5] = "O";
					five.setText("O");
					player1 = true;
					welcome.setText(nameTextField.getText());
					bottomButtonPanel.add(welcome);
					checksBoard(board, gameOver);
				} else {
					// prompt panel to say invalid option
				}
				checkArray();
			}
		}
	}

	private class six implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (gameOver == false) {
				if (player1 == true && board[6] != "X" && board[6] != "O") {
					board[6] = "X";
					six.setText("X");
					player1 = false;
					welcome.setText(nameTextField2.getText());
					bottomButtonPanel.add(welcome);
					checksBoard(board, gameOver);

				} else if (player1 == false && board[6] != "O" && board[6] != "X") {
					board[6] = "O";
					six.setText("O");
					player1 = true;
					welcome.setText(nameTextField.getText());
					bottomButtonPanel.add(welcome);
					checksBoard(board, gameOver);

				} else {
					// prompt new panel`
				}
				checkArray();
			}
		}
	}

	private class seven implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (gameOver == false) {
				if (player1 == true && board[7] != "X" && board[7] != "O") {
					board[7] = "X";
					seven.setText("X");
					player1 = false;
					welcome.setText(nameTextField2.getText());
					bottomButtonPanel.add(welcome);
					checksBoard(board, gameOver);

				} else if (player1 == false && board[7] != "X" && board[7] != "O") {
					board[7] = "O";
					seven.setText("O");
					player1 = true;
					welcome.setText(nameTextField.getText());
					bottomButtonPanel.add(welcome);
					checksBoard(board, gameOver);

				} else {
					// prompt new panel
				}
				checkArray();
			}
		}
	}

	private class eight implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (gameOver == false) {
				if (player1 == true && board[8] != "X" && board[8] != "O") {
					board[8] = "X";
					eight.setText("X");
					player1 = false;
					welcome.setText(nameTextField2.getText());
					bottomButtonPanel.add(welcome);
					checksBoard(board, gameOver);
				} else if (player1 == false && board[8] != "X" && board[8] != "O") {
					board[8] = "O";
					eight.setText("O");
					player1 = true;
					welcome.setText(nameTextField.getText());
					bottomButtonPanel.add(welcome);
					checksBoard(board, gameOver);
				}

				checkArray();
			}
		}
	}

	public static void checksBoard(String[] board, boolean gameOver) {
		checkArray();
		if (gameOver == true) {
			System.out.println("game over");
		} else {
			if (board[0] == (board[1]) && board[0] == (board[2])) {
				if (board[2].contentEquals("X")) {
					player1Wins++;
					player2Losses++;
					winner(nameTextField);
					gameOver = true;
					newGameSetUp();
				} else if(board[2].contentEquals("O")){
					player2Wins++;
					player1Losses++;
					winner(nameTextField2);
					gameOver = true;
					newGameSetUp();
				}
			} // 0, 1, 2
			if (board[3] == (board[4]) && board[3] == (board[5])) {
				if (board[3].contentEquals("X")) {
					player1Wins++;
					player2Losses++;
					winner(nameTextField);
					gameOver = true;
					newGameSetUp();
				} else if (board[3].contentEquals("O")) {
					player2Wins++;
					player1Losses++;
					winner(nameTextField2);
					gameOver = true;
					newGameSetUp();
				}
				// 3, 4, 5
				if ((board[6] == (board[7])) && (board[6] == (board[8]))) {
					if (board[6].contentEquals("X")) {
						player1Wins++;
						player2Losses++;
						winner(nameTextField);
						gameOver = true;
						newGameSetUp();
					} else if (board[6].contentEquals("O")) {
						player2Wins++;
						player1Losses++;
						winner(nameTextField2);
						gameOver = true;
						newGameSetUp();
					}
				} // 6, 7, 8
				if (board[0] == (board[3]) && board[0] == (board[6])) {
					if (board[0].contentEquals("X")) {
						player1Wins++;
						player2Losses++;
						winner(nameTextField);
						gameOver = true;
						newGameSetUp();
					} else if (board[0].contentEquals("O")) {
						player2Wins++;
						player1Losses++;
						winner(nameTextField2);
						gameOver = true;
						newGameSetUp();
					}
				} // 0, 3, 6
				if (board[1] == (board[4]) && board[1] == (board[7])) {
					if (board[1].contentEquals("X")) {
						player1Wins++;
						player2Losses++;
						winner(nameTextField);
						gameOver = true;
						newGameSetUp();
					} else if (board[1].contentEquals("O")) {
						player2Wins++;
						player1Losses++;
						winner(nameTextField2);
						gameOver = true;
						newGameSetUp();
					}
				} // 1, 4, 7
				if (board[2] == (board[5]) && board[2] == (board[8])) {
					if (board[2].contentEquals("X")) {
						player1Wins++;
						player2Losses++;
						winner(nameTextField);
						gameOver = true;
						newGameSetUp();
					} else if (board[2].contentEquals("O")) {
						player2Wins++;
						player1Losses++;
						winner(nameTextField2);
						gameOver = true;
						newGameSetUp();
					}
				} // 2, 5, 8
				if (board[0] == (board[4]) && board[0] == (board[8])) {
					System.out.println("048");
					if (board[0].contentEquals("X")) {
						player1Wins++;
						player2Losses++;
						winner(nameTextField);
						gameOver = true;
						newGameSetUp();
					} else if (board[0].contentEquals("O")) {
						player2Wins++;
						player1Losses++;
						winner(nameTextField2);
						gameOver = true;
						newGameSetUp();
					}
				} // 0, 4, 8
				if (board[2] == (board[4]) && board[2] == (board[6])) {
					if (board[2].contentEquals("X")) {
						player1Wins++;
						player2Losses++;
						winner(nameTextField);
						gameOver = true;
						newGameSetUp();
					} else if (board[2].contentEquals("O")) {
						player2Wins++;
						player1Losses++;
						winner(nameTextField2);
						gameOver = true;
						newGameSetUp();
					}
				} // 2, 4, 6
			}
		}
	}

	public static void gameSetUp(boolean gameOver, JLabel player, boolean player1) {

		while (gameOver == false) {
			if (player1 = true) {
				player = new JLabel("Player 1 it is your turn, please click a button");
			} else {
				player = new JLabel("Player 2 it is your turn, please click a button");
			}
			// action button
		}
	}

	public static void checkArray() {
		for (int i = 0; i < board.length; i++) {
			System.out.print(board[i]);
		}
		System.out.println("");
	}

	public static void winner(JTextField nametextField) {
		String name = nametextField.getText();
		final JPanel panel = new JPanel();
		final JButton button1 = new JButton("Yes");
		final JButton button2 = new JButton("No");
		final JLabel messageLabel = new JLabel(name + " wins." + " Would you like to play another round? Click on choice and press okay to confirm.");

		panel.add(messageLabel);
		panel.add(button1);
		panel.add(button2);
		JOptionPane.showMessageDialog(null, panel);
	}
}
