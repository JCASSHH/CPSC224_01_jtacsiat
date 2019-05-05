/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

/**
 *
 * @author jtacs
 */
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Icons{
		
		/* ImagePanel panel = new ImagePanel(new ImageIcon("court.png").getImage());

			    JFrame frame = new JFrame();
			    frame.getContentPane().add(panel);
			    frame.pack();
			    frame.setVisible(true);
			    */
			    
		JFrame f = new JFrame("Spike Madness!");

		ImageIcon spike = new ImageIcon("Spike.png");
		ImageIcon auburn = new ImageIcon("auburn.png");
		ImageIcon duke = new ImageIcon("duke.png");
		ImageIcon kentucky = new ImageIcon("kentucky.png");
		ImageIcon michigan = new ImageIcon("michiganState.png");
		ImageIcon texas = new ImageIcon("texasTech.png");
		ImageIcon virginia = new ImageIcon("virginia.png");

		JLabel spikeLabel, auburnLabel, dukeLabel, kentuckyLabel, michiganLabel, texasLabel, virginiaLabel;

		JPanel subPanel1 = new JPanel();
		
		/*subPanel1.setPreferredSize(new Dimension(400, 400));
		subPanel1.setBackground(Color.orange);
		spikeLabel = new JLabel(spike, SwingConstants.CENTER);
		auburnLabel = new JLabel(auburn, SwingConstants.LEFT);
		dukeLabel = new JLabel(duke, SwingConstants.CENTER);
		kentuckyLabel = new JLabel(kentucky, SwingConstants.LEFT);
		michiganLabel = new JLabel(michigan, SwingConstants.CENTER);
		texasLabel = new JLabel(texas, SwingConstants.LEFT);
		virginiaLabel = new JLabel(virginia, SwingConstants.LEFT);
		
		subPanel1.add(spikeLabel);
		subPanel1.add(auburnLabel);
		subPanel1.add(dukeLabel);
		subPanel1.add(kentuckyLabel);
		subPanel1.add(michiganLabel);
		subPanel1.add(texasLabel);
		subPanel1.add(virginiaLabel);
		
		f.setSize(1700, 1000);
		f.setVisible(true);
		f.add(subPanel1);
		System.out.println("Success.....");*/
	
}
