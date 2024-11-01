package modulo13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modulo4.Estudiante;



public class Conexion {

	private String url;
	private Connection conexion;
	
	public Conexion(String rutaArchivo) {
		this.url = "jdbc:sqlite:" + rutaArchivo;
	}
	
	public void crearConexion() {
		try {
			
			Class.forName("org.sqlite.JDBC");
			conexion = DriverManager.getConnection(url);
			
			if (conexion != null) {
				System.out.println("Conexion a la BD establecida");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void cerrarConexion() {
		
		try {
			conexion.close();
			System.out.println("Conexion cerrada");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void actualizar(String sql) {
		
		try (Statement instruccion = conexion.createStatement()) {
			instruccion.executeUpdate(sql);
			conexion.close();
			System.out.println("Acutalizacion ejecutada correctamente");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void leer(String sql) {
		
		try {
			Statement instruccion = conexion.createStatement();
			ResultSet rs = instruccion.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(
					"Id: " + rs.getInt(1) + 
					"Nombre: " + rs.getString(2) + 
					"Primer apellido: " + rs.getString(3) +
					"Edad: " + rs.getInt(4));
			}
			
			conexion.close();
			System.out.println("Acutalizacion ejecutada correctamente");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String crearEsquema() {
		
		StringBuilder sql = new StringBuilder();
		sql.append("CREATE TABLE IF NOT EXISTS estudiante (");
		sql.append("id INTEGER PRIMARY KEY AUTOINCREMENT,");
		sql.append("nombre TEXT NOT NULL,");
		sql.append("primer_apellido TEXT NOT NULL,");
		sql.append("edad INTEGER,");
		sql.append("calificacion INTEGER);");
		
		return sql.toString();
	}
	
	public String insertarEstudiante(Estudiante estudiante) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO estudiante(nombre, primer_apellido, edad, calificacion)");
		sql.append("VALUES(")
			.append("'").append(estudiante.getNombre()).append("',")
			.append("'").append(estudiante.getPrimerApellido()).append("',")
			.append("'").append(estudiante.getEdad()).append("',")
			.append(estudiante.getCalificacion())
		.append(");");
		
		return sql.toString();
	}
	
	public String eliminarEstudiante(int id) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM estudiante WHERE id=").append(id);
		
		return sql.toString();
		
	}
	
	public String actualizarEstudiante(Estudiante estudiante, int id) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE estudiante SET ")
			.append("nombre='").append(estudiante.getNombre()).append("', ")
			.append("primer_apellido='").append(estudiante.getPrimerApellido()).append("', ")
			.append("edad=").append(estudiante.getEdad()).append(", ")
			.append("calificacion=").append(estudiante.getCalificacion())
		.append(" WHERE id=").append(id);
		
		return sql.toString();
			
	}
	
	public String leerEstudiantes() {
		return "SELECT * FROM estudiante";
	}
	
	public static void main(String[] args) {
		
		Conexion conexion = new Conexion("data.db");
		conexion.crearConexion();
		
		// Crear Esquema
		//conexion.actualizar(conexion.crearEsquema());
		
		//Insertar un estudiante
//		Estudiante juan = new Estudiante();
//		juan.setNombre("Pedro");
//		juan.setPrimerApellido("Trejo");
//		juan.setEdad((short)35);
//		juan.setCalificacion(8);
//		
//		conexion.actualizar(conexion.insertarEstudiante(juan));
		
		// Leer todos los estudiantes
//		conexion.leer(conexion.leerEstudiantes());
		
		// Actualizar estudiante
//		Estudiante juan = new Estudiante();
//		juan.setNombre("Laura");
//		juan.setPrimerApellido("Hernandez");
//		juan.setEdad((short)35);
//		juan.setCalificacion(10);
//		conexion.actualizar(conexion.actualizarEstudiante(juan, 1));
		
		// Eliminar estudiante
		conexion.actualizar(conexion.eliminarEstudiante(1));
		conexion.cerrarConexion();
	}
}
