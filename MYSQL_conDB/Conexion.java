package bd_alumnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
 /*
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";	
	private static final String URL = "jdbc:mysql://localhost:3306/bd_ins";
	private static final String USER = "root";
    private static final String PASS = "";
	*/
	public Connection conectar(final String CONTROLADOR,final String URL,final String USER,final String PASS) {
		Connection conexion = null; 
	
	try {
			Class.forName(CONTROLADOR);
			conexion = DriverManager.getConnection(URL ,USER,PASS);
			System.out.println("Conectado correctamente");
		} catch (ClassNotFoundException e) {
			System.out.println("Error al establecer conexion con el controlador MYSQL");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("Error en la conexion con la base de datos");
			e.printStackTrace();
		}
	
	  return conexion;
	}
	

}
