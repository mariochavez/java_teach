public class Cuad extends Figure {
	protected double side1 = 0;
	protected double side2 = 0;
	
	private Cuad() {}
	
	public Cuad(double side) {
		side1 = side;
		side2 = side;
	}
	
	public Cuad(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public double area() {
		return side1 * side2;
	}
	
	public double perimeter() {
		return (side1 * 2) + (side2 * 2);
	}
	
	protected void print() {
		System.out.println("Hola");
	}
}