package POO;

public class Usuario {

	private String User;
	private int UserAge;
	private int Followers;
	private int Followed;
	
	public Usuario() {
		
		Followers = 0;
		Followed = 0;
		
	}
	
	
	public String GetUser() {   //GETTER
		
		return User;
	}
	
	public void SetUser(String User) {  //SETTER
		
		this.User = User;     //"THIS" Aclara que es la variable de clase, establece el argumento como el valor de la variable de la clase
		
	}
	

}
