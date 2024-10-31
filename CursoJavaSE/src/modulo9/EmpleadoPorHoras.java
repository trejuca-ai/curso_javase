package modulo9;

public class EmpleadoPorHoras extends Empleado {

	private double sueldo;
	private int horas;
	
	public EmpleadoPorHoras() {

	}

	public EmpleadoPorHoras(
			String nombre, 
			String primerApellido, 
			String nss, 
			String periodicidad,
			double sueldo, 
			int horas) {
		
		super(nombre, primerApellido, nss, periodicidad);
		this.sueldo = sueldo;
		this.horas = horas;
	}
	
	@Override
	public double calcularSalario() {
		
		double salarioHoras = 0.0;
		
		if (horas <= 40) {
			salarioHoras = sueldo * horas;
		}
		
		salarioHoras = 40 * sueldo + (horas - 40) * sueldo * 1.5;
		return establecerSalario(salarioHoras);
	}
	
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return getClass().getName() + ", sueldo=" + sueldo + ", horas=" + horas + 
				super.toString();
	}	
}
