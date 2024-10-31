package modulo6;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		Ejercicio4.jugarAdinarNumero();
	}
	
	public static void jugarAdinarNumero() {
		
		int centinela = 0;
		
		while(centinela == JOptionPane.YES_OPTION) {
			
			int numero = (int)(Math.random() * 1000);
			int contadorIntentos = 0;
			int intento = 0;
			
			while(numero != intento) {
				
				intento = Integer.parseInt(
					JOptionPane.showInputDialog("Ingresa tu siguiente intento: "));
				
				if (intento > numero) {
					System.out.println("Demasiado alto");
				} else {
					System.out.println("Demasiado bajo");
				}
				contadorIntentos++;
			}
			
			String salida = String.format(
				"Felicidades, adivinaste el numero %d en %d intentos", 
				numero, contadorIntentos);
			
			JOptionPane.showMessageDialog(null, salida);
			centinela = JOptionPane.showConfirmDialog(null, "¿Deseas continur?");
			
		}
	}
}
