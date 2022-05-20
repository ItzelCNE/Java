package Temp2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main{
	
public static void main(String[] args) {

	init();
	
	
 }
   
   public static void init() {
	   FRAME mainFrame = new FRAME("Main");
	   FRAME secondFrame = new FRAME("Second");
	   mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   secondFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	   mainFrame.add(new BorderPanel());
	   secondFrame.add(new FlowPanel());
	   
   }


}



class FRAME extends JFrame{
	
	
	static int x = 250;
	static int y = 225;
	
	public FRAME(String title) {
		
		
		setSize(500,500);
		setLocation(x,y);
		setTitle(title);
		setVisible(true);
		
		x = x + 500;
		
		
	}
	
}

class BorderPanel extends JPanel{
	
	
	public BorderPanel() {
	 setLayout(new BorderLayout(5,5));
	 add(new JButton("00"),BorderLayout.NORTH);
	 add(new JButton("01"),BorderLayout.SOUTH);
	 add(new JButton("02"),BorderLayout.WEST);
	 add(new JButton("03"),BorderLayout.EAST);
	 add(new JButton("04"),BorderLayout.CENTER);
		
	}
	
}

class FlowPanel extends JPanel{
	
	public FlowPanel() {
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(new JButton("00"));
		 add(new JButton("01"));
		 add(new JButton("02"));
		 add(new JButton("03"));
		 add(new JButton("04"));
		
		
	}
	
} 
	
    
	
	
 



	
	


