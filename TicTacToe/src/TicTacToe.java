import java.awt.*;
import javax.swing.*; // Needed for Swing classes
import java.awt.event.*; // Needed for event listener interface
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {
    private JLabel messageLabel;
    private JPanel panel;
    private JFrame frame;
    private GridLayout layout;
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
    public static String board[] = new String[9];
    public boolean player1 = true;
    public boolean chosen;
    public static boolean gameOver = false;
    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 500;

  public TicTacToe()
  {
    setTitle("TicTacToe");
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    messageLabel = new JLabel ("");

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
    
    panel = new JPanel();
    panel.add(messageLabel);
    panel.add(zero);
    panel.add(one);
    panel.add(two);
    panel.add(three);
    panel.add(four);
    panel.add(five);
    panel.add(six);
    panel.add(seven);
    panel.add(eight);
    add(panel);
    setVisible(true);

  }


    private class zero implements ActionListener {
            public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[0] = "X";
                                zero.setText("X");
				player1 = false;
                                chosen = true;
                                System.out.println("Test 2");
			} else if (chosen == false){
				board[0] = "O";
                                zero.setText("O");
				player1 = true;
			}
		}
	}

	private class one implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[1] = "X";
				one.setText("X");
				player1 = false;
			} else {
				board[1] = "O";
				one.setText("O");
				player1 = true;
			}
		}
	}

	private class two implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[2] = "X";
				two.setText("X");
				player1 = false;
			} else {
				board[2] = "O";
				two.setText("O");
				player1 = true;
			}
		}
	}

	private class three implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[3] = "X";
				three.setText("X");
				player1 = false;
			} else {
				board[3] = "O";
				three.setText("O");
				player1 = true;
			}
		}
	}

	private class four implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[4] = "X";
				four.setText("X");
				player1 = false;
			} else {
				board[4] = "O";
				four.setText("O");
				player1 = true;
			}
		}
	}

	private class five implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[5] = "X";
				five.setText("X");
				player1 = false;
			} else {
				board[5] = "O";
				five.setText("O");
				player1 = true;
			}
		}
	}

	private class six implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[6] = "X";
				six.setText("X");
				player1 = false;
			} else {
				board[6] = "O";
				six.setText("O");
				player1 = true;
			}
		}
	}

	private class seven implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[7] = "X";
				seven.setText("X");
				player1 = false;
			} else {
				board[7] = "O";
				seven.setText("O");
				player1 = true;
			}
		}
	}

	private class eight implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (player1 == true) {
				board[8] = "X";
				eight.setText("X");
				player1 = false;
			} else {
				board[8] = "O";
				eight.setText("O");
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
  public static void main(String[] args) {
		// is true when player1 is playing, is false when player2 is playing
		//String[] board = { "O", "O", "O", "X", "X" };
		//testing
		boolean gameOver = false;
                new TicTacToe();
                checksBoard(board, gameOver);
}
}
