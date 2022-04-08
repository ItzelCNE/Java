package pack1;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame extends JFrame {

	private String Title;
	private boolean MaxSize;
	
	Toolkit Screen = Toolkit.getDefaultToolkit();
	Dimension screensize = Screen.getScreenSize();
	
	int altura = screensize.height;
	int ancho = screensize.width;	
	
	Image Icono = Screen.getImage("src/Icon/icon.jpg");
	
	
	public Frame(String Title, boolean MaxSize) {
		
		setTitle(Title);
		setSize(ancho/2,altura/2);
		setLocation(ancho/4,altura/4);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setIconImage(Icono);
	    
	    
		
	    
	   
		
		
	}

}


	

