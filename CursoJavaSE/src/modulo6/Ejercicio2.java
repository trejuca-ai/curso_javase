package modulo6;

import modulo4.Estudiante;

public class Ejercicio2 {

	public static void saludar(String mensaje) {
		mensaje = "Saludos desde el metodo saludar";
		
		System.out.println(Ejercicio1.SALUDO);
	}
	
	public static void estudiante(Estudiante estudiante) {
		estudiante = new Estudiante("Pedro","Maatinez",(short)40,6);
		System.out.println(estudiante);
	}
	
	public static void main(String[] args) {
		Estudiante estudianteOriginal = 
			new Estudiante("Juan","Trejo",(short)30,10);

		estudiante(estudianteOriginal);
		System.out.println(estudianteOriginal);
	}
}
