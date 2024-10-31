package modulo9;

public class MainEmpleado {

	public static void main(String[] args) {
		
		PorPagar asalariado = new EmpleadoAsalariado(
				"Juan", "Trejo", "43244", Empleado.SEMANA, 2234.00);
		PorPagar porHoras = new EmpleadoPorHoras(
				"Pedro", "Martinez", "5534", Empleado.MES, 2345.00, 30);
		PorPagar porComision = new EmpleadoPorComision(
				"Laura", "Perez", "4423", Empleado.DIA, 5678.00, 0.25);
		Empleado baseMasComision = new EmpleadoBaseMasComision(
				"Rosa", "Gonzales", "234422", Empleado.SEMANA, 9876.00, 0.30, 2000.00);
		
		System.out.println("####### EmpleadoAsalariado #######");
		System.out.println("Salario: " + asalariado.obtenerMontoPago());
		System.out.println(asalariado);
		System.out.println();
		
		System.out.println("####### EmpleadoPorHoras #######");
		System.out.println("Salario: " + porHoras.obtenerMontoPago());
		System.out.println(porHoras);
		System.out.println();

		System.out.println("####### EmpleadoPorComision #######");
		System.out.println("Salario: " + porComision.obtenerMontoPago());
		System.out.println(porComision);
		System.out.println();
		
		System.out.println("####### EmpleadoBaseMasComision #######");
		baseMasComision.setSalario(baseMasComision.calcularSalario());
		System.out.println("Salario: " + baseMasComision.getSalario());
		System.out.println(baseMasComision);
		System.out.println();
	}
}
