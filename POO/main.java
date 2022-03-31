package POO;

import javax.swing.*;
				
public class main {

	public static void main(String[] args) {
		
		Usuario[] Usuarios = new Usuario [2]; // declarado como arreglo, tambien se puede declarar normal usando Usuario (nombre de la instancia) = new Usuario(parametros) (este ultimo es el constructuor de la clase)
		
		Usuarios[0] = new Usuario("Itzel", 18, 2004, 1, 21);	
		Usuarios[1] = new Usuario("UsuarioTest", 20, 2015, 1, 21);	
		
		int i;
		
		System.out.println();
		
	
		
		for(i = 0; i<Usuarios.length; i++) {
			
			System.out.println("El usuario " + Usuarios[i].GetUser() + " Tiene " + Usuarios[i].GetFollowed());
			
			Usuarios[i].Follow();
			
			System.out.println("El usuario " + Usuarios[i].GetUser() + " Tiene " + Usuarios[i].GetFollowed());
			
		}
		
	}

}
