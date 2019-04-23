/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author jtacs
 */
public class frog {
    private int xcor = 100;
    private int ycor = 100;
    private int length = 100; //in terms of y
    private int width = 100; //in terms of x
    
    public int getXCor(){
        return xcor;
    }
    public int getYCor(){
        return ycor;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(xcor, ycor, width, length); 
    }
    public void moveLeft(){
        xcor -=10;
        System.out.println("x: " + xcor + " y: " + ycor);
    }
    public void moveRight(){
        xcor +=10;
        System.out.println("x: " + xcor + " y: " + ycor);
    }
    public void moveUp(){
        ycor -=10;
        System.out.println("x: " + xcor + " y: " + ycor);
    }
    public void moveDown(){
        ycor +=10;
        System.out.println("x: " + xcor + " y: " + ycor);
    }
}




