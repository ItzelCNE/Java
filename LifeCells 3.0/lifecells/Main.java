package com.Itzel.lifecells;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		
		init();
	
	}
	
	
	public Main() {
		
	}
	
	private static void init() {
		FRAME MainFrame = new FRAME("Main Window");
		PANEL MainPanel = new PANEL(); 
		
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.setVisible(true);
		MainFrame.add(MainPanel);
		
	}

}
