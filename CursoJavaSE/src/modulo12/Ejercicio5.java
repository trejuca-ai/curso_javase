package modulo12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {

	public static void main(String[] args) {
		try {
			abrirArchivo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void abrirArchivo() 
		throws FileNotFoundException, IOException {
		
		FileReader archivo = new FileReader("hola.txt");
		
		//Lineas leer el archivo
		
		archivo.close();
	}
}
