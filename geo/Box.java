public class Box extends Cuad implements Draw {
	public Box(double side) { 
		super(side);
	}
				
	public double getSide()
	{
		return side1;
	}
	
	public void draw() {
		System.out.println("Drawing ....");
	}
}