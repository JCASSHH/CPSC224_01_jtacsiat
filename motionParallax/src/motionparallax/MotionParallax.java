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

public class MotionParallax
{
   // execute application
   public static void main( String args[] )
   {
      JFrame frame = new JFrame( "Bouncing Ball" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      MotionPanel bp = new MotionPanel(); 
      frame.add( bp );
      frame.setSize( 300, 300 ); // set frame size
      frame.setVisible( true ); // display frame
      
      
   } // end main
}


// class BallPanel

class MotionPanel extends JPanel implements ActionListener
{
   private int delay = 10;
   protected Timer timer;

   private int x = 0;		// x position
   private int y = 0;		// y position
   private int radius = 15;	// ball radius

   private int dx = 2;		// increment amount (x coord)
   private int dy = 2;		// increment amount (y coord)
   
   private int oceanX =150;
   private int oceanY = 150;    
   private int oceanWidth;
   private int oceanHeight;
   
   public MotionPanel()
   {
        timer = new Timer(delay, this);
	timer.start();		// start the timer
        addMouseListener(new MyMouseListener());
        addMouseMotionListener(new MyMouseMotionListener());
   }

   public void actionPerformed(ActionEvent e)
   // will run when the timer fires
   {
	repaint();
   }

   // draw rectangles and arcs
   public void paintComponent( Graphics g )
   {
        super.paintComponent( g ); // call superclass's paintComponent 
        oceanWidth = 30;
        oceanHeight = 40;
        g.setColor(Color.blue);
        g.fillRect(oceanX, oceanY, oceanWidth, oceanHeight);
   }
   
 
   private class MyMouseListener implements MouseListener
   {
      public void mousePressed(MouseEvent e)
      {
          
      }

      public void mouseClicked(MouseEvent e)
      {
          System.out.println(e.getX());
          System.out.println(e.getY());
      }

      public void mouseReleased(MouseEvent e)
      {
          
      }

      public void mouseEntered(MouseEvent e)
      {
      }

      public void mouseExited(MouseEvent e)
      {
          
      }
   }
   private class MyMouseMotionListener implements MouseMotionListener
   {
       public void mouseDragged(MouseEvent e) {
           
       }
       public void mouseMoved(MouseEvent e){
           int mouseX = e.getX();
           int mouseY = e.getY();
           oceanX = mouseX/2;
           oceanY = mouseY/2;
           //System.out.println(oceanX);
           mouseX += oceanX;

       }

       
   }

}
