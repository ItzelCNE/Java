package com.Itzel.lifecells;

import java.awt.Graphics;

import javax.swing.JPanel;

public class LifeCells extends JPanel  {
	
	

	

	 int X = 250;
	 int Y = 250;
	public LifeCells() {
		
	}
	
	
	
	public void paint(Graphics G) {
		G.drawRect(this.X, this.Y, 5, 5);	}
	

	

     public void Movement() {
    	 
    	 int max = 200;
 		int min = 0;
 		int nextMoveNumber = (int)(Math.random()*(max-min+1)+min); 
 		
 		if(nextMoveNumber>=0 && nextMoveNumber<50 ) { // 
 			this.X = this.X + 10;
 		}if(nextMoveNumber>=50 && nextMoveNumber<100 ) { // 
 			this.X = this.X - 10;
 		}if(nextMoveNumber>=100 && nextMoveNumber<150 ) { // 
 			this.Y = this.Y - 10;
 		}if(nextMoveNumber>=150 && nextMoveNumber<=200 ) { //
 			this.Y = this.Y + 10;
 		}else {
 			
 			}
 		
 	
 		System.out.println(nextMoveNumber);

     }
	
	

}

	



