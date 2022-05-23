package secPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class main { 

	static JFrame mainFrame = new JFrame();
	static JPanel mainPanel = new JPanel();
	static JSlider test = new JSlider();
	static JButton send = new JButton("Send");
	static JButton set = new JButton("Set");
	static JTextField setterNum = new JTextField("0-100");
	static main Acceso = new main();
	static main.Action Listener = Acceso.new Action();
	
	public static void main(String[] args) {
		
		
		
		mainFrame.setSize(500,500);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);
		
		
		send.addActionListener(Listener);
		set.addActionListener(Listener);
		mainPanel.add(test);
		mainPanel.add(send);
		mainPanel.add(set);
		mainPanel.add(setterNum);
		
		mainPanel.setVisible(true);
				
	}
	

	
	class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource().equals(send)) {
			   System.out.println(test.getValue());
			}else if(e.getSource().equals(set)) {
				int value = Integer.parseInt(setterNum.getText());
				test.setValue(value);
				
			}
			   
		}
		
	}

}














