package motionParallax;

import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MotionParallax {
	// execute application
	public static void main(String args[]) {

		JFrame frame = new JFrame("Motion Parallax");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MotionPanel bp = new MotionPanel();
		frame.add(bp);
		frame.setSize(300, 300); // set frame size
		frame.setVisible(true); // display frame
	} // end main
}

// class BallPanel

class MotionPanel extends JPanel implements ActionListener {
	private int delay = 10;
	protected Timer timer;
	private int x = 0; // x position
	private int y = 0; // y position
	private int radius = 15; // ball radius
	private int dx = 2; // increment amount (x coord)
	private int dy = 2; // increment amount (y coord)

	private int skyX = 2000;
	private int skyY = 2000;
	private int skyWidth;
	private int skyHeight;
	
	private int oceanX = 0;
	private int oceanY = 200;
	private int oceanWidth;
	private int oceanHeight;
	
	private int sunX = 110;
	private int sunY = 250;
	private int sunWidth;
	private int sunHeight;
	
	private int grassX = 0;
	private int grassY = 200;
	private int grassWidth;
	private int grassHeight; 
	
	private int birdX = 0;
	private int birdY = 0;
	private int birdWidth;
	private int birdHeight;
	
	private int stump1X = 0;
	private int stump1Y = 75;
	private int stump1Width;
	private int stump1Height;
	
	private int leaves1X = 0;
	private int leaves1Y = 0;
	private int leaves1Width;
	private int leaves1Height;
	
	private int stump2X = 0;
	private int stump2Y = 75;
	private int stump2Width;
	private int stump2Height;
	
	private int leaves2X = 0;
	private int leaves2Y = 0;
	private int leaves2Width;
	private int leaves2Height;
	
	private int stump3X = 0;
	private int stump3Y = 75;
	private int stump3Width;
	private int stump3Height;
	
	private int leaves3X = 0;
	private int leaves3Y = 0;
	private int leaves3Width;
	private int leaves3Height;
	
	private int cloud1X = 0;
	private int cloud1Y = 0;
	private int cloud1Width;
	private int cloud1Height;
	
	private int cloud2X = 0;
	private int cloud2Y = 0;
	private int cloud2Width;
	private int cloud2Height;
	
	private int cloud3X = 0;
	private int cloud3Y = 0;
	private int cloud3Width;
	private int cloud3Height;
	
	private int cloud4X = 0;
	private int cloud4Y = 0;
	private int cloud4Width;
	private int cloud4Height;
	
	private int cloud5X = 0;
	private int cloud5Y = 0;
	private int cloud5Width;
	private int cloud5Height;
	
	
	private int cloud1AX = 0;
	private int cloud1AY = 0;
	private int cloud1AWidth;
	private int cloud1AHeight;
	
	private int cloud2AX = 0;
	private int cloud2AY = 0;
	private int cloud2AWidth;
	private int cloud2AHeight;
	
	private int cloud3AX = 0;
	private int cloud3AY = 0;
	private int cloud3AWidth;
	private int cloud3AHeight;
	
	private int cloud4AX = 0;
	private int cloud4AY = 0;
	private int cloud4AWidth;
	private int cloud4AHeight;
	
