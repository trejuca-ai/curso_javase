package modulo12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		try {
			abrirArchivo();
		} catch (ExcepcionPersonalizada e) {
			e.printStackTrace();
		}
	}
	
	static void lanzarExcepcionPersonalizada() 
		throws ExcepcionPersonalizada {
		throw new ExcepcionPersonalizada();
	}
	
	static void abrirArchivo() 
		throws ExcepcionPersonalizada {
			
		FileReader archivo;
		try {
			archivo = new FileReader("hola.txt");
			//Lineas leer el archivo
			archivo.close();
			
		} catch (FileNotFoundException e) {
			throw new ExcepcionPersonalizada(
				"Error al encontrar el archivo", e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
