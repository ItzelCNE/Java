package POO;

import javax.swing.*;
				
public class main {

	public static void main(String[] args) {
		
		Usuario Itzel = new Usuario("Itzel", 18);
		Usuario Usuario2 = new Usuario("User2", 20);
		Usuario Usuario3 = new Usuario("User3", 21);
		
		System.out.println("El id de" + Itzel.GetUser() + " es " + Itzel.GetID());
		System.out.println("El id de" + Usuario3.GetUser() + " es " + Usuario3.GetID());

		


		
		
	}

}
