package modulo9;

public class Factura implements PorPagar {

	@Override
	public double obtenerMontoPago() {
		return Math.random() * 100;
	}

}
