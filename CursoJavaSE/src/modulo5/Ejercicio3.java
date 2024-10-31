package modulo5;

import javax.swing.JOptionPane;

import modulo4.Estudiante;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int centinela = 0;
		int estudiantesAprobaron = 0;
		int estudiantesReprobaron = 0;
		String salida = "Resumen\n\n";
		
		Estudiante estudiante = null;
		
		while (centinela >= 0) {
			
			String nombre = JOptionPane.showInputDialog("Introduce el nombre");
			String primerApellido = JOptionPane.showInputDialog("Introduce el apellido");
			short edad = Short.parseShort(
					JOptionPane.showInputDialog("Introduce la edad"));
			
			estudiante = new Estudiante();
			estudiante.setNombre(nombre);
			estudiante.setPrimerApellido(primerApellido);
			estudiante.setEdad(edad);
			
			int sumatoriaParciales = ((int)(Math.random() * 30)) + 1;
			int calificacion = estudiante.calcularCalificacion(3, sumatoriaParciales);
			estudiante.setCalificacion(calificacion);
			
			if (calificacion >= 6) {
				estudiantesAprobaron++;
			} else {
				estudiantesReprobaron++;
			}
			
			salida += String.format(
				"Nombre: %s, Apellido: %s, Edad: %s, Calificacion: %d\n\n",
				estudiante.getNombre(),
				estudiante.getPrimerApellido(),
				estudiante.getEdad(),
				estudiante.getCalificacion());
			
			centinela = Integer.parseInt(
					JOptionPane.showInputDialog("1 para continuar o -1 para seguir: "));
		}
		
		salida += String.format(
			"Se evaluaron %d estudiantes\n\n", (estudiantesAprobaron + estudiantesReprobaron));
		
		salida += String.format("%d estudiantes aprobaron\n", estudiantesAprobaron);
		salida += String.format("%d estudiantes reprobaron\n", estudiantesReprobaron);
		
		
		JOptionPane.showMessageDialog(null, salida);
	}
}
