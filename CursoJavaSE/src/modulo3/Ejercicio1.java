package modulo3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero de 5 digitos: ");
		
		// Leer numero proporcionado
		int numero = scanner.nextInt();
		String salida = "";
		
		// 12345
		salida += (numero / 10000) + "   ";
		numero = numero % 10000;
		
		salida = salida + (numero / 1000) + "   ";
		numero = numero % 1000;
		
		salida = salida + (numero / 100) + "   ";
		numero = numero % 100;
		
		salida = salida + (numero / 10) + "   ";
		numero = numero % 10;
		
		salida = salida + (numero / 1) + "   ";
		numero = numero % 1;
		
		System.out.println(salida);
	}
}
