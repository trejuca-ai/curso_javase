package modulo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import modulo4.Estudiante;
import modulo9.Empleado;
import modulo9.EmpleadoAsalariado;
import modulo9.EmpleadoPorComision;
import modulo9.EmpleadoPorHoras;
import modulo9.Factura;
import modulo9.PorPagar;

public class Lista {

	public static void main(String[] args) {
		ejercicio7();
	}

	public static void ejercicio7() {
		
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		Estudiante estudiante1 = new Estudiante("Juan", "Trejo");
		estudiante1.setCalificacion(10);
		Estudiante estudiante2 = new Estudiante("Laura", "Perez");
		estudiante2.setCalificacion(6);
		Estudiante estudiante3 = new Estudiante("Lot", "Alvarez");
		estudiante3.setCalificacion(0);
		
		estudiantes.add(estudiante1);
		estudiantes.add(estudiante2);
		estudiantes.add(estudiante3);

		Collections.sort(estudiantes, new Estudiante());
		
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante);
		}
	}
	
	public static void ejercicio5() {
		
		List<String> nombres = new ArrayList<String>();
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Laura");
		nombres.add("Martha");
		
		Collections.sort(nombres, Collections.reverseOrder());
		//Collections.reverse(nombres);
		System.out.println(nombres);
	}
	
	public static void ejercicio4() {
		
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		Estudiante estudiante1 = new Estudiante("Juan", "Trejo");
		Estudiante estudiante2 = new Estudiante("Laura", "Perez");
		Estudiante estudiante3 = new Estudiante("Lot", "Alvarez");
		
		estudiantes.add(estudiante1);
		estudiantes.add(estudiante2);
		estudiantes.add(estudiante3);
		
		for (Estudiante estudiante : estudiantes) {
			estudiante.setNombre("Nombre cambiado");
		}
		
		System.out.println(estudiantes);
		Estudiante estudianteNuevo = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			estudianteNuevo = new Estudiante();
			estudianteNuevo.setCalificacion(6);
			estudianteNuevo.setNombre("Estudiante reemplazado");
			
			estudiantes.set(i, estudianteNuevo);
		}
		
		System.out.println(estudiantes);
	}
	
	public static void ejercicio2b() {
		
		List<PorPagar> datosPorPagar = new ArrayList<PorPagar>();
		
		PorPagar asalariado = new EmpleadoAsalariado(
				"Juan", "Trejo", "43244", Empleado.SEMANA, 2234.00);
		PorPagar porHoras = new EmpleadoPorHoras(
				"Pedro", "Martinez", "5534", Empleado.MES, 2345.00, 30);
		PorPagar porComision = new EmpleadoPorComision(
				"Laura", "Perez", "4423", Empleado.DIA, 5678.00, 0.25);
		PorPagar factura1 = new Factura();
		
		datosPorPagar.add(asalariado);
		datosPorPagar.add(porHoras);
		datosPorPagar.add(porComision);
		datosPorPagar.add(factura1);
		
		for (PorPagar porPagar : datosPorPagar) {
			//System.out.println(porPagar.obtenerMontoPago());
		}
		
		System.out.println(datosPorPagar);
	}
	
	public static void ejercicio1() {
		
		List<String> nombres = new ArrayList<String>();
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Laura");
		nombres.add("Martha");
		
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println("Clave: " + i + ", Nombre: " + nombres.get(i));
		}
		
		for(String nombre: nombres) {
			System.out.println("Nombre: " + nombre);
		}
	}
	
	public static void ejercicio2() {
		
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		Estudiante estudiante1 = new Estudiante("Juan", "Trejo");
		Estudiante estudiante2 = new Estudiante("Laura", "Perez");
		Estudiante estudiante3 = new Estudiante("Lot", "Alvarez");
		
		estudiantes.add(estudiante1);
		estudiantes.add(estudiante2);
		estudiantes.add(estudiante3);
		
//		for (Estudiante estudiante : estudiantes) {
//			System.out.println(estudiante);
//		}
		
		for (Iterator iterator = estudiantes.iterator(); iterator.hasNext();) {
			Estudiante estudiante = (Estudiante) iterator.next();
			System.out.println(estudiante);
		}
	}
	

}
