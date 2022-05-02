package com.Itzel.lifecells;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class PANEL extends JPanel {
	
	LifeCells TESTUNIT01 = new LifeCells();
	LifeCells TESTUNIT02 = new LifeCells();
	LifeCells TESTUNIT03 = new LifeCells();

    
	Event Listener = new Event();
	Timer Temporizador = new Timer(1000, Listener);
	
	public PANEL() {		
		Temporizador.start();
		
	}
	
	public void paint(Graphics G) {		
	    super.paint(G);
		TESTUNIT01.paint(G);
		TESTUNIT02.paint(G);
		TESTUNIT03.paint(G);
	
	}
	
	
	
	class Event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			TESTUNIT01.Movement();
			TESTUNIT02.Movement();
			TESTUNIT03.Movement();
			repaint();
		}

		
	
		}
		
	}



