import javax.swing.*; // Needed for Swing classes
import java.awt.event.*; // Needed for event listener interface
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {
	private JLabel players; // To display a message
	private JButton zero;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private String board[];
	boolean player1;
	static boolean gameOver = false;
	

	public static void main(String[] args) {
		// is true when player1 is playing, is false when player2 is playing
		String[] board = { "O", "O", "O", "X", "X" };
		//testing
		checksBoard(board, gameOver);
	}

	private class zero implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[0] = "X";
				zero = new JButton("X");
				player1 = false;
			} else {
				board[0] = "O";
				zero = new JButton("O");
				player1 = true;
			}
		}
	}
	
	private class one implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[1] = "X";
				zero = new JButton("X");
				player1 = false;
			} else {
				board[1] = "O";
				zero = new JButton("O");
				player1 = true;
			}
		}
	}

	private class two implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[1] = "X";
				zero = new JButton("X");
				player1 = false;
			} else {
				board[1] = "O";
				zero = new JButton("O");
				player1 = true;
			}
		}
	}
	
	private class three implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[1] = "X";
				zero = new JButton("X");
				player1 = false;
			} else {
				board[1] = "O";
				zero = new JButton("O");
				player1 = true;
			}
		}
	}

	private class four implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[1] = "X";
				zero = new JButton("X");
				player1 = false;
			} else {
				board[1] = "O";
				zero = new JButton("O");
				player1 = true;
			}
		}
	}

	private class five implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[1] = "X";
				zero = new JButton("X");
				player1 = false;
			} else {
				board[1] = "O";
				zero = new JButton("O");
				player1 = true;
			}
		}
	}

	private class six implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[1] = "X";
				zero = new JButton("X");
				player1 = false;
			} else {
				board[1] = "O";
				zero = new JButton("O");
				player1 = true;
			}
		}
	}

	private class seven implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[1] = "X";
				zero = new JButton("X");
				player1 = false;
			} else {
				board[1] = "O";
				zero = new JButton("O");
				player1 = true;
			}
		}
	}
	
	private class eight implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[1] = "X";
				zero = new JButton("X");
				player1 = false;
			} else {
				board[1] = "O";
				zero = new JButton("O");
				player1 = true;
			}
		}
	}
	
	public static void checksBoard(String[] board, boolean gameOver) {
		
		if (board[0].contentEquals(board[1]) && board[0].contentEquals(board[2])) {
			System.out.println("Winner");
			gameOver = true;
		} // 0, 1, 2
		if (board[3].contentEquals(board[4]) && board[3].contentEquals(board[5])) {
			System.out.println("Winner");
			gameOver = true;

		} // 3, 4, 5
		if (board[6].contentEquals(board[7]) && board[6].contentEquals(board[8])) {
			System.out.println("Winner");
			gameOver = true;

		} // 6, 7, 8
		if (board[0].contentEquals(board[3]) && board[0].contentEquals(board[6])) {
			System.out.println("Winner");
			gameOver = true;

		} // 0, 3, 6
		if (board[1].contentEquals(board[4]) && board[1].contentEquals(board[7])) {
			System.out.println("Winner");
			gameOver = true;

		} // 1, 4, 7
		if (board[2].contentEquals(board[5]) && board[2].contentEquals(board[8])) {
			System.out.println("Winner");
			gameOver = true;

		} // 2, 5, 8
		if (board[0].contentEquals(board[4]) && board[0].contentEquals(board[8])) {
			System.out.println("Winner");
			gameOver = true;

		} // 0, 4, 8
		if (board[2].contentEquals(board[4]) && board[2].contentEquals(board[6])) {
			System.out.println("Winner");
			gameOver = true;

		} // 2, 4, 6
	}
	
	public static void gameSetUp(boolean gameOver, JLabel player, boolean player1) {
		while(gameOver == false) {
			if(player1 = true) {
				player = new JLabel("Player 1 it is your turn, please click a button");
			}else {
				player = new JLabel("Player 2 it is your turn, please click a button");
			}
			//action button
		}
	}
}
