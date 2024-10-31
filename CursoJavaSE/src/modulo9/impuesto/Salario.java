package modulo9.impuesto;

public class Salario {

	public static final String DIA = "Dia";
	public static final String SEMANA = "Semana";
	public static final String MES = "Mes";
	
	public static final double ISR = 0.20;
	
	private double salarioNeto;
	private double salarioBruto;
	private String periodicidad;
	
	public Salario() {
		super();
	}

	public Salario(double salarioNeto, double salarioBruto, String periodicidad) {
		super();
		this.salarioNeto = salarioNeto;
		this.salarioBruto = salarioBruto;
		this.periodicidad = periodicidad;
	}
	
	public double getSalarioNeto() {
		return salarioNeto;
	}

	public void setSalarioNeto(double salarioNeto) {
		this.salarioNeto = salarioNeto;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}

	@Override
	public String toString() {
		return "Salario [salarioNeto=" + salarioNeto + ", salarioBruto=" + salarioBruto + ", periodicidad="
				+ periodicidad + "]";
	}
	
	
}
