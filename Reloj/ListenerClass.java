package package1;

import java.awt.event.*;
import java.util.Date;

public class ListenerClass implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Date Hora = new Date();
		System.out.println("Hora: " + Hora.getHours() + ":" + Hora.getMinutes());
		
	}

}
