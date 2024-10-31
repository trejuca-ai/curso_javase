package modulo5;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog(
			"Ingresa un numero de 5 digitos"));
		
		System.out.println(modulo6.Ejercicio1.SALUDO);
		int temp = numero;
		String palindromo = "";
		
		if (numero >= 10000 && numero <= 99999) {
			
			while (numero > 0) {
				palindromo += numero % 10;
				numero /= 10;
			}
		}
		
//		if (Integer.parseInt(palindromo) == temp) {
//			JOptionPane.showMessageDialog(null, 
//				String.format("El numero %s es un palindromo", palindromo));
//		} else {
//			JOptionPane.showMessageDialog(null, 
//				String.format("El numero %s NOO es un palindromo", palindromo));
//		}
		
		// IF Ternario
		String resultado = Integer.parseInt(palindromo) == temp
				? String.format("El numero %s es un palindromo", palindromo)
				: String.format("El numero %s NOO es un palindromo", palindromo);
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}
