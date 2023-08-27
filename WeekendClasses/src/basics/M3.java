package basics;

public class M3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M3.area(2,3);
		M3.area(5,6);
		M3.info("Deepa",100,1234.56670f);
		System.out.println("The product of two numbers"+M3.add(12,13));

	}
	public static void area(int a,int b)
	{
		System.out.println("Area of triangle"+0.5*a*b);
	}
	private static void info(String Name,int age,float sal) {
		System.out.println("The name is"+Name);
		System.out.println("The age  is"+age);
	System.out.println("The sal is"+sal);
	}
	public static int add(int a,int b) {
		return a*b;
	}
	

}
