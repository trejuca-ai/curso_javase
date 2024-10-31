package modulo9.impuesto;

public abstract class Empleado {
	
	private String nombre;
	private String primerApellido;
	private String nss;
	private Salario salario;
	
	public Empleado() {

	}

	public Empleado(String nombre, String primerApellido, String nss, Salario salario) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.nss = nss;
		this.salario = salario;
	}

	public abstract double calcularSalarioNeto();
	public abstract double calcularSalarioBruto();
	
	public String getNombre() {
		return nombre;
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

	
	public Salario getSalario() {
		return salario;
	}

	public void setSalario(Salario salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", primerApellido=" + primerApellido + ", nss=" + nss;
	}
}
