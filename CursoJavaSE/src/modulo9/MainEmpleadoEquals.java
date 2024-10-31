package modulo9;

public class MainEmpleadoEquals {

	public static void main(String[] args) {
		
//		String cadena1 = "Holaa";
//		String cadena2 = "Hola";
//		
//		System.out.println(cadena1 == cadena2);
//		System.err.println(cadena1.equals(cadena2));
		
		EmpleadoAsalariado asalariado1 = new EmpleadoAsalariado(
				"Juan", "Trejo", "43244", Empleado.SEMANA, 2234.00);
		EmpleadoAsalariado asalariado2 = new EmpleadoAsalariado(
				"Juan", "Trejo", "43244", Empleado.SEMANA, 2234.00);
		
		System.out.println(asalariado1);
		System.out.println(asalariado2);
		
		System.out.println((asalariado1 == asalariado2));
		System.err.println(asalariado1.equals(asalariado2));
	}
	
}
