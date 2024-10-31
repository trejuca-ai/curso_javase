package modulo8;

public abstract class Figura {

	private double area;
	private double perimetro;
	
	public Figura() {

	}

	public Figura(double area, double perimetro) {
		this.area = area;
		this.perimetro = perimetro;
	}

	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
	double calcularArea(double area) {
		setArea(area);
		return getArea();
	}
	
	double calcularPerimetro(double perimetro) {
		setPerimetro(perimetro);
		return getPerimetro();
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	@Override
	public String toString() {
		return "area=" + area + ", perimetro=" + perimetro;
	}
}
