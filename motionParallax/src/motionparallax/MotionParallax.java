/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motionparallax;

/**
 *
 * @author jtacs
 */
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;

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
	private int delay = 1;
	protected Timer timer;
        
        Random random = new Random();
        
	private int x = 0; // x position
	private int y = 0; // y position
	private int radius = 15; // ball radius
	private int dx = 2; // increment amount (x coord)
	private int dy = 2; // increment amount (y coord)

	private int skyX = 0;
	private int skyY = 0;
	private int skyWidth;
	private int skyHeight;
	
	private int oceanX = 0;
	private int oceanY = 200;
	private int oceanWidth;
	private int oceanHeight;
	
	private int sunX = 180;
	private int sunY = 50;
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
	
	private int stumpX = 11;
	private int stumpY = 224;
	private int stumpWidth;
	private int stumpHeight;
	
	private int leavesX = 0;
	private int leavesY = 0;
	private int leavesWidth;
	private int leavesHeight;
        
        //private int starX = random(300);
        //private int starY = ;
        
        Color skyColor = Color.CYAN;
        Color sunColor = Color.YELLOW; 
        
        private int time;
	
	/*
	private int[] Mountain1X = {20};
	private int[] Mountain1Y = {25};
	private int Mountain1Width;
	private int Mountain1Height; 
	
	private int Mountain2X = 0;
	private int Mountain2Y = 100;
	private int Mountain2Width;
	private int Mountain2Height; 
*/
	
	public MotionPanel() {
		timer = new Timer(delay, this);
		timer.start(); // start the timer
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMouseMotionListener());
	}

	public void actionPerformed(ActionEvent e)
	// will run when the timer fires
	{
                time++;
		repaint();
                //System.out.println("Time:" + time);
	}

	// draw rectangles and arcs
	public void paint(Graphics g) {
		super.paint(g); // call superclass's paintComponent
                
		g.setColor(skyColor);
		skyWidth = 1000;
		skyHeight = 1000;
		g.fillRect(skyX, skyY, skyWidth, skyHeight);
		
		g.setColor(sunColor);
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
		stumpWidth = 15;
		stumpHeight = 30;
		g.fillRect(stumpX, stumpY, stumpWidth, stumpHeight);
		
		//g.setColor(Color.green);
		/*	g.setColor(Color.GRAY);
		Mountain1Width = 100;
		Mountain1Height = 150;
		g.fillPolygon(Mountain1X, Mountain1Y, 200);
*/
		//g.fillPolygon(Mountain1X,  Mountain1Y,  Mountain1Width);
		/*
		g.setColor(Color.GRAY);
		Mountain2Width = 100;
		Mountain2Height = 200;
		g.fillRect(Mountain2X,  Mountain2Y,  Mountain2Width, Mountain2Height);*/
                
                if (time == 200)
                {
                    skyColor = Color.BLUE;
                    sunColor = Color.WHITE;
                    
                }
	}


	private class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
                    
		}

		public void mouseClicked(MouseEvent e) {
                        
                    int mouseX = e.getX();
			int mouseY = e.getY();
			System.out.println("MouseX:" +  e.getX());
			System.out.println("MouseY:" + e.getY());
			birdX = mouseX;
			birdY = mouseY;
                        repaint();
		}

		public void mouseReleased(MouseEvent e) {
                    
		}

		public void mouseEntered(MouseEvent e) {
                    
		}

		public void mouseExited(MouseEvent e) {
                    sunX -= 10;
                    sunY -= 10;
                    //repaint();
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

			sunX = 190 + (mouseX - 75) / 12;
			sunY = 10 + (mouseY - 75) / 12;
			
			grassX = (mouseX - 300) / 12;
			grassY = 200 + (mouseY) / 12;
			
			stumpX = 30 + (mouseX - 300) / 12;
			stumpY = 190 + (mouseY) / 12;
       
                        repaint();
		}
		

	}

}