	private int cloud5AX = 0;
	private int cloud5AY = 0;
	private int cloud5AWidth;
	private int cloud5AHeight;
	
	
	
	
	public MotionPanel() {
		timer = new Timer(delay, this);
		timer.start(); // start the timer
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMouseMotionListener());
	}

	public void actionPerformed(ActionEvent e)
	// will run when the timer fires
	{
		repaint();
	}

	// draw rectangles and arcs
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // call superclass's paintComponent
		
		skyWidth = 1000;
		skyHeight = 1000;
		g.setColor(Color.cyan);
		g.fillRect(skyX, skyY, skyWidth, skyHeight);
		
		oceanWidth = 30;
		oceanHeight = 40;
		g.setColor(Color.blue);
		g.fillRect(oceanX, oceanY, oceanWidth, oceanHeight);
		
		// paintSun(g);
		// super.paintComponent(g);
		g.setColor(Color.YELLOW);
		sunWidth = 55;
		sunHeight = 55;
		g.fillOval(sunX, sunY, sunWidth, sunHeight);
		
		g.setColor(Color.GREEN);
		grassWidth = 1000;
		grassHeight = 150;
		g.fillRect(grassX,  grassY,  grassWidth, grassHeight);
		
		g.setColor(Color.black);
		birdWidth = 35;
		birdHeight = 10;
		g.fillOval(birdX, birdY, birdWidth, birdHeight);
		
		g.setColor(Color.DARK_GRAY);
		stump1Width = 15;
		stump1Height = 30;
		g.fillRect(stump1X, stump1Y, stump1Width, stump1Height);
		
		g.setColor(Color.green);
		leaves1Width = 35;
		leaves1Height = 45;
		g.fillOval(leaves1X, leaves1Y, leaves1Width,leaves1Height);
		
		g.setColor(Color.DARK_GRAY);
		stump2Width = 15;
		stump2Height = 30;
		g.fillRect(stump2X, stump2Y, stump2Width, stump2Height);
		
		g.setColor(Color.green);
		leaves2Width = 35;
		leaves2Height = 45;
		g.fillOval(leaves2X, leaves2Y, leaves2Width,leaves2Height);
		
		g.setColor(Color.DARK_GRAY);
		stump3Width = 15;
		stump3Height = 30;
		g.fillRect(stump3X, stump3Y, stump3Width, stump3Height);
		
		g.setColor(Color.green);
		leaves3Width = 35;
		leaves3Height = 45;
		g.fillOval(leaves3X, leaves3Y, leaves3Width,leaves3Height);
		
		g.setColor(Color.white);
		cloud1Width = 25;
		cloud1Height = 25;
		g.fillOval(cloud1X, cloud1Y, cloud1Width, cloud1Height);
		
		g.setColor(Color.white);
		cloud2Width = 25;
		cloud2Height = 25;
		g.fillOval(cloud2X, cloud2Y, cloud2Width, cloud2Height);
		
		g.setColor(Color.white);
		cloud3Width = 25;
		cloud3Height = 25;
		g.fillOval(cloud3X, cloud3Y, cloud3Width, cloud3Height);
		
		g.setColor(Color.white);
		cloud4Width = 25;
		cloud4Height = 25;
		g.fillOval(cloud4X, cloud4Y, cloud4Width, cloud4Height);
		
		g.setColor(Color.white);
		cloud5Width = 25;
		cloud5Height = 25;
		g.fillOval(cloud5X, cloud5Y, cloud5Width, cloud5Height);
		
		g.setColor(Color.white);
		cloud1AWidth = 25;
		cloud1AHeight = 25;
		g.fillOval(cloud1AX, cloud1AY, cloud1AWidth, cloud1AHeight);
		
		g.setColor(Color.white);
		cloud2AWidth = 25;
		cloud2AHeight = 25;
		g.fillOval(cloud2AX, cloud2AY, cloud2AWidth, cloud2AHeight);
		
		g.setColor(Color.white);
		cloud3AWidth = 25;
		cloud3AHeight = 25;
		g.fillOval(cloud3AX, cloud3AY, cloud3AWidth, cloud3AHeight);
		
		g.setColor(Color.white);
		cloud4AWidth = 25;
		cloud4AHeight = 25;
		g.fillOval(cloud4AX, cloud4AY, cloud4AWidth, cloud4AHeight);
		
		g.setColor(Color.white);
		cloud5AWidth = 25;
		cloud5AHeight = 25;
		g.fillOval(cloud5AX, cloud5AY, cloud5AWidth, cloud5AHeight);
	
	}

	public void paintSun(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		sunWidth = 100;
		sunHeight = 100;
		g.fillOval(sunX, sunY, sunWidth, sunHeight);
	}

	private class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
		}

		public void mouseClicked(MouseEvent e) {
			System.out.println(e.getX());
			System.out.println(e.getY());
			
			int mouseX = e.getX();
			int mouseY = e.getY();
			
			birdX = mouseX;
			birdY = mouseY;

		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}
	}

	private class MyMouseMotionListener implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
		}

		public void mouseMoved(MouseEvent e) {
			int mouseX = e.getX();
			int mouseY = e.getY();
			
			skyX = mouseX - 300;
			skyY = mouseY - 300;;
			
			oceanX = (mouseX + 5);
			oceanY = (mouseY + 5);
			
			sunX = 190 + (mouseX - 75) / 12;
			sunY = 10 + (mouseY - 75) / 12;
			
			grassX = (mouseX - 300) / 12;
			grassY = 200 + (mouseY) / 12;
			
			stump1X = 30 + (mouseX - 300) / 12;
			stump1Y = 190 + (mouseY) / 12;
			
			leaves1X = 20 + (mouseX - 300) / 12;
			leaves1Y = 150 + (mouseY) / 12;
			
			stump2X = 70 + (mouseX - 300) / 12;
			stump2Y = 200 + (mouseY) / 12;
			
			leaves2X = 60 + (mouseX - 300) / 12;
			leaves2Y = 160 + (mouseY) / 12;
			
			stump3X = 107 + (mouseX - 300) / 12;
			stump3Y = 197 + (mouseY) / 12;
			
			leaves3X = 97 + (mouseX - 300) / 12;
			leaves3Y = 157 + (mouseY) / 12;
			
			cloud1X = 97 + (mouseX - 300) / 12;
			cloud1Y = 10 + (mouseY) / 12;
			
			cloud2X = 107 + (mouseX - 300) / 12;
			cloud2Y = 15 + (mouseY) / 12;
			
			cloud3X = 94 + (mouseX - 300) / 12;
			cloud3Y = 25 + (mouseY) / 12;
			
			cloud4X = 87 + (mouseX - 300) / 12;
			cloud4Y = 15 + (mouseY) / 12;
			
			cloud5X = 110 + (mouseX - 300) / 12;
			cloud5Y = 25 + (mouseY) / 12;
			
			cloud1AX = 47 + (mouseX - 300) / 12;
			cloud1AY = 30 + (mouseY) / 12;
			
			cloud2AX = 47 + (mouseX - 300) / 12;
			cloud2AY = 35 + (mouseY) / 12;
			
			cloud3AX = 60 + (mouseX - 300) / 12;
			cloud3AY = 50 + (mouseY) / 12;
			
			cloud4AX = 40 + (mouseX - 300) / 12;
			cloud4AY = 45 + (mouseY) / 12;
			
			cloud5AX = 60 + (mouseX - 300) / 12;
			cloud5AY = 35 + (mouseY) / 12;
			
			
		}
	}
}