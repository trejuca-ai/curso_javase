package modulo12;

public class ExcepcionPersonalizada extends Exception {

	public ExcepcionPersonalizada() {
		super("Excepcion de tipo ExcepcionPersonalizada");
	}
	
	public ExcepcionPersonalizada(String mensaje) {
		super(mensaje);
	}
	
	public ExcepcionPersonalizada(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}
}
