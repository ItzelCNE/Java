package pck2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;

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
		setLocation(400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Labels Label = new Labels();
	    add(Label);
	    
	    Toolkit Pantalla = Toolkit.getDefaultToolkit();
	    Image Icono = Pantalla.getImage("./icon.jpg");   
	    setIconImage(Icono);	
	    
	    
	    Dimension Screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int alto = Screen.height;
	    int ancho = Screen.width;
	    setSize(ancho,alto);
		
		
	}
}

class Labels extends JPanel{
	
	private Image imagen;
	
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
        Font Fuente = new Font("Arial",Font.ITALIC, 26);
        g2.setFont(Fuente);
        //g2.setFont(new Font("Arial", Font.BOLD, 51)); tambien se puede declarar el obj en el mismo metodo
        g2.setColor(Color.BLACK);
        g2.drawString("sisisis", 300, 250);
    	File dirImagen = new File("./Crazysheep.jpg");
    	
        try {
			imagen = ImageIO.read(dirImagen);
		} catch (IOException e) {
				
			System.out.println("Error al buscar la imagen!");
		}
        
		Graphics g=(Graphics2D) g2;

        g.drawImage(imagen, 500, 500, null);
        
  	
		
	}
	
}
