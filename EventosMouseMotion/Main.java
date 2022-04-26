	package package1;
	
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
	
	public class Main {
	
		public static void main(String[] args) {
			
			FRAME main = new FRAME("Principal");
			JLabel Titulo = new JLabel("Eventos Mouse", SwingConstants.CENTER);
			Point ModTituloY = new Point(Titulo.getX(),Titulo.getY()+250);  //layouts :)
			Titulo.setLocation(ModTituloY);
			Titulo.setSize(200, 200);
			
			
			main.add(Titulo);
		}
	
	}
	
	
	@SuppressWarnings("serial")
	class FRAME extends JFrame {
		
		
		public FRAME(String title) {
			
			eventosMouse MouseEvento = new eventosMouse();
			
			
			
			
			setTitle(title);
			setResizable(false);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(850,500);
			setLocationRelativeTo(null);
			
			addMouseListener(MouseEvento);
			addMouseMotionListener(MouseEvento);
			
		
			
			
			
		}
		
		
		
	}
	
	
	
	class eventosMouse extends MouseAdapter implements MouseMotionListener{
	

	
		@Override
		public void mousePressed(MouseEvent e) {
			if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
				System.out.println( "X: " + e.getX() + "Y: " + e.getY() );
			}
	
		}
		
		public void mouseDragged(MouseEvent e) {
			System.out.println("Manteniendo");
		}
		
        public void mouseMoved(MouseEvent e) {
			System.out.println("Moviendo");
		}
		
	}
		
	
	
	
	
	
	
	
	










