package POO;
import java.util.*;

class Usuario {

	private String User;
	private int UserAge;
	private int Followers;
	private int Followed;
	private Date CreationDate;
	private int ID;
	private static int nextID=1; //Todos los objetos comparten esta variable, no tienen una copia;
	
	public Usuario(String User, int UserAge) {
		
		
		
		this.User = User;
		this.UserAge = UserAge;
		Followers = 0;
		Followed = 0;
		ID = nextID;
		nextID++;
		
	}
	
	
	public String GetUser() {   //GETTER
		
		return User;
	}
	
	public void SetUser(String User) {  //SETTER
		
		this.User = User;     //"THIS" Aclara que es la variable de clase, establece el argumento como el valor de la variable de la clase
		
	}
	
	public int GetUserAge() {
		
		return UserAge;
	}
	
	public void Follow() {
		
		Followed++;
		
	}
	
	public int GetFollowed() {
		
		return Followed;
	}
	
	public int GetID() {
		
		return ID;
	}
	


	

}
