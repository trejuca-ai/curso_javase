package modulo8;

public class Triangulo extends FiguraBidimensional {

	private double base;
	private double altura;
	
	public Triangulo() {

	}
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Triangulo(double area, double perimetro, double base, double altura) {
		super(area, perimetro);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return calcularArea((base * altura) / 2);
	}

	@Override
	public double calcularPerimetro() {
		return calcularPerimetro(3 * base);
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + 
				"area=" + getArea() + ", perimetro=" + getPerimetro() + "]";
	}
	
	
}
