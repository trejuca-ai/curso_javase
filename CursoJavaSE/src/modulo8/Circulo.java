package modulo8;

import modulo4.Estudiante;

public class Circulo extends FiguraBidimensional {

	private double radio;
	private double circunferencia;
	
	public Circulo() {
		
	}
	
	public Circulo(double radio, double circunferencia) {
		setRadio(radio);
		setCircunferencia(circunferencia);
	}
	
	public Circulo(double radio, double circunferencia, double area, double perimetro) {
		super(area, perimetro);
		setRadio(radio);
		setCircunferencia(circunferencia);
	}
	
	

	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
		 //return calcularArea(Math.PI * Math.pow(radio, 2));
	}


	public double calcularPerimetro() {
		return Math.PI * radio * 2;
		//return calcularPerimetro(Math.PI * radio * 2);
	}

	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getCircunferencia() {
		return circunferencia;
	}
	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}

	@Override
	public String toString() {
		return String.format("Circulo, radio=%s, circunferencia=%s, %s", 
				radio, circunferencia, super.toString());
	}
	
	
}
