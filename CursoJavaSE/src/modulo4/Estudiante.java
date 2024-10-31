package modulo4;

import java.util.Comparator;

import modulo6.Ejercicio1;

public class Estudiante implements Comparator<Estudiante> {

	// 1 Atributos
	private String nombre;
	private String primerApellido;
	private short edad;
	private int calificacion;
	
	// 2 Constructores sobrecargados
	public Estudiante() {
		
	}
	
	public Estudiante(String nombre) {
		this.nombre = nombre;
	}

	
	public Estudiante(String nombre, String primerApellido) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
	}


	public Estudiante(String nombre, String primerApellido, short edad) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.edad = edad;
	}

	public Estudiante(String nombre, String primerApellido, short edad, int calificacion) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		setEdad(edad);
		setCalificacion(calificacion);
	}
	
	// 3 Metodos
	public int calcularCalificacion(int numeroExamenes, int sumaTotalCalificacion) {
		int calificacion = (sumaTotalCalificacion / numeroExamenes);
		
		return calificacion;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public short getEdad() {
		return edad;
	}

	public void setEdad(short edad) {
		this.edad = edad;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", primerApellido=" + primerApellido + ", edad=" + edad
				+ ", calificacion=" + calificacion + "]";
	}

	@Override
	public int compare(Estudiante o1, Estudiante o2) {
	
		int porCalificacion = Integer.compare(
			o1.getCalificacion(), o2.getCalificacion());
		
		return porCalificacion;
	}
	

}
