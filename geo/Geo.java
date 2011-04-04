public class Geo {
	public static void main(String[] args)
	{	
		//workingWithCircleClass();
		//workingWithCircleObject();
		//workingWithInheritance();
		
		Box box = new Box(2);
		Circle circle = new Circle(4);
		
		printFigureInfo(box);
		printFigureInfo(circle);
		
	}
	
	public static <T> void printFigureInfo(T figure) {
		if (figure.getClass().getName() == "Circle") {
			printFigureInfo2((Circle)figure);
		} else
		{
			printFigureInfo1((Box)figure);
		}
	}
	
	public static void printFigureInfo1(Box box) {
		System.out.println(box.getSide());
	}
	
	public static void printFigureInfo2(Circle circle) {
		System.out.println(circle.getRadio());
	}
	
	public static void drawFigure(Draw figure) {
		figure.draw();
	}
	
	public static void printData(Figure figure) {
		System.out.println(figure.area());
		System.out.println(figure.perimeter());
		System.out.println(figure.toString());
	}
	
	public static void workingWithInheritance()
	{
		Box box = new Box(4.3);
		drawFigure(box);
		printData(box);
		System.out.println(box.getSide());
		
		Rectangle rectangle = new Rectangle(4.3, 2);
		printData(rectangle);
		System.out.println(rectangle.getSide1());
		System.out.println(rectangle.getSide2());
		
		Circle circle = new Circle(3);
		printData(circle);
		
		System.out.println("*************");
		BoxSpecial boxSpecial = new BoxSpecial(3);
		drawFigure(boxSpecial);
		printData(boxSpecial);
	}
	
	public static void workingWithCircleObject()
	{
		Circle c1 = new Circle(3.4);
		System.out.println("Area de mi objeto Circle es " + c1.area());
		
		Circle c2 = new Circle(7.6);
		System.out.println("Area de mi objeto Circle es " + c2.area());
		
		System.out.println(c1.getRadio());
		System.out.println(c2.getRadio());
		
		c1.setRadio(5.8);
		System.out.println("Area de mi objeto Circle es " + c1.area());
		
		System.out.println(c2.toString());		
	}
	
	public static void workingWithCircleClass()
	{
		double pi, a, r;
		pi = 3.1416;
		r = 3;
		
		a = Circle.calculaArea(pi, r);
		System.out.println(a);		
	}
}