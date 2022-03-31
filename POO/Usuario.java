package POO;
import java.util.*;

class Usuario {

	private String User;
	private int UserAge;
	private int Followers;
	private int Followed;
	private Date CreationDate;
	
	public Usuario(String User, int UserAge, int day, int month, int year) {
		
		GregorianCalendar Calendario = new GregorianCalendar(year, month, day);
		
		this.User = User;
		this.UserAge = UserAge;
		Followers = 0;
		Followed = 0;
		CreationDate = Calendario.getTime();
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
	
	public Date GetCreationDate() {
		
		return CreationDate;
	}
	

	

}
