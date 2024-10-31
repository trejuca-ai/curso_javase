package modulo9.impuesto;


//import modulo9.impuesto.EmpleadoPorHoras;

public class MainEmpleado {

	public static void main(String[] args) {
		
		Salario salario = new Salario();
		salario.setPeriodicidad(Salario.MES);
		
		modulo9.impuesto.EmpleadoPorHoras porHoras = new modulo9.impuesto.EmpleadoPorHoras(
				"Pedro", "Martinez", "5534", salario, 2345.00, 30);
		
		System.out.println("####### EmpleadoPorHoras #######");
		System.out.println("Salario neto: " + porHoras.calcularSalarioNeto());
		System.out.println("Salario bruto: " + porHoras.calcularSalarioBruto());
		System.out.println(porHoras);
		System.out.println();
	}
}
