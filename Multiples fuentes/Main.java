package Temp2;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Main{
	public static void main(String[] args) {
		
		FRAME mainFrame = new FRAME();
		PANEL mainPanel = new PANEL();
		mainFrame.add(mainPanel);
		
	}
}
class FRAME extends JFrame{

	public FRAME() { 
		
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setSize(500,500);
	   setLocationRelativeTo(null);
	   setVisible(true);
	   
	} 	
}

class PANEL extends JPanel{
	
	accion accionRojo = new accion("Rojo","Vuelve el fondo rojo", Color.red);
	accion accionAzul = new accion("Azul","Vuelve el fondo azul", Color.blue);
	accion accionRosa = new accion("Rosa","Vuelve el fondo rosa", Color.PINK);
	  
	public PANEL() {
		add(new JButton(accionRojo));
		add(new JButton(accionAzul));
		add(new JButton(accionRosa));
		
		InputMap entrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		entrada.put(KeyStroke.getKeyStroke("ctrl R"), "FondoRojo");
		entrada.put(KeyStroke.getKeyStroke("ctrl A"), "FondoAzul");
		entrada.put(KeyStroke.getKeyStroke("ctrl P"), "FondoRosa");

		
		ActionMap mapaAccion = getActionMap();
		
		mapaAccion.put("FondoRojo", accionRojo);
		mapaAccion.put("FondoAzul", accionAzul);
		mapaAccion.put("FondoRosa", accionRosa);
		
	}
	

class accion extends AbstractAction{

	
	public accion(String nombre, String desc, Color ColorBoton) {
		
		putValue(Action.NAME, nombre);
		putValue(Action.SHORT_DESCRIPTION, "Poner fondo color " + nombre);
		putValue("ColorFondo", ColorBoton);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Color color = (Color) getValue("ColorFondo");
		setBackground(color);
	}
	
}

}

