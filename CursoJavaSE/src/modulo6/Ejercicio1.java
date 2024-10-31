package modulo6;

public class Ejercicio1 {

	public static final String SALUDO = "Este es otro saludo";
	
	public static void main(String[] args) {
		//System.out.println(Ejercicio1.saludar());
		Ejercicio1 ej1 = new Ejercicio1();
		Ejercicio1 ej2 = new Ejercicio1();
		Ejercicio1 ej3 = new Ejercicio1();
		//Ejercicio1.saludo = "saludo cambiado";
		System.err.println(Ejercicio1.SALUDO);
	}
	
	public static String saludar() {
		return "Hola este es un saludo";
	}
}
