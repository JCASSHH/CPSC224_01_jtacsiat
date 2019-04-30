/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

/**
 *
 * @author jtacs
 */
public class Frogger {
    

    public static void main(String[] args) {
        JFrame frame = new JFrame("Spike Madness!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MotionPanel gamePanel = new MotionPanel();
        frame.add(gamePanel);
        frame.setSize(800,800);
        frame.setVisible(true);
    }
}
