package bd_alumnos;

import java.sql.*;

public class TestcConexion {

	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		Connection CN = null;
		Statement sta = null;
		ResultSet tab = null;
		CN = conexion.conectar("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/bd_ins","root","");
		
		try {
			sta = CN.createStatement();
			tab = sta.executeQuery("SELECT * FROM alumnos");
			
			while (tab.next()) {
				int IDAlumno = tab.getInt(1);
				String NombreAlumno = tab.getString(2);
				String GrupoAlumno = tab.getString(3);
				
				System.out.println(IDAlumno+" "+NombreAlumno+" "+ GrupoAlumno);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
