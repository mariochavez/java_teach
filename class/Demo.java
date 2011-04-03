//imports System;

public class Demo {
	public static void main(String[] args)
	{
		double pi, a, r;
		pi = 3.1416;
		r = Double.parseDouble(args[0]);
		
		a = calculaArea(pi, r);
		System.out.println(a);
	}
	
	public static double calculaArea(double pi, double r)
	{
		return pi * r * r;
	}
}