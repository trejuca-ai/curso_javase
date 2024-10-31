package modulo8;

public class MainFigura {

	public static void main(String[] args) {
		
		// Crear objeto figura
//		Figura figura = new Figura();
//		System.out.println("######## Figura ##########");
//		System.out.println("Area: " + figura.calcularArea());
//		System.out.println("Perimetro: " + figura.calcularPerimetro());
//		System.out.println(figura);
		
		// Crear objeto FiguraBidimensional
//		FiguraBidimensional figuraBidimensional = new FiguraBidimensional();
//		System.out.println("######## FiguraBidimensional ##########");
//		System.out.println("Area: " + figuraBidimensional.calcularArea());
//		System.out.println("Perimetro: " + figuraBidimensional.calcularPerimetro());
//		System.out.println(figuraBidimensional);
		
		// Crear objeto Circulo
		Circulo circulo = new Circulo(23.0,9.0);
		System.out.println("######## Circulo ##########");
		circulo.setArea(circulo.calcularArea());
		circulo.setPerimetro(circulo.calcularPerimetro());
		System.out.println("Area: " + circulo.getArea());
		System.out.println("Perimetro: " + circulo.getPerimetro());
		System.out.println(circulo);
		
		// Crear objeto Cuadrado
		Cuadrado cuadrado = new Cuadrado(34.9);
		System.out.println("######## Cuadrado ##########");
		System.out.println("Area: " + cuadrado.calcularArea());
		System.out.println("Perimetro: " + cuadrado.calcularPerimetro());
		System.out.println(cuadrado);
		
		// Crear objeto Triangulo
		Triangulo triangulo = new Triangulo(21.0,9.0);
		System.out.println("######## Triangulo ##########");
		System.out.println("Area: " + triangulo.calcularArea());
		System.out.println("Perimetro: " + triangulo.calcularPerimetro());
		System.out.println(triangulo);
	}
}
