package package1;


// Esta interface es declarada dentro de una Clase
interface Botella{
    
	String color = "Azul";
	
	void llenar();
	void tirar();
}

public class Interface implements Botella {

	public static void main(String[] args) {
		System.out.println(color);
		
		Interface EX = new Interface();
		EX.llenar();
		EX.tirar();

	}

	@Override
	public void llenar() {
		System.out.println("Botella llenada");
		
	}
	@Override
	public void tirar() {
		System.out.println("Tiraste la botella");
		
	}

}
