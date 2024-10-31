package modulo9;

import java.util.Objects;

public class EmpleadoAsalariado extends Empleado {

	private double salarioSemanal;

	public EmpleadoAsalariado() {
		
	}

	public EmpleadoAsalariado(
			String nombre, 
			String primerApellido, 
			String nss, 
			String periodicidad,
			double salarioSemanal) {
		
		super(nombre, primerApellido, nss, periodicidad);
		this.salarioSemanal = salarioSemanal;
	}


	
	@Override
	public double calcularSalario() {
		return establecerSalario(getSalarioSemanal());
	}
	
	
	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public String toString() {
		return getClass().getName() + ", salarioSemanal=" + salarioSemanal + 
				super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(salarioSemanal);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpleadoAsalariado other = (EmpleadoAsalariado) obj;
		return Double.doubleToLongBits(salarioSemanal) == Double.doubleToLongBits(other.salarioSemanal);
	}


	
	
}
