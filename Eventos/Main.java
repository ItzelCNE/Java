package Eventos;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;
import javax.swing.*;

public class Main{
	
	public static void main(String[] args) {
         Ventana Principal = new Ventana("Ventana Principal");
         Panel panelx = new Panel();
         Principal.add(panelx);
         panelx.FullScreen.addActionListener(Principal);
         panelx.DefaultSizewin.addActionListener(Principal);
         panelx.DOOG.addActionListener(Principal);
         panelx.EXIT.addActionListener(Principal);
         
   
	}


}

class Ventana extends JFrame implements ActionListener{
	
	private String Titulo;
	Graphics g;
	Image koro;
	

	
	
	public Ventana(String Titulo) {
		setVisible(true);
		setTitle(Titulo);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
     
	   Toolkit tool = Toolkit.getDefaultToolkit();
	   

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object get = e.getSource();
		
		if(get== Panel.FullScreen) {
			setSize(tool.getScreenSize().width,tool.getScreenSize().height);
		} else if(get == Panel.DefaultSizewin) {
			setSize(500,500);
		}else if(get == Panel.DOOG) {
			this.paint(g);
		}
		else if(get == Panel.EXIT) {
			System.exit(0);
		}
		
		
		
		
	}
	
	/*
	public void paint(Graphics g) {
		super.paint(g);
		
		
		File dirimage = new File("src/Imagenes/Lakorone.jpg");
		try {
			koro = ImageIO.read(dirimage);
		} catch (IOException e) {
		   System.out.println("Error");
		}
		g.drawImage(koro,500,150,null);
	}
	
	*/
	
	

	
	
	
}

class Panel extends JPanel{
	
	static JButton FullScreen = new JButton("Set fullscreen");
	static JButton DefaultSizewin = new JButton("Set Default");
	static JButton DOOG = new JButton("DOG");
	static JButton EXIT = new JButton("Exit");
	
	
	public Panel() {
		add(FullScreen);
		add(DefaultSizewin);
		add(DOOG);
		add(EXIT);
	}
	
	
		
	}
	








