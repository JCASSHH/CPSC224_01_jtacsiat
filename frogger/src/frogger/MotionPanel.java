/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author jtacs
 */
public class MotionPanel extends JPanel implements ActionListener, KeyListener {
    frog testFrog = new frog();
    private int delay = 10;
    private int gameTime;
    protected Timer timer;
    
    public MotionPanel(){
        timer = new Timer(delay,this);
        timer.start();
        this.addKeyListener(this);
        this.setFocusable(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        gameTime++;
        //System.out.println("gameTime " + gameTime);
        //testFrog.moveDown();
        repaint();
        //System.out.println("JALEN IS DADDY!!!!!!!!!!!! and loves titties");
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        testFrog.paint(g);
    }
    
    @Override
    public void keyTyped(KeyEvent e){
        //System.out.println("in key typed");
        
    }
    @Override 
    public void keyPressed(KeyEvent e){
        //System.out.println("in key released");
        int testKey = e.getKeyCode();
        switch (e.getKeyCode()){
            case KeyEvent.VK_RIGHT:
                testFrog.moveRight();
                break;
            case KeyEvent.VK_LEFT:
                testFrog.moveLeft();
                break;
            case KeyEvent.VK_DOWN:
                testFrog.moveDown();
                break;
            case KeyEvent.VK_UP:
                testFrog.moveUp();
                break;
        }
        //testFrog.moveDown();
        //System.out.println(testKey);
    }
    @Override
    public void keyReleased(KeyEvent e){
        
    }
}
