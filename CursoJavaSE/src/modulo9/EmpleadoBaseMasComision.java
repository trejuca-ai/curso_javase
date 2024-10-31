package modulo9;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

	private double salarioBase;

	public EmpleadoBaseMasComision() {

	}

	public EmpleadoBaseMasComision(
			String nombre, 
			String primerApellido, 
			String nss, 
			String periodicidad,
			double ventasBrutas,
			double tarifaComision, 
			double salarioBase) {
		
		super(nombre, primerApellido, nss, periodicidad, ventasBrutas, tarifaComision);
		this.salarioBase = salarioBase;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + salarioBase;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return getClass().getName() + ", salarioBase=" + salarioBase +
				super.toString();
	}
	
	
}
