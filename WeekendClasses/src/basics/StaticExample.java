package basics;

public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample.circle();
		System.out.println("Perimeter of square"+StaticExample.square());
		System.out.println("Subraction of two numbers"+StaticExample.pass(6,5));

	}
	public static void circle()
	{
		float r,c,a;
		r=3.14f;
		c=3.0f;
		a=r*c*c;
		System.out.println("The area of the circle"+a);
		
	}
	
	
public static int square()
{
	int a,b;
	a=4;
	b=4;
	return(a*b);
	}
public static double pass(double d1,double d2)
{
	
	return(d1-d2);
	}

}
