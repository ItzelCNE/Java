package pck2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Main {

	public static void main(String[] args) {
		
	    Frame Ventana = new Frame("Titulo");
	    

	}

}

class Frame extends JFrame{
	
	String Titulo;
	
	public Frame(String Titulo) {
		
		this.Titulo = Titulo;
		setTitle(Titulo);
		setVisible(true);
		setSize(800,800);
		setLocation(400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Labels Label = new Labels();
	    add(Label);
		
		
	}
}

class Labels extends JPanel{
	
	public void paint(Graphics G) {
		super.paint(G);
		
		Graphics2D g2=(Graphics2D) G;
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150); 
		g2.draw(rectangulo);                                         
        Ellipse2D elipse = new Ellipse2D.Double(100,100,200,150);
        g2.draw(elipse);
        g2.drawLine(100,100,300,250);
		
		
		
		
	}
	
}
