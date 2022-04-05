package package1;

public class Main implements InterfaceExterna {  // Tira error hasta que el metodo implementado mediante la interfaz sea definido 

	@Override // Etiqueta de superposición de el metodo 
	public void Met() {
		
		System.out.println("Ejemplo!");
		
	}
	

	@Override // No solo podemos hacer un print, tambien podemos implementar un return, por ej un entero
	public int asignar(int x) {
		
		
		
		return x;
		}
	
	
	
	public static void main(String[] args) {

		Main ObjEj = new Main();
		ObjEj.Met();
		int integer;
		integer = ObjEj.asignar(5);
		System.out.println("Integer es igual a = "+ integer);

	}

}




