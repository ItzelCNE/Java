package pck2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.awt.geom.Rectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		       frame ventana = new frame();
		
			}
			
		}


class frame extends JFrame{
	
	
    public frame() {
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setSize(Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
    	setLocationRelativeTo(null);  	
    	
    	panel FPanel = new panel();
    	add(FPanel);
    	
    	
    }
}

class panel extends JPanel implements KeyListener{
	
	private JLabel label = new JLabel("⬢");
    
    

	
public panel() {
	addKeyListener(this);
	setFocusable(true);
	add(label);

	
}

@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyTyped(KeyEvent e) {
	if(e.getKeyChar() == 'w') {
		label.setLocation(label.getLocation().x, label.getLocation().y - 2);
	} else if(e.getKeyChar() == 's') {
		label.setLocation(label.getLocation().x, label.getLocation().y + 2);
	} else if (e.getKeyChar() == 'a') {
		label.setLocation(label.getLocation().x -2, label.getLocation().y);
	} else if (e.getKeyChar() == 'd') {
		label.setLocation(label.getLocation().x +2 , label.getLocation().y);
	} 
}
      
     
     
     
}

















	
