package modulo9.impuesto;

public class EmpleadoPorHoras extends Empleado {

	private double sueldo;
	private int horas;
	
	public EmpleadoPorHoras() {

	}

	public EmpleadoPorHoras(
			String nombre, 
			String primerApellido, 
			String nss, 
			Salario salario,
			double sueldo, 
			int horas) {
		
		super(nombre, primerApellido, nss, salario);
		this.sueldo = sueldo;
		this.horas = horas;
	}
	
	@Override
	public double calcularSalarioNeto() {
		
		double salario = 0.0;
		
		if (horas <= 40) {
			salario = sueldo * horas;
		}
		
		salario = 40 * sueldo + (horas - 40) * sueldo * 1.5;
		
		getSalario().setSalarioNeto(salario);
		return getSalario().getSalarioNeto();
	}

	@Override
	public double calcularSalarioBruto() {
		double salarioBruto = 
				getSalario().getSalarioNeto() - (getSalario().getSalarioNeto() * Salario.ISR);
		
		getSalario().setSalarioBruto(salarioBruto);
		return getSalario().getSalarioBruto();
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
