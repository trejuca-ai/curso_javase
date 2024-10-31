package modulo10;

import java.util.Arrays;

public class Ejericicio1 {

	public static void main(String[] args) {
		
		int arreglo[] = {1,2,3,4,5,6,7,8,10,9};
		int comparacionesTotales = 0;
		boolean hayPermutacion = false;
		
		for (int i = 0; i < arreglo.length; i++) {
			
			for (int j = 0; j < arreglo.length - (i + 1); j++) {
				
				if (arreglo[j] > arreglo[j + 1]) {
					int aux = arreglo[j + 1];
					arreglo[j + 1] = arreglo[j];
					arreglo[j] = aux;
					hayPermutacion = true;
				}
				
				comparacionesTotales++;
			}
			
			System.out.println(String.format(
					"%s Comparaciones: %s, Pasada: %s",
					Arrays.toString(arreglo),comparacionesTotales, (i + 1)));
			
			comparacionesTotales = 0;
			
			if (!hayPermutacion) {
				break;
			}
			hayPermutacion = false;
		}
		
	}
}
