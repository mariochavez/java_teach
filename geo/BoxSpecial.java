public class BoxSpecial extends Box {
	public BoxSpecial(double side) { 
		super(side);
	}
	
	@Override
	public double area() {
		double area = super.area();
		return area * 1.10;
	}
	
	@Override
	public String toString()
	{
		return "Box Especial";
	}
}