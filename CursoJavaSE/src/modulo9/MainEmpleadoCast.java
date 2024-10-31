package modulo9;

public class MainEmpleadoCast {

	public static void main(String[] args) {
		
		Empleado asalariado = new EmpleadoAsalariado(
				"Juan", "Trejo", "43244", Empleado.SEMANA, 2234.00);


		/*
		 * Formas de determinar un tipo de Objeto
		 */
		
		//Forma 1. A traves del metodo  getClass()
		//System.out.println(asalariado.getClass());
		
		//Forma 2. A traves del casteo 
//		EmpleadoAsalariado asalariado2 = (EmpleadoAsalariado) new Empleado(
//				"Juan", "Trejo", "43244", Empleado.SEMANA);
		
		//Forma 3. A traves de la palabra reservada instanceof
		if (asalariado instanceof EmpleadoAsalariado) {
			System.err.println("Es un objeto de tipo EmpleadoAsalariado");
		}
		

	}
}
