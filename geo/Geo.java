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
	}
}