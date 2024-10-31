package modulo11;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		
		Map<String, String> mapa = new HashMap<String, String>();
		mapa.put("nombre", "juan");
		mapa.put("apellido", "trejo");
		mapa.put("apellidoMaterno", "trejo");
		mapa.put("nombre", "herrera");
		mapa.put("calle", "calle1");
		
		for(Map.Entry<String, String> elemento: mapa.entrySet()) {
			System.out.println("Clave: " + elemento.getKey() + 
					", valor: " + elemento.getValue());
		}
		

		mapa.remove("calle");
		mapa.put("apellidoMaterno", "herrera");
		
		for(Map.Entry<String, String> elemento: mapa.entrySet()) {
			System.out.println("Clave: " + elemento.getKey() + 
					", valor: " + elemento.getValue());
		}
	}
}
