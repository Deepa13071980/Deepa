package basics;

public class m1 {

	public static void main(String[] args) {
		m1.reactanglearea();
		m1.average();
		System.out.println(M2.div());
	}
	public static void reactanglearea()
	{
		int a=5,b=2,c;
		c=a*b;
		System.out.println("The area of the rectangle="+c);
		
	}
	private static void average()
	{
		float a1,b1,c1;
		a1=100;
		b1=200;
		c1=300;
		System.out.println("The average of three numbers="+(a1+b1+c1)/3);
	}

}
