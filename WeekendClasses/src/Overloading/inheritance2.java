package Overloading;

public class inheritance2 extends inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
inheritance2.arae1();
inheritance2 ob=new inheritance2();
ob.m1();
ob.area1();
inheritance2.area();
ob.ppn();
inheritance2.pp();
	}
	
	
	
	public static void arae1()
	{
		System.out.println("The are of the chid class");
		
	}
	
	public void m1()
	{
		System.out.println("Non static methods of the child class");
	}

}
