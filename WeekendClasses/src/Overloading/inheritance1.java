package Overloading;

public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inheritance1 ob=new inheritance1();
		ob.area1();
		inheritance1.area();

	}

	public static void area()
	{
		System.out.println("The area of the Parent class");
	}
	public void area1()
	{
		System.out.println("The nonstatci method of the parent");
	}
	protected static void pp()
	{
		System.out.println("The protected method of the parent class");
	}
	protected void ppn()
	{
		System.out.println("The Protected nonstatcic method of the parent");
	}
	
}
