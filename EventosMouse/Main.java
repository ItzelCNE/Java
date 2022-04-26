package package1;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		
		FRAME main = new FRAME("Principal");
		
	}

}


class FRAME extends JFrame {
	
	
	public FRAME(String title) {
		
		eventosMouse MouseEvento = new eventosMouse();
		
		
		addMouseListener(MouseEvento);
		setTitle(title);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocationRelativeTo(null);
	
		
		
		
	}
	
	
	
}



class eventosMouse implements MouseListener{

	static int i = 0;
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Cantidad clicks: " + i);
		i++;
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}







