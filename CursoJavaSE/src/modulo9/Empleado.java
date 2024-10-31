package modulo9;

import java.util.Objects;

public abstract class Empleado implements PorPagar {

	public static final String DIA = "Dia";
	public static final String SEMANA = "Semana";
	public static final String MES = "Mes";
	
	private String nombre;
	private String primerApellido;
	private String nss;
	private double salario;
	private String periodicidad;
	
	public Empleado() {

	}

	public Empleado(String nombre, String primerApellido, String nss, String periodicidad) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.nss = nss;
		this.periodicidad = periodicidad;
	}

	public String getNombre() {
		return nombre;
	}

	public abstract double calcularSalario();
	
	@Override
	public double obtenerMontoPago() {
		return calcularSalario();
	}
	
	public double establecerSalario(double salario) {
		setSalario(salario);
		return getSalario();
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

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", primerApellido=" + primerApellido + ", nss=" + nss
				+ ", periodicidad=" + periodicidad 
				+ ", salario=" + salario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, nss, periodicidad, primerApellido, salario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(nss, other.nss)
				&& Objects.equals(periodicidad, other.periodicidad)
				&& Objects.equals(primerApellido, other.primerApellido)
				&& Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}
	
	
}
