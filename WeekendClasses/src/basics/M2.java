package basics;

public class M2 {

	public static void main(String[] args) {
		System.out.println(M2.area());
		System.out.println("The modulus of 13%5 is"+M2.mod());
		System.out.println("The division of two numbers"+M2.div());
		System.out.println("The area  of circle"+M2.areaofcircle());

	}
	
	public static int area()
	{
	
	int a,b,c;
	a=10;b=20;
	c=a*b;
	return c;
	}
	private static double mod()
	{
		double d1=13;
		double e1=d1%5;
		return e1;
	}
	public static float div()
	{
		float a,b,c;
		a=10.0f;
		b=5;
		c=a/b;
		return c;
	}
	private static double areaofcircle()
	{
		double d=3.14*3*3;
		return d;
	}
	
	
}
