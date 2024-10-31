package modulo5;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		long factorial = 0;
		int siguiente = 0;
		String salida = "";
		
		
		for (int i = 20; i >= 2; i--) {
			
			salida += String.format("%d x ", i);
			factorial = i;
			
			for (int j = i; j >= 1; j--) {
				
				siguiente = j - 1;
				
				if (siguiente > 0) {
					factorial *= siguiente;
					salida += String.format("%d x ", siguiente);
				} else {
					salida = salida.replaceAll(".$", "");
					salida += String.format(" = %d", factorial);
				}
			}
			salida += "\n";
		}
		
		System.out.println(salida);

	}
}
