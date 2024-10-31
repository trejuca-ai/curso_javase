package modulo4;

public class Fecha {

	private String dia;
	private Integer mes;
	private String anio;
	
	public Fecha() {

	}

	public Fecha(String dia, int mes, String anio) {
		setDia(dia);
		setMes(mes);
		setAnio(anio);
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		if (Integer.parseInt(dia) >= 1 && Integer.parseInt(dia) <= 31) {
			this.dia = dia;
		} else {
			//this.dia = "1";
			System.out.println(
				String.format("El dia %s proporcionado es invalido", dia));
		}
	}

	
	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		} else {
			System.out.println(
					String.format("El mes %s proporcionado es invalido", mes));			
		}
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anio;
	}
}
