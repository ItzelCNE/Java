package com.Itzel.lifecells;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PANEL extends JPanel implements ActionListener {
    
	JButton Boton = new JButton("Boton");

	public PANEL() {		
		Boton.addActionListener(this);
		//LifeCells TESTUNIT01 = new LifeCells();
		add(Boton);
	}
	
	public void paint(Graphics G) {
	    super.paint(G);
		G.drawRect(LifeCells.X, LifeCells.Y, 5, 5);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int max = 200;
		int min = 0;
		int nextMoveNumber = (int)(Math.random()*(max-min+1)+min); 
		
		if(nextMoveNumber>=0 && nextMoveNumber<50 ) { // 
			LifeCells.X = LifeCells.X + 10;
		}if(nextMoveNumber>=50 && nextMoveNumber<100 ) { // 
			LifeCells.X = LifeCells.X - 10;
		}if(nextMoveNumber>=100 && nextMoveNumber<150 ) { // 
			LifeCells.Y = LifeCells.Y - 10;
		}if(nextMoveNumber>=150 && nextMoveNumber<=200 ) { //
			LifeCells.Y = LifeCells.Y + 10;
		}else {
			System.out.println("ERROR");
			}
		
		repaint();
		System.out.println(nextMoveNumber);

		
		
		
	}


}
