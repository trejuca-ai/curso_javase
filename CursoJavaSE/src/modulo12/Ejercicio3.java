package modulo12;

public class Ejercicio3 {

	public static void main(String[] args) {
		try {
			Lanza.lanzaExcepcion();
		} catch (Exception e) {
			System.out.println("Se atrapa nuevamente la excepcion en main");
			e.printStackTrace();
		}
	}
}

class Lanza {

	static void lanzaExcepcion() {
		try {
			int division = 1 / 0;
		} catch (Exception e) {
			System.out.println("Se atrapa la excepcion en la clase Lanza");
			e.printStackTrace();
			throw e;
		}
	}
}
