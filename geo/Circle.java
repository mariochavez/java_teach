public class Circle {
	double radio = 0;
	double pi = 3.1416;
	
	public Circle() {
		System.out.println("Inicializando objecto de tipo Circle");
	}
		
	public Circle(double radio) {
		System.out.println("Inicializando con radio " + radio);
		this.radio = radio;
	}
	
	public double area() {
		return pi * radio * radio;
	}
	
	public double diameter() {
		return radio + radio;
	}
	
	// Setters y Getters
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getPi() {
		return pi;
	}
	
	public String toString() {
		return buildMessage();
	}
	
	private String buildMessage() {
		String message = "Circle\n" +
		"radio: " + radio + "\n" +
		"pi: " + pi;
		
		return message;
	}
	
	public static double calculaArea(double pi, double r)
	{
		return pi * r * r;
	}
}