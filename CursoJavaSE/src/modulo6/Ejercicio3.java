package modulo6;

public class Ejercicio3 {

	void imprimir(int x) {
		System.out.println(x);
		if (x > 0) {
			imprimir(x - 1);
		}
		return;
	}
	
	public static void main(String[] args) {
		Ejercicio3 ej3 = new Ejercicio3();
		ej3.imprimir(10);
	}
}
