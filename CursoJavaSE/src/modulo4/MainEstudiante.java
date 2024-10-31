package modulo4;

import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		
		//Obtener datos y crear el objeto
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el nombre: ");
		String nombre = scanner.next();
		
		System.out.println("Introduce el primer apellido: ");
		String primerApellido = scanner.next();
		
		System.out.println("Introduce el edad: ");
		short edad = scanner.nextShort();
		
		Estudiante juan = new Estudiante();
		
		juan.setNombre(nombre);
		juan.setPrimerApellido(primerApellido);
		juan.setEdad(edad);
		
		// Calcular calificacion
		int calificacion = juan.calcularCalificacion(4, 280);
		juan.setCalificacion(calificacion);
		
		// Imprimir en consola el estado del objeto estudiante
		System.out.println(juan);
		
		Object objeto = new Object();
	
	}
}
