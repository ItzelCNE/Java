package pck2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		
		String [] Fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();		
		String PanelFuente = JOptionPane.showInputDialog("Introduce fuente");
		int i;		
		boolean fuenteP = false;		
		System.out.println("Fuentes disponibles: (" + Fuentes.length + ")" );		
		for(i=0; i<Fuentes.length;i++) {						                                        
			if(Fuentes[i].equalsIgnoreCase(PanelFuente)) {
				fuenteP = true;
			}
			
		}
		if(fuenteP) {
			System.out.println("Fuente instalada!");}
		else { 
		System.out.println("Fuente no instalada!");
		}
			
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
	    
	    Toolkit Pantalla = Toolkit.getDefaultToolkit();
	    Image Icono = Pantalla.getImage("./icon.jpg");   
	    setIconImage(Icono);	
		
		
	}
}

class Labels extends JPanel{
	
	public void paint(Graphics G) {
		super.paint(G);
		
		Graphics2D g2=(Graphics2D) G;
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150); 
		g2.setPaint(Color.darkGray);
		g2.fill(rectangulo);                                         
        Ellipse2D elipse = new Ellipse2D.Double(100,100,200,150);
        elipse.setFrame(rectangulo);
        g2.setPaint(Color.MAGENTA); // es posible el uso de rgb para colores mas especificos (instanciando clase color con el constructor respectivo para rgb (necesita 3 args).
        g2.fill(elipse);
        g2.draw(elipse);
        //g2.drawLine(100,100,300,250);
        
		
		
		
		
	}
	
}
