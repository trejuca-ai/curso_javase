package modulo9;

public class EmpleadoPorComision extends Empleado {

	private double ventasBrutas;
	private double tarifaComision;
	
	public EmpleadoPorComision() {

	}
	
	public EmpleadoPorComision(
			String nombre, 
			String primerApellido, 
			String nss, 
			String periodicidad,
			double ventasBrutas,
			double tarifaComision) {
		
		super(nombre, primerApellido, nss, periodicidad);
		this.ventasBrutas = ventasBrutas;
		this.tarifaComision = tarifaComision;
	}
	
	@Override
	public double calcularSalario() {
		return establecerSalario(tarifaComision * ventasBrutas);
	}
	
	public double getVentasBrutas() {
		return ventasBrutas;
	}

	public void setVentasBrutas(double ventasBrutas) {
		this.ventasBrutas = ventasBrutas;
	}

	public double getTarifaComision() {
		return tarifaComision;
	}

	public void setTarifaComision(double tarifaComision) {
		this.tarifaComision = tarifaComision;
	}

	@Override
	public String toString() {
		return getClass().getName() + ", ventasBrutas=" + ventasBrutas + 
				", tarifaComision=" + tarifaComision + super.toString();
	}	
}
