package modulo12;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Antes de lanzar la excepcion");
			throw new ArithmeticException("Excepcion lanzada en main");
		} catch (Exception e) {
			System.out.println("excepcion atrapada");
			System.out.println(e.getMessage());
		}
	}
}
