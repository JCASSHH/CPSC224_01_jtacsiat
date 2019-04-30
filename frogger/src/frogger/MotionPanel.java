/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

/**
 *
 * @author jtacs
 */
public class MotionPanel extends JPanel implements ActionListener, KeyListener  {
    frog testFrog = new frog();
    private int delay = 10;
    private int gameTime;
    protected Timer timer;
    private int obstacleX = 10;
    private int obstacleY = 10;
   
    ImageIcon spike = new ImageIcon("Spike.png");
    ImageIcon auburn = new ImageIcon("auburn.png");
    ImageIcon duke = new ImageIcon("duke.png");
    ImageIcon kentucky = new ImageIcon("kentucky.png");
    ImageIcon michigan = new ImageIcon("michiganState.png");
    ImageIcon texas = new ImageIcon("texasTech.png");
    ImageIcon virginia = new ImageIcon("virginia.png");
           
    int spikeX = 350;
    int spikeY = 600;
    int auburnX = 0;
    int auburnY = 300;
    int dukeX = 0;
    int dukeY = 50;
    int kentuckyX = 680;
    int kentuckyY = 150;
    int michiganX = 200;
    int michiganY = 200;
    int texasX = 100;
    int texasY = 450;
    int virginiaX = 680;
    int virginiaY = 450;
    

    public MotionPanel(){
        
    timer = new Timer(delay,this);
    timer.start();
    this.addKeyListener(this);
    this.setFocusable(true);
    this.setSize(800, 800);
    //this.setLayout(new BorderLayout(6,6));
    
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        gameTime++;
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        spike.paintIcon(this, g, spikeX, spikeY);
        duke.paintIcon(this, g, dukeX, dukeY);
        auburn.paintIcon(this, g ,auburnX, auburnY);
        kentucky.paintIcon(this, g, kentuckyX, kentuckyY);
        michigan.paintIcon(this, g, michiganX, michiganY);
        texas.paintIcon(this, g, texasX, texasY);
        virginia.paintIcon(this, g, virginiaX, virginiaY);   
        //repaint();
    }
    
    @Override
    public void keyTyped(KeyEvent e){
    }
    @Override 
    public void keyPressed(KeyEvent e){
        if(SpikeDied()==true){
            //spikeLabel.setVisible(false);
            spikeX = 500;
            spikeY = 500;
            repaint();
        }
        switch (e.getKeyCode()){
            case KeyEvent.VK_RIGHT:
                spikeX += 10;
                System.out.println("spikeX " + spikeX);
                repaint();
                break;
            case KeyEvent.VK_LEFT:
                spikeX -=10;
                break;
            case KeyEvent.VK_DOWN:
                spikeY +=10;
                break;
            case KeyEvent.VK_UP:
                spikeY -=10;
                break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e){
        
    }
    public boolean SpikeDied()
    {

        if(spikeX == auburnX)
        {
            if(spikeY == auburnY)
            {
                return true;
            }
        }
        if(spikeX == dukeX)
        {
            if(spikeY == dukeY)
            {
                return true;
            }
        }
        if(spikeX == kentuckyX)
        {
            if(spikeY == kentuckyY)
            {
                return true;
            }
        }
        if(spikeX == michiganX)
        {
            if(spikeY == michiganY)
            {
                return true;
            }
        }
        if(spikeX == texasX)
        {
            if(spikeY == texasY)
            {
                return true;
            }
        }
        if(spikeX == virginiaX)
        {
            if(spikeY == virginiaY)
            {
                return true;
            }
        }
		
       return false;
    }
    
}
