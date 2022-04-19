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
    	panel.SubclassEvent Eventos = FPanel.new SubclassEvent();
    	addKeyListener(Eventos);
    	add(FPanel);
    	
    	
    }
}

class panel extends JPanel{
	
	
	Rectangle2D TESTOBJECT01 = new Rectangle2D.Double(Toolkit.getDefaultToolkit().getScreenSize().width / 2,Toolkit.getDefaultToolkit().getScreenSize().height / 2,12,12); 

     public void paint(Graphics G) {
    	 super.paint(G);
    	 Graphics2D G2 = (Graphics2D) G;
         G2.draw(TESTOBJECT01);  
         
         
      
     
}
     class SubclassEvent implements KeyListener {

    		@Override
    		public void keyPressed(KeyEvent arg0) {
    			// TODO Auto-generated method stub
    			
    		}

    		@Override
    		public void keyReleased(KeyEvent arg0) {
    			// TODO Auto-generated method stub
    			
    		}

    		@Override
    		public void keyTyped(KeyEvent E) {
    			if(E.getKeyChar() == 'w') {
    				TESTOBJECT01.add(TESTOBJECT01.getX(),TESTOBJECT01.getX()+1 );
    				System.out.println(E.getKeyChar());
    				System.out.println(TESTOBJECT01.getX());
    				
    				
    			}
    			
    		}
    		 
    	 }      
    	    
     
     
     
}

	
