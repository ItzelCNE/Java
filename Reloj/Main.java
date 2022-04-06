package package1;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {

		Frame Ventana = new Frame();
		ListenerClass Listener = new ListenerClass();
		Timer Reloj = new Timer(5000, Listener);
		JLabel Label = new JLabel("*Reloj* (falta implementar)", JLabel.CENTER);
		Ventana.add(Label);
		Reloj.start();
		//JOptionPane.showMessageDialog(null, "Detener Reloj");
		//System.exit(0);
		
	}

}
