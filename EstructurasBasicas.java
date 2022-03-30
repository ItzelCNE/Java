package first;
import java.math.*;

public class EstructurasBasicas {

	public static void main(String[] args) {
		
		System.out.println("Salidas por consola");
		
		int A = 10;
		String B = "Por fin tengo Strings!";
		double C = 1.2;
		
		if (A == 0) {
			System.out.println("Verdadero");
		}else {
			System.out.println("Falso");
		}
		
		System.out.println("////////////");
		
		int array[] = {1, 2, 3, 4, 5};
		
		System.out.println(array[1]);
		
		//ahora matriz
		
		int matriz[][] = {{1, 2, 3} , {4, 5, 6} , {7, 8, 9}};
		
		System.out.println("Elemento 0 de el arreglo 1: " + matriz[1][0]);
		
		// recorrer arreglo 
		
		 int i, j;
		 
		
		for (i = 0; i < 5; i++ ) {
			
			System.out.println("Los elementos de el arreglo son: " + array[i]);
			
		}
		
		//Recorrer una matriz
		
		System.out.println("ahora recorre la matriz");
		
		for(i = 0; i < matriz.length; i++) {
			
			for(j=0; j< matriz.length; j++) {
				
				System.out.println("Valores Matriz arreglo(" + (i + 1) + ") pos(" + (j + 1) + "):" + matriz[i][j]);
				
			}

		}
	}

}
