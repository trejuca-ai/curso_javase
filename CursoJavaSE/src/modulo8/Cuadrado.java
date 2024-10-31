package modulo8;

public class Cuadrado extends FiguraBidimensional {

	private double lado;

	public Cuadrado() {
		
	}

	public Cuadrado(double lado) {
		this.lado = lado;
	}


	public Cuadrado(double area, double perimetro, double lado) {
		super(area, perimetro);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return calcularArea(lado * lado);
	}

	@Override
	public double calcularPerimetro() {
		return calcularPerimetro(lado * 4);
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + 
				"area=" + getArea() + ", perimetro=" + getPerimetro() + "]";
	}
	
	
}
