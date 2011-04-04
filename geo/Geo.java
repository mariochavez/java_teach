public class Geo {
	public static void main(String[] args)
	{
		double pi, a, r, l;
		pi = 3.1416;
		r = 3;
		l = 5;
		
		a = Circle.calculaArea(pi, r);
		System.out.println(a);
		
		a = Box.calculaArea(l);
		System.out.println(a);
		
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
